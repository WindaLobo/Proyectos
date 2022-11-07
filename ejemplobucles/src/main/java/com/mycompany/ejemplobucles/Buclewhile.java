
package com.mycompany.ejemplobucles;

import javax.swing.JOptionPane;


public class Buclewhile {
    public void verNumero(){
        
        int numero;
         numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero positivo: "));
         while(numero>=0){
             System.out.println(numero);
    
         numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero positivo: "));
         }
         
         System.out.println("Salimos del bucle");
    }
    
}
