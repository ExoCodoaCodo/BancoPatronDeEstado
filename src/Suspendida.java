/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Suspendida implements EstadoVentanilla{
    
    @Override
    public void atende(Persona persona){
    
        if(persona.getEdad()>65){
        
            System.out.println("Atiendo a " + persona.getNombre());
        }
        else{
        
            System.out.println("Espere 5 minutos");
        }
    }
    
}
