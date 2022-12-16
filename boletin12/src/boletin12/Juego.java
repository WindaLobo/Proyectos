package boletin12;

import javax.swing.JOptionPane;

public class Juego {

    public void juegoadivinador() {
        int numeroA = (int) ((Math.random() * 50 - 1) + 1);
        int numeroIntoducido;
        int contadorNumero;

        JOptionPane.showMessageDialog(null, "********** El juego comsiste en adivinar un numero hasta el 50 *********");
        JOptionPane.showMessageDialog(null, " Debes adivinar  un numero del 1 al 50 ");
        int intentos = Integer.parseInt(JOptionPane.showInputDialog("Cuantos intentos quieres hacer "));

        numeroIntoducido = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero  "));

        for (contadorNumero = 0; contadorNumero < intentos; contadorNumero++) {
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
