package repaso1;

import javax.swing.JOptionPane;

public class Repaso1 {

    public static void main(String[] args) {
        bucle1();
        bucle2();
        bucle3();
    }

    private static void bucle1() {
        int numero = 5;
        for (int i = 0; i < numero; i++) {
            JOptionPane.showMessageDialog(null, "Esto es un bucles");
            System.out.println(i);
        }
    }

    private static void bucle2() {
        int i = 0;
        int numero = Integer.parseInt(JOptionPane.showInputDialog(" Introduce un nuemro "));
        do {
            System.out.println(numero);
            numero = Integer.parseInt(JOptionPane.showInputDialog(" Introduce un nuemro "));
            i++;
        } while (i < 5);

    }

    private static void bucle3() {

        int i = 0;
        int numero = Integer.parseInt(JOptionPane.showInputDialog(" Introduce un nuemro "));
        do {
            System.out.println(numero);
            numero = Integer.parseInt(JOptionPane.showInputDialog(" Introduce un nuemro "));
            i++;
        } while (numero != 0);

    }

    private static void bucle4() {
        int numero;
        do {

            numero = Integer.parseInt(JOptionPane.showInputDialog(" Introduce un nuemro "));
            if (numero > 0) {
                System.out.println(numero);
            } else if (numero != 0) {
                numero = Integer.parseInt(JOptionPane.showInputDialog(" Introduce un nuemro positivo "));
                break;

            
            }
        } while (numero != 0);

    }

}

/*-1)Sacar por consola 5 veces a frase “ isto e un bucle “ . 
2) visualizar   5 números  que pides por teclado .
3) visualiza varios números que pides por teclado , remata cando premes o cero .
4) visualiza 4 numeros   que entren por teclado . Os números non poden ser negativos  */
