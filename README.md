# Sistema de Gestión de Contenidos Audiovisuales - UPS POO Unidad 2

## 1. Descripción del Proyecto
- **Propósito de la Aplicación:** Gestionar, modelar y clasificar un catálogo diverso de contenidos multimedia mediante la implementación de los principios de la Programación Orientada a Objetos (POO) en Java.
- **Características Principales:**
  - Aplica los pilares de la POO: Herencia, Encapsulamiento, Abstracción y Polimorfismo.
  - Modela relaciones estructurales complejas entre entidades (Asociación, Agregación y Composición).
- **Problema que Resuelve:** Permite integrar y procesar dinámicamente diferentes tipos de producciones (Películas, Series, Documentales, Podcasts y Audiolibros) dentro de un mismo sistema unificado sin alterar el código fuente base.

---

## 2. Objetivos del Proyecto
- Implementar la arquitectura de software basada en el diagrama de clases de la Unidad 2.
- Incorporar subclases personalizadas originales como iniciativa del estudiante (Podcast y Audiolibro).
- Demostrar el comportamiento polimórfico en tiempo de ejecución procesando un arreglo uniforme de objetos audiovisuales.

---

## 3. Clases y Funcionalidades Nuevas Añadidas (Iniciativa Estudiantil)
Además de las clases base del proyecto, se crearon dos nuevas subclases que heredan de ContenidoAudiovisual:
- **Podcast**: Modela contenidos de audio episódicos.
  - *Atributos:* host (String), numeroEpisodio (int).
- **Audiolibro**: Modela producciones literarias narradas.
  - *Atributos:* autorLibro (String), narrador (String).

---

## 4. Estructura de Carpetas
El repositorio sigue una organización modular limpia dentro del proyecto:

- `src/`
  - `poo/`
    - `PruebaAudioVisual.java` (Clase principal de ejecución)
  - `uni1a/`
    - `Actor.java`
    - `Audiolibro.java`
    - `ContenidoAudiovisual.java`
    - `Documental.java`
    - `Investigador.java`
    - `Pelicula.java`
    - `Podcast.java`
    - `SerieDeTV.java`
    - `Temporada.java`

---

## 5. Instrucciones de Instalación y Uso

### Prerrequisitos
- **Java Development Kit (JDK):** Versión 17 o superior.
- **IDE Recomendado:** Eclipse IDE para desarrolladores Java.

### Guía Paso a Paso
1. **Clonar el Repositorio:**
   `git clone https://github.com/martolagarto20021-sudo/poo-unidad2.git`
2. **Importar en Eclipse IDE:**
   - Abre Eclipse IDE.
   - Ve a **File > Open Projects from File System...** y selecciona la carpeta clonada.
3. **Ejecutar la Aplicación:**
   - Abre `src/poo/PruebaAudioVisual.java`.
   - Haz clic derecho y selecciona **Run As > Java Application**.

---

## 6. Mejoras Adicionales Implementadas
- **Optimización de Código:** Uso de listas dinámicas para gestionar colecciones de actores y temporadas eficientemente.
- **Modularidad:** Sobrescritura limpia del método mostrarDetalles() en cada subclase.



