# OO2

Este repositorio al igual que todos los comenzados en POO_ estan hechos con el proposito de mostrar 
ejercicios hechos durante la materia OO2.
En esta materia enseñan y realizan ejercicios relacionados a los patrones de diseño.

Practica 2: Patrones **Template Method** y **Composite**

# Practica 2 Ejercicio 3: FileSystem
Un file system contiene un conjunto de directorios y archivos organizados jerárquicamente mediante una relación de inclusión. De cada archivo se conoce el nombre, fecha de creación y tamaño en bytes. De un directorio se conoce el nombre, fecha de creación y contenido (el tamaño es siempre 32kb). Modele el file system y provea la siguiente funcionalidad:				
```java
    public class Archivo {
        /**
    * Crea un nuevo archivo con nombre <nombre>, de <tamano> tamano 
    * y en la fecha <fecha>.
        */
        public Archivo (String nombre, LocalDate fecha, int tamano)

    }

    public class Directorio {
    /**
    * Crea un nuevo Directorio con nombre <nombre> y en la fecha <fecha>.
    */
            public Directorio(String nombre, LocalDate fecha)

        /**
    * Retorna el espacio total ocupado, incluyendo su contenido.
    */
            public int tamanoTotalOcupado()

            /**
    * Retorna el archivo con mayor cantidad de bytes en cualquier nivel del 
    * filesystem contenido por directorio receptor
    */
            public Archivo archivoMasGrande()

    
        /**
    * Retorna el archivo con fecha de creación más reciente en cualquier nivel 
    * del filesystem contenido por directorio receptor.
    */
            public Archivo archivoMasNuevo()
        
    }
```
## Tareas:				
1. Diseñe y represente un modelo UML de clases de su aplicación, identifique el patrón de diseño empleado (utilice estereotipos UML para indicar los roles de cada una de las clases en ese patrón).
2. Diseñe, implemente y ejecute test cases para verificar el funcionamiento de su aplicación. En el archivo DirectorioTest.java del material adicional se provee la clase DirectorioTest que contiene tests para los métodos arriba descritos y la definición del método setUp. Utilice el código provisto como guía de su solución y extienda lo que sea necesario.
3. Implemente completamente en Java.

- 

1. Diseño con Patron Composite.
![UML](/FileSystemUML.png)

2. Tests brindados por la caterdra: [TESTS](/test/java/ar/edu/unlp/info/oo2/practica2_ejercicio3/)

3. [Implementacion en java](/main/java/ar/edu/unlp/info/oo2/practica2_ejercicio3/): tengo que terminar de corregir la recursion por streams