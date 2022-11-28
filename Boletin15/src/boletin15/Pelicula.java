package boletin15;

public class Pelicula extends Multimedia {

    private String actorPrincipal;
    private String actrizPrincipal;

    public Pelicula(String actorPrincipal, String actrizPrincipal, String titulo, String autor, String formato, float duracion) {
        super(titulo, autor, formato, duracion);
        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;
    }

    public Pelicula() {
    }

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    public void setActorPrincipal(String actorPrincipal) {
        this.actorPrincipal = actorPrincipal;
    }

    public void setActrizPrincipal(String actrizPrincipal) {
        this.actrizPrincipal = actrizPrincipal;
    }

    @Override
    public String toString() {
        return (super.toString()) + " \n actorPrincipal : " + actorPrincipal + "\n actrizPrincipal : " + actrizPrincipal;
    }

}
