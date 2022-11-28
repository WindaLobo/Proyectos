package boletin15;

public class Disco extends Multimedia {

    private String genero;

    public Disco(String genero, String titulo, String autor, String formato, float duracion) {
        super(titulo, autor, formato, duracion);
        this.genero = genero;
    }

    public Disco() {

    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return (super.toString()) + " \n genero : " + genero;
    }

}
