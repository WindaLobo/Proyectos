package boletin12;

import javax.swing.JOptionPane;

public class Jugadores2 {

    public void juegoadivinador2() {
        int numeroA;
        int numeroIntoducido;
        int contadorNumero;

        JOptionPane.showMessageDialog(null, "********** El juego comsiste en adivinar un numero hasta el 50 *********");
        JOptionPane.showMessageDialog(null, " Debes adivinar  un numero del 1 al 50 ");
        int intentos = Integer.parseInt(JOptionPane.showInputDialog("Cuantos intentos quieres hacer "));
        numeroA = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero  "));

        for (contadorNumero = 0; contadorNumero < intentos; contadorNumero++) {
            numeroIntoducido = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero  "));
            if (numeroA == numeroIntoducido) {

                JOptionPane.showMessageDialog(null, "Has acertado");
                break;
            } else if (contadorNumero == intentos) {

                JOptionPane.showMessageDialog(null, "Lo siento has perdido el nuemro era " + numeroA);
                break;
            } else if (numeroA > numeroIntoducido) {
                JOptionPane.showMessageDialog(null, "El numero secreto es Mayor que " + numeroIntoducido);
            } else if (numeroA < numeroIntoducido) {
                JOptionPane.showMessageDialog(null, "El numero secreto es Menor que" + numeroIntoducido);
            }

            if (contadorNumero <= 1) {
                JOptionPane.showMessageDialog(null, "otro intento");

                numeroIntoducido = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero  "));

            } else if (contadorNumero == 2) {
                int x = (int) (numeroA / 10);
                JOptionPane.showMessageDialog(null, "Una pista la primera cifra es " + x);
                JOptionPane.showMessageDialog(null, "Intetalo de nuevo");

                numeroIntoducido = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero  "));
            } else if (contadorNumero >= 3) {

                JOptionPane.showMessageDialog(null, "ultimo intento");
                numeroIntoducido = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero  "));
                JOptionPane.showMessageDialog(null, "Haz fallado");

            }

        }

    }
}



    /* 1- Codifica un programa que permita el siguiente juego  para adivinar un número .
El primer jugador  teclea ( utilizando la clase JoptionPane ), un número a adivinar ( entre 1 y 50 ) 
y el número máximo de intentos que tiene el segundo jugador para dar con él . El programa irá sacando por pantaia
mensajes que orienten el segundo jugador sobre se el número tecleado y mayor o menor que el número a adivinar . Hace el programa repetitivo
.*/
