# Sistema de gestion de contenido audiovisual

## 1. Descripción del Proyecto
**Objetivo Aplicación:** 
- Este programa lo hice en Java usando Eclipse para ordenar y manejar diferentes tipos de contenido multimedia en un solo lugar. La idea principal es aplicar lo que hemos visto sobre Programación Orientada a Objetos (como herencia, clases abstractas y polimorfismo) para conectar varias clases y que trabajen juntas.
**Características Principales:**
Aplica bases de POO: Herencia, Encapsulamiento, Abstracción y Polimorfismo.
Modela relaciones estructurales complejas entre entidades (Asociación, Agregación y Composición).
**Problema que Resuelve:** 
- El problema que resuelve es que al juntar clases distintas puede volverse problemnatico si el código es muy rígido. Con esta estructura base, el sistema se vuelve flexible y deja agregar nuevos contenidos sin tener que romper o reescribir el código que ya funcionaba.


## 2. Objetivos del proyecto
Implementar la arquitectura de software basada en el diagrama de clases.
Agregar subclases personalizadas (Podcast y Audiolibro).


## 3. Clases nuevas añadidas
Ademas de las clases base del proyecto se crearon dos nuevas subclases que heredan de ContenidoAudiovisual:
**Podcast**: Modela contenidos de audio.
Atributos: host (String), numeroEpisodio (int).
**Audiolibro**: Producciones de literatura narradas.
Atributos: autorLibro (String), narrador (String).


## 4. Estructura
El repositorio contiene la siguiente estructura de carpetas y clases:

- src/
  - poo/
    - PruebaAudioVisual.java
  - uni1a/
    - Actor.java
    - Audiolibro.java
    - ContenidoAudiovisual.java
    - Documental.java
    - Investigador.java
    - Pelicula.java
    - Podcast.java
    - SerieDeTV.java
    - Temporada.java


## 5. Instrucciones de Instalación y Uso

1. **Clonar el Repositorio:**
   `git clone https://github.com/martolagarto20021-sudo/poo-unidad2.git`
2. **Importar en Eclipse IDE:**
   Abrir Eclipse IDE.
   ir a **File > Open Projects from File System...** y seleccionar la carpeta clonada.
3. **Ejecutar la Aplicación:**
   Abrir `src/poo/PruebaAudioVisual.java`.
   Hacer clic derecho y seleccionar Run As Java Application.

## 6. Mejoras Adicionales
**Optimización de Código:** Uso de listas para la gestion de colecciones de actores y temporadas de forma eficiente.

