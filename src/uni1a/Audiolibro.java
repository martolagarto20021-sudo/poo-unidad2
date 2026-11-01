package uni1a;

public class Audiolibro extends ContenidoAudiovisual {
    private String autorLibro;
    private String narrador;

    public Audiolibro(String titulo, int duracionEnMinutos, String genero, String autorLibro, String narrador) {
        super(titulo, duracionEnMinutos, genero);
        this.autorLibro = autorLibro;
        this.narrador = narrador;
    }

    public String getAutorLibro() {
        return autorLibro;
    }

    public void setAutorLibro(String autorLibro) {
        this.autorLibro = autorLibro;
    }

    public String getNarrador() {
        return narrador;
    }

    public void setNarrador(String narrador) {
        this.narrador = narrador;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Audiolibro:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Autor del libro: " + autorLibro);
        System.out.println("Narrador: " + narrador);
        System.out.println();
    }
}