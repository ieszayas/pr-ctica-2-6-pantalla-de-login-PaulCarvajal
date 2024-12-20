package modelo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestorBBDD {

    private GestorBBDD() {

    }

    private static Connection con = null;
    private static final String NOMBRE_BBDD = "lista_usuarios;";

    public static Connection getConexion() {
        if (con == null) {
            try {
                //Establecer conexión JDBC
                //se debe conectar al puerto 3306
//                String url = "jdbc:mysql://localhost:3306";
//                String usuario = "root";
//                String contrasenia = null;

                //formato con Propierties
                FileInputStream fis = new FileInputStream("CONFIGURACION/config.properties");
                Properties propiedades = new Properties();
                propiedades.load(fis);
                
                String url = propiedades.getProperty("url");
                String usuario = propiedades.getProperty("username");
                String contrasenia = propiedades.getProperty("password");
                
                con = DriverManager.getConnection(url, usuario, contrasenia); //la contraseña de root es null
                
                System.out.println("Conexion Exitosa con la base de datos");
            } catch (SQLException e) {
                System.out.println("Error al crear la conexion" + e.toString());
                e.printStackTrace();//muestra toda la info de la excepcion en rojo
            } catch (FileNotFoundException ex) {
                Logger.getLogger(GestorBBDD.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(GestorBBDD.class.getName()).log(Level.SEVERE, null, ex);
            
            }
        }
        return con;
    }

    public static void desconectarBBDD() {
        Connection con = getConexion();
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            System.out.println("Error al cerrar conexion");
            System.out.println(ex.toString());
        }
    }

    public static void crearBD() {
        Connection con = getConexion();  //lo usamos siempre para conectar con la bbdd
        PreparedStatement pstm = null;
        PreparedStatement uses = null;

        try {

            pstm = con.prepareStatement("CREATE DATABASE IF NOT EXISTS " + NOMBRE_BBDD);

            uses = con.prepareStatement("USE " + NOMBRE_BBDD);

            pstm.executeUpdate();
            uses.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al crear la base de datos.");
        } finally {
            // Cerrar recursos
            try {
                if (pstm != null) {
                    pstm.close();
                }
//                if (con != null) {
//                    con.close();
//                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        crearTablaUsuariosHarcodeados();
    }

    public static void crearTablaUsuariosHarcodeados() {
        Connection con = getConexion();
        PreparedStatement pstm = null;

        try {
            pstm = con.prepareStatement("CREATE TABLE IF NOT EXISTS Usuarios("
                    + "usuario VARCHAR (20) PRIMARY KEY, "
                    + "contraseña VARCHAR (30),"
                    + "nombre VARCHAR (20), "
                    + "apellido VARCHAR (30), "
                    + "fecha_nacimiento DATE, "
                    + "correo VARCHAR (20));");
            pstm.executeUpdate();
            
            pstm = con.prepareStatement("INSERT IGNORE INTO Usuarios (usuario, contraseña, nombre, apellido, fecha_nacimiento, correo) "
                    + "VALUES ('Pol', '1234', null, null, null, null), "
                    + "('Kevin', '1234', null, null, null, null), "
                    + "('Adriana', '1234', null, null, null, null), "
                    + "('Jorge', '1234', null, null, null, null);");
            pstm.executeUpdate();
        } catch (SQLException e) {
            System.out.println("No se ha podido crear la Tabla usuarios");
            System.out.println(e.getMessage());
        } finally {
            try {
                if(pstm != null){
                    pstm.close();
                }
            } catch (SQLException e) {
                System.out.println("No se han podido cerrar los recursos");
            }
        }
    }
    public static ArrayList<Usuario> cargarUsuarios() {
        Connection con = getConexion();
        ArrayList<Usuario> usuarios = new ArrayList();
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {
            String myQueryPrepared = "SELECT * FROM usuarios";
            pstm = con.prepareStatement(myQueryPrepared);

            rs = pstm.executeQuery();

            while (rs.next()) {
                String nick = rs.getString("usuario");
                String contraseña = rs.getString("contraseña");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                Date fecha = rs.getDate("fecha_nacimiento");
                String correo = rs.getString("correo");
                Usuario u1 = new Usuario(nick, contraseña, nombre, apellido, fecha, correo);
                usuarios.add(u1);
            }

        } catch (SQLException e) {
            System.out.println("Usuarios no cargados" + e.toString());
            e.printStackTrace();//muestra toda la info de la excepcion en rojo
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                System.out.println("Error al cerrar conexion");
                System.out.println(ex.toString());
            }
        }
        return usuarios;
    }
    
    public static void crearNuevoUsuario(String usuario, String contraseña, String nombre, String apellido, Date fecha, String correo ){
        Connection con  = getConexion();
        PreparedStatement pstm = null;
        
        try {
            pstm = con.prepareStatement("INSERT INTO usuarios (usuario, contraseña, nombre, apellido, fecha_nacimiento, correo) "
                    + "VALUES (?, ?, ?, ?, ?, ?);");
            pstm.setString(1, usuario);
            pstm.setString(2, contraseña);
            
            //Comprobacion nombre
            if(nombre != null && !nombre.trim().isEmpty()){
                pstm.setString(3, nombre);
            }else{
                pstm.setNull(3, java.sql.Types.VARCHAR);
            }
            
            //Comprobacion apellido
            if(apellido != null && !apellido.trim().isEmpty()){
                pstm.setString(4, apellido);
            }else{
               pstm.setNull(4, java.sql.Types.VARCHAR);
            }
            
            //no se como poner null de otra forma, asi solamente se pone un espacio en blanco
            //pstm.setString(4, null);
            
            
            //Comprobacion fecha          
            if(fecha != null){
                pstm.setDate(5, new java.sql.Date(fecha.getTime())); //getTime te convierte el valor a long que es lo que lee la conversion en la BBDD
            }else{
                pstm.setNull(5, java.sql.Types.DATE);
            }
            
            
            //Comprobacion correo
            if(correo != null && !correo.trim().isEmpty()){
                pstm.setString(6, correo);
            }else{
                pstm.setNull(6, java.sql.Types.VARCHAR);
            }
            
            pstm.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("No se ha podido crear el usuario " + usuario);
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if(pstm != null){
                    pstm.close();
                }
            } catch (SQLException e) {
                System.out.println("No se han podido cerrar los recursos");
                System.out.println(e.getMessage());
            }
        }
    }
     
    public static boolean controlExisteUsuario(String usuario){
        Connection con =  getConexion();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        try {
            pstm = con.prepareStatement("SELECT * FROM usuarios WHERE usuario = ?");
            pstm.setString(1, usuario);
            rs = pstm.executeQuery();
            
            while (rs.next()) {                
                return true;
            }
            
            
        } catch (SQLException e) {
            System.out.println("Algo ha ocurrido al revisar si existe el usuario");
            System.out.println(e.getMessage());
        } finally {
            try {
                if(pstm != null){
                    pstm.close();
                }
            } catch (SQLException e) {
                System.out.println("No se han podido cerrar los recursos");
                System.out.println(e.getMessage());
            }
        }
        
        return false;
    }
    
    public static void cambiarContraseña(String contraseña, String usuario){
        Connection con = getConexion();
        PreparedStatement pstm = null;
        
        try {
            pstm = con.prepareStatement("UPDATE usuarios SET contraseña = ? WHERE usuario = ?");
            pstm.setString(1, contraseña);
            pstm.setString(2, usuario);
            
            pstm.executeUpdate();
        } catch (SQLException e) {
            System.out.println("No se ha podido cambiar la contraseña");
            System.out.println(e.getMessage());
        } finally {
            try {
                if(pstm != null){
                    pstm.close();
                }
            } catch (SQLException e) {
                System.out.println("No se han podido cerrar los recursos");
                System.out.println(e.getMessage());
            }
        }
    }
}
