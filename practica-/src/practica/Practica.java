package practica;

import javax.swing.JOptionPane;

public class Practica {

    public static void main(String[] args) {
        // ejercio1();
        // ejercio2();
        //ejercio3();
        //ejercio4();
        // ejercio5();
        //ejercio6();
        //ejercio7();
        //ejercio8();
        //ejercio9();
        //ejercio10();
        // ejercio11();
        //ejercio12();
        //ejercio12_A();
        ejercio13();
        //ejercio14();

    }

    private static void ejercio1() {
        int numero1 = (int) Double.parseDouble(JOptionPane.showInputDialog("Escribe un numero"));

        int numero2 = (int) Double.parseDouble(JOptionPane.showInputDialog("Escribe un numero"));

        System.out.println("La suma es " + (numero1 + numero2));

        System.out.println("La resta es " + (numero1 - numero2));

        System.out.println("La Multiplicacion  es " + (numero1 * numero2));

        System.out.println("La division  es " + (numero1 / numero2));

        System.out.println("El modulo  es " + (numero1 % numero2));

    }

    private static void ejercio2() {

        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Escribe un numero"));

        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Escribe un numero"));
        if (numero1 > numero2) {

            System.out.println("EL numero mayor es es el numero1 ");
        } else if (numero1 < numero2) {
            System.out.println("EL numero mayor es  es el  numero2  ");

        } else {
            System.out.println(" Ambos son iguales ");

        }
    }

    private static void ejercio3() {

        String nombre = JOptionPane.showInputDialog("Escribe tu nombre ");

        JOptionPane.showMessageDialog(null, "  <<  Bienvenida " + nombre + " >> ");

    }

    private static void ejercio4() {

        double radioCirculo = Double.parseDouble(JOptionPane.showInputDialog("Escribe el radio de la circuferencia "));
        double areaCirculo = Math.PI * Math.pow(radioCirculo, 2);

        JOptionPane.showMessageDialog(null, " El radio es  " + radioCirculo + " \n" + " El area es : " + areaCirculo);

    }

    private static void ejercio5() {

        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Escribe un numero"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Escribe un numero"));

        if (numero1 % 2 == 0) {
            System.out.println("EL numero es divisibles ");
        } else {
            System.out.println("EL numero no es divisibles ");

        }

    }

    private static void ejercio6() {

        final double iva = 0.21;
        double precio;
        String elegir;
        do {
            elegir = JOptionPane.showInputDialog("quieres calcular un precio(Si/No) ");

            if (elegir.toUpperCase().equals("SI")) {
                int opcion = Integer.parseInt(JOptionPane.showInputDialog("quieres el precio sin iva marcas (1) o con iva marcas  (2) "));

                switch (opcion) {

                    case 1:
                        precio = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el precio"));
                        JOptionPane.showMessageDialog(null, " El precio sin iva es  " + precio);
                        break;

                    case 2:

                        precio = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el precio"));
                        double precioConIva = precio + (precio * iva);
                        JOptionPane.showMessageDialog(null, " El precio  Con iva es: " + precioConIva);

                }

            }

        } while (elegir.toUpperCase().equals("SI"));
    }

    private static void ejercio7() {
        int numero = 100;
        int i = 1;

        while (numero >= i) {
            System.out.println(i);
            i++;

        }

    }

    private static void ejercio8() {
        int numero = 100;
        int i = 1;
        do {
            System.out.println(i);
            i++;

        } while (numero >= i);

        for (i = 1; numero >= i; i++) {

            System.out.println(i);

        }

    }

    private static void ejercio9() {

        int numero = 100;
        int numero2 = 2;
        int numero3 = 3;
        int i = 1;
        do {
            if (i % numero2 == 0) {
                System.out.println("EL numero " + i + " es divisibles con el 2 ");
            } else if (i % numero3 == 0) {
                System.out.println("EL numero " + i + " es divisibles con el 3 ");

            } else {
                System.out.println("EL numero " + i + " no es divisibles ");
            }

            i++;

        } while (numero >= i);

    }

    private static void ejercio10() {

        int precioDeVentas = 0;
        int i = 0;
        int cuantasVentas = Integer.parseInt(JOptionPane.showInputDialog("Introduce cantidad vetas"));
        while (cuantasVentas > i) {
            precioDeVentas += Integer.parseInt(JOptionPane.showInputDialog("Introduce el precio de  vetas"));
            i++;

        }
        System.out.println("EL total de  ventas es " + (precioDeVentas));

    }

    private static void ejercio11() {

        double a = Double.parseDouble(JOptionPane.showInputDialog("Introduce a"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Introduce b"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Introduce c"));
        double discriminante = (Math.pow(b, 2) - (4 * a * c));
        System.out.println("La raiz cuadrada es  : " + discriminante);

        if (discriminante > 0) {

            double numero1 = ((b * (-1)) + Math.sqrt(discriminante)) / (2 * a);

            System.out.println(" La operacionde la raiz es " + numero1);

        } else {
            System.out.println("La operacionde la raiz es negativo ");

        }

    }

    private static void ejercio12() {
        String contraseña = "windar";
        int intentos = 3;
        int i;
        String introducirContraseña;
        int intentosTotal;

        for (i = 1; intentos >= i; i++) {
            introducirContraseña = JOptionPane.showInputDialog(" Introduce una contraseña");
            intentosTotal = intentos - i;

            if (contraseña.equals(introducirContraseña)) {
                System.out.println(" « Enhorabuena has acertado » ");
                break;
            } else {
                JOptionPane.showMessageDialog(null, " Solo tienes " + intentosTotal);
                System.out.println("La contarseña es incorrecta");
            }
        }

    }

    private static void ejercio12_A() {
        final String contraseña = "windar";
        final int maxIntentos = 3;

        for (int i = 1; i <= maxIntentos; i++) {
            String introducirContraseña = JOptionPane.showInputDialog(" Introduce una contraseña");

            if (contraseña.equals(introducirContraseña)) {
                System.out.println(" « Enhorabuena has acertado » ");
                break;
            } else {
                JOptionPane.showMessageDialog(null, " Solo tienes " + (maxIntentos - i));
                System.out.println("La contarseña es incorrecta");
            }
        }
    }

    private static void ejercio13() {
        String confirmacion;
        String dia;
        do {
            confirmacion = JOptionPane.showInputDialog("<<<<< Quieres ver un dia de la semana (SI/NO) >>>>");
            if (confirmacion.equalsIgnoreCase("SI")) {

                dia = JOptionPane.showInputDialog("<<<<< Que dias de la semanas deseas  marcar >>>> ");
                switch (dia.toLowerCase()) {
                    case "lunes":
                        System.out.println("Dia laborar");
                        break;
                    case "martes":
                        System.out.println("Dia laborar");
                        break;
                    case "miercoles":
                        System.out.println("Dia laborar");
                        break;
                    case "jueves":
                        System.out.println("Dia laborar");
                        break;
                    case "viernes":
                        System.out.println("Dia laborar");
                        break;
                    case "sabados":
                        System.out.println("Dia no laborar");
                        break;
                    case "domingo":
                        System.out.println(" Dia no  laborar");
                        break;
                }
            }
        } while (confirmacion.equalsIgnoreCase("SI"));
    }

    private static void ejercio14() {

    }

}
