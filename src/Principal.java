/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Principal {
    
    public static void main(String [] args){
    
    Persona persona1 = new Persona("Alejandro","zapata",36);
    
    Banco banco1 = new Banco();
    banco1.atende(persona1);
    
    }
    
    
    
}
