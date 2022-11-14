package com.mycompany.practica;


import javax.swing.JOptionPane;

public class Frases {

    public void numeroDeFrases() {

        String frases = JOptionPane.showInputDialog("introduce una frace");

        int numeroDePalabras = frases.length();
        System.out.println(numeroDePalabras);
        
       String[] numeroDeCaracteres = frases.split("frases");
  
        for (String  a :numeroDeCaracteres)
            System.out.println(Integer.parseInt)(a));
    }
}
    

}

/*3. Crear un programa que solicite al usuario una frase y muestre la siguiente
información: (Total : 2 ptos)
a. Número de palabras introducidas. (0,5 ptos)(listo)
b. Número de caracteres no espacios.(0,5 ptos)
c. Que muestre true si la primera letra es un dígito y false si no lo es.. (0,5 ptos)
d. Posición del primer espacio. (0,5 ptos)*/
