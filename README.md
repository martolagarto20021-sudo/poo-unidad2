\# Sistema de Gestión de Contenidos Audiovisuales - UPS POO Unidad 2



\## 1. Descripción del Proyecto

\- \*\*Propósito de la Aplicación:\*\* Gestionar, modelar y clasificar un catálogo diverso de contenidos multimedia mediante la implementación de los principios de la Programación Orientada a Objetos (POO) en Java.

\- \*\*Características Principales:\*\*

&#x20; - Aplica los pilares de la POO: Herencia, Encapsulamiento, Abstracción y Polimorfismo.

&#x20; - Modela relaciones estructurales complejas entre entidades (`Asociación`, `Agregación` y `Composición`).

&#x20; - Extensibilidad modular a través de una jerarquía de clases abstractas.

\- \*\*Problema que Resuelve:\*\* Permite integrar y procesar dinámicamente diferentes tipos de producciones (Películas, Series, Documentales, Podcasts y Audiolibros) dentro de un mismo sistema unificado sin alterar el código fuente base.



\---



\## 2. Objetivos del Proyecto

\- Implementar la arquitectura de software basada en el diagrama de clases de la Unidad 2.

\- Incorporar subclases personalizadas originales como iniciativa del estudiante (`Podcast` y `Audiolibro`).

\- Demostrar el comportamiento polimórfico en tiempo de ejecución procesando un arreglo uniforme de objetos audiovisuales.



\---



\## 3. Clases y Funcionalidades Nuevas Añadidas (Iniciativa Estudiantil)

Además de las clases base del proyecto, se crearon dos nuevas subclases que heredan de `ContenidoAudiovisual`:

\- \*\*`Podcast`\*\*: Modela contenidos de audio episódicos.

&#x20; - \*Atributos:\* `host` (String), `numeroEpisodio` (int).

\- \*\*`Audiolibro`\*\*: Modela producciones literarias narradas.

&#x20; - \*Atributos:\* `autorLibro` (String), `narrador` (String).



\---



\## 4. Estructura de Carpetas

El repositorio sigue una organización modular limpia dentro del proyecto:



```text

poo\\\\\\\_unidad1/

└── src/

\\\&#x20;   ├── poo/

\\\&#x20;   │   └── PruebaAudioVisual.java     # Clase principal de ejecución

\\\&#x20;   └── uni1a/

\\\&#x20;       ├── Actor.java                 # Clase de apoyo (Agregación)

\\\&#x20;       ├── Audiolibro.java            # Subclase añadida

\\\&#x20;       ├── ContenidoAudiovisual.java  # Clase abstracta base

\\\&#x20;       ├── Documental.java            # Subclase base

\\\&#x20;       ├── Investigador.java          # Clase de apoyo (Composición)

\\\&#x20;       ├── Pelicula.java              # Subclase base

\\\&#x20;       ├── Podcast.java               # Subclase añadida

\\\&#x20;       ├── SerieDeTV.java             # Subclase base

\\\&#x20;       └── Temporada.java             # Clase de apoyo (Composición)

5\\\\. Instrucciones de Instalación y Uso

Prerrequisitos

Java Development Kit (JDK): Versión 17 o superior.



IDE Recomendado: Eclipse IDE para desarrolladores Java.



Control de Versiones: Git CLI.



Guía Paso a Paso

Clonar el Repositorio:

Abre tu terminal y ejecuta el siguiente comando:



Bash

git clone \\\\\\\[https://github.com/martolagarto20021-sudo/poo-unidad2.git](https://github.com/martolagarto20021-sudo/poo-unidad2.git)

Importar en Eclipse IDE:



Abre Eclipse IDE.



Ve al menú superior: File > Open Projects from File System...



Selecciona la carpeta clonada poo\\\\\\\_unidad1 y presiona Finish.



Ejecutar la Aplicación:



Navega en el Package Explorer hasta src/poo/PruebaAudioVisual.java.



Haz clic derecho sobre el archivo y selecciona Run As > Java Application.



Verifica los resultados del polimorfismo impresos en la consola de Eclipse.



6\\\\. Mejoras Adicionales Implementadas

Optimización de Código: Uso de listas dinámicas (ArrayList) para gestionar colecciones de actores y temporadas de forma eficiente.



Modularidad Clean Code: Sobrescritura del método mostrarDetalles() en cada subclase garantizando un reporte completo y estructurado en consola.



