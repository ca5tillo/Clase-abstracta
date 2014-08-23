Clase-abstracta
===============

## Proyecto java.
      Se trabajo en netbeans 8.0

* Este es un ejemplo de la pagina aprenderaprogramar.com

El test se basa en: **ProfesorTitular y ProfesorInterino** son subclases de la clase abstracta Profesor. 

ListinProfesores sirve para crear un ArrayList de profesores que pueden ser tanto interinos como titulares y realizar operaciones con esos conjuntos. 

En la clase de test creamos profesores interinos y profesores titulares y los vamos añadiendo a un listín.
 
**ProfesorTitular y ProfesorInterino** se han definido como clases concretas que heredan de la clase abstracta Profesor. 

Ambas clases redefinen el método abstracto importeNomina() de la superclase. El método sobreescrito toString() de la clase ProfesorInterino llama al método toString() de la superclase y lo concatena con nuevas cadenas.

En la clase ListinProfesores tenemos un ejemplo de uso de <<**instanceof**>> para determinar qué tipo (ProfesorInterino o ProfesorTitular) es el que porta una variable Profesor. 


Referencias.
============
[CLASES Y MÉTODOS ABSTRACTOS EN JAVA.](http://www.aprenderaprogramar.com/index.php?option=com_content&view=article&id=668:clases-y-metodos-abstractos-en-java-abstract-class-clases-del-api-ejemplos-codigo-y-ejercicios-cu00695b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188)
