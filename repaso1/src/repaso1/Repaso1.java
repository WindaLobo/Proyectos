package repaso1;

import javax.swing.JOptionPane;

public class Repaso1 {

    public static void main(String[] args) {
        // bucle1();
        // bucle2();
        // bucle3();
        //bucle4();
        //bucle5();
        //bucle6();
        //bucle7();
        bucle8();

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
        for (int i = 0; i < 4; i++) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog(" Introduce un nuemero "));
            System.out.println(numero);

        }
    }

    private static void bucle5() {
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog(" Introduce un nuemro "));
            sum += numero;
            System.out.println(sum);

        }

    }

    private static void bucle6() {

        double ladoCuadrado = Double.parseDouble(JOptionPane.showInputDialog(" Introduce el lado de un cuadrado "));
        double area = ladoCuadrado * ladoCuadrado;
        System.out.println("EL area d e un cuadrado es : " + area);

    }

    private static void bucle7() {

        double ladoCuadrado;
        do {
            ladoCuadrado = Double.parseDouble(JOptionPane.showInputDialog(" Introduce el lado de un cuadrado "));
            if (ladoCuadrado > 0) {
                double area = ladoCuadrado * ladoCuadrado;
                System.out.println("EL area d e un cuadrado es : " + area);
                break;
            } else {
                System.out.println("Introduce el lado del cuadrado que sea  positivo ");
            }

        } while (ladoCuadrado < 0);

    }

    private static void bucle8() {
        double ladoCuadrado;

        do {

            ladoCuadrado = Double.parseDouble(JOptionPane.showInputDialog(" Introduce el lado de un cuadrado "));
            if (ladoCuadrado > 0) {
                double area = ladoCuadrado * ladoCuadrado;
                System.out.println("EL area d e un cuadrado es : " + area);
            }

        } while (ladoCuadrado > 0);
    }

}

/* 1)Sacar por consola 5 veces a frase “ isto e un bucle 
2) visualizar   5 números  que pides por teclado 
3) visualiza varios números que pides por teclado , remata cando premes o cero 
4) visualiza 4 numeros   que entren por teclado . Os números non poden ser negativos 
5)completa o exercicio anterior visualizando ademáis a suma dos 4 números
6) Calcula o área dun cadrado . O valor do lado o pides por teclado
7) Codifica o programa anterior tendo en conta que o lado non pode ser negativo .
8) Completa o programa anterior para que calcule o área de varios cadrados .
Remata o programa cando o valor do lado sexa 0 ( condición de fin ).
9)Sumar unha serie de números que pedimos por teclado . Cando a suma sexa 100 ou superior visualizamos o resultado 
.*/
 
