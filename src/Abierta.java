/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Abierta implements EstadoVentanilla {
    
    @Override
    public void atende(Persona persona){
    
        System.out.println("Atiendo a :"+persona.getNombre());
    }
}
