package poo;
import uni1a.*;

public class PruebaAudioVisual {
	public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");
        System.out.println();

        // Crear un arreglo de ContenidoAudiovisual de tamaño 5 para aplicar Polimorfismo
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];

        // 1. Película (Incluye Asociación con Actor)
        Pelicula pelicula = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
        pelicula.agregarActor(new Actor("Sam Worthington", "Británica-Australiana"));
        pelicula.agregarActor(new Actor("Zoe Saldana", "Estadounidense"));
        contenidos[0] = pelicula;

        // 2. Serie de TV (Incluye Agregación con Temporada)
        SerieDeTV serie = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8);
        serie.agregarTemporada(new Temporada(1, 10));
        serie.agregarTemporada(new Temporada(2, 10));
        contenidos[1] = serie;

        // 3. Documental (Incluye Composición con Investigador)
        Documental documental = new Documental("Cosmos", 45, "Science", "Astronomy");
        documental.agregarInvestigador(new Investigador("Carl Sagan", "Astrofísica y Cosmología"));
        contenidos[2] = documental;

        // 4. Podcast (Subclase original de iniciativa propia - Etapa 4)
        Podcast podcast = new Podcast("Tecnología al Día", 45, "Tecnología", "Martín Durán", 12);
        contenidos[3] = podcast;

        // 5. Audiolibro (Subclase original de iniciativa propia - Etapa 4)
        Audiolibro audiolibro = new Audiolibro("El Hobbit", 360, "Fantasía", "J.R.R. Tolkien", "Rob Inglis");
        contenidos[4] = audiolibro;

        // Mostrar los detalles de cada contenido audiovisual usando Polimorfismo
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
}
