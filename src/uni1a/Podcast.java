package uni1a;

public class Podcast extends ContenidoAudiovisual {
    private String host;
    private int numeroEpisodio;

    public Podcast(String titulo, int duracionEnMinutos, String genero, String host, int numeroEpisodio) {
        super(titulo, duracionEnMinutos, genero);
        this.host = host;
        this.numeroEpisodio = numeroEpisodio;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getNumeroEpisodio() {
        return numeroEpisodio;
    }

    public void setNumeroEpisodio(int numeroEpisodio) {
        this.numeroEpisodio = numeroEpisodio;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Podcast:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Host / Conductor: " + host);
        System.out.println("Episodio N°: " + numeroEpisodio);
        System.out.println();
    }
}