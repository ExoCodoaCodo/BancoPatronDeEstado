/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    
    public Persona (String nombre, String apellido, int edad){
        
           setApellido(apellido);
           setNombre(nombre);
           setEdad(edad);
    }
    
    public  String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public  String getApellido(){
        return apellido;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    
}
