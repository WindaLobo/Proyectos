/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Buclewhile {
     public void verNumero(){
        
        int numero;
         numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero positivo: "));
         while(numero>=0){
             System.out.println(numero);
    
        // numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero positivo: "));
        
        //numero= Bucles.pedirEntero();
         }
         
         System.out.println("Salimos del bucle");
    }
    
}
