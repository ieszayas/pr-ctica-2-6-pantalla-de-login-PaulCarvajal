package modelo;

import java.util.ArrayList;
import java.util.Date;
import static modelo.GestorBBDD.cargarUsuarios;

public class Usuario {
    private String usuario;
    private String contrasenia;
    private String nombre;
    private String apellido;
    private Date fecha_nacimiento;
    private String correo;
    
    public Usuario(String usuario, String contrasenia, String nombre, String apellido, Date fecha_nacimiento, String correo){
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.correo = correo;
    }
    
    public Usuario(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", contrasenia=" + contrasenia + '}';
    }
    
    
    public static ArrayList<Usuario> usuariosHarcodeados(){
        ArrayList<Usuario> usuarios = cargarUsuarios();
        return usuarios;
    }
    
            
}
