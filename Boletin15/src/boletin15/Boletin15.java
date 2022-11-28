package boletin15;

import javax.swing.JOptionPane;

public class Boletin15 {

    public static void main(String[] args) {

        String genero = JOptionPane.showInputDialog("Escribe un genero musical");
        String titulo = JOptionPane.showInputDialog("Escribe un titulo musical");
        String autor = JOptionPane.showInputDialog("Escribe un autor musical");
        String formato = JOptionPane.showInputDialog("Escribe un formato musical");
        
         String actorPrincipal= JOptionPane.showInputDialog("Escribe un actorPrincipal");
        String actrizPrincipal= JOptionPane.showInputDialog("Escribe una  actrizPrincipal");
        String tituloPelicula = JOptionPane.showInputDialog("Escribe un titulo de la pelicula");
        String  autorPelicula = JOptionPane.showInputDialog("Escribe un autor de la pelicula ");
        String formatoPelicula = JOptionPane.showInputDialog("Escribe un formato de la pelicula ");

        Pelicula peli = new Pelicula( actorPrincipal, actrizPrincipal,  tituloPelicula, autorPelicula, formatoPelicula, 126.00f);
        System.out.println("La pelicula es \n " + peli.toString());
        
        
        Disco disco = new Disco(genero, titulo, autor, formato, 1.30f);
        System.out.println("El disco es \n " + disco.toString());

    }

}
