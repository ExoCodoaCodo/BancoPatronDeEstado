/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Ventanilla {
    
    private String cajero;
    private EstadoVentanilla estado;
    
    public Ventanilla(){
        
        estado = new Abierta();
    }
    
    public void suspendete(){
    
        estado = new Suspendida();
    }
    
     public void cerrate(){
    
        estado = new Cerrada();
    }
    
    public void abrite(){
    
        estado = new Abierta();
    }
    
    public void atende(Persona persona){
    
        estado.atende(persona);
    }
    
    public String getCajero(){
    
        return cajero;
    }
    
     public void setCajero(String cajero){
    
        this.cajero = cajero;
    }
    
}
