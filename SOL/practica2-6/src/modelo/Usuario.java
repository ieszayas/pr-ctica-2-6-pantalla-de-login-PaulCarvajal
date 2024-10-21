package modelo;

import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private String contrasenia;
    
    public Usuario(String nombre, String contrasenia){
        this.nombre = nombre;
        this.contrasenia = contrasenia;
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
        ArrayList<Usuario> usuarios = new ArrayList();
        usuarios.add(new Usuario("Pol", "1234"));
        usuarios.add(new Usuario("Kevin", "5678"));
        usuarios.add(new Usuario("Adriana", "1234"));
        usuarios.add(new Usuario("Jorge", "5678"));
        return usuarios;
    }
    
            
}