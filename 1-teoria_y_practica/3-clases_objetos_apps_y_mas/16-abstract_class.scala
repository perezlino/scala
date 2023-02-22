/*  ======================================================
    =================== ABSTRACT CLASS ===================
    ======================================================

    En realidad, ya sabes, que una Clase abstracta básicamente nos permite tener tantos métodos y 
    variables normales como métodos abstractos. Al final un método abstracto no es nada más que una 
    especie de plantilla que luego tengo que resolver posteriormente, cuando extiendo esa Clase 
    abstracta o cuando utilizo directamente la Clase para crear un objeto. La filosofía de funcionamiento, 
    son muy parecidas a las que tenemos dentro de Java. Ya sabes también que una Clase abstracta, a 
    diferencia de un interfaz o de un trait, en el caso de scala, admite argumentos, admite parámetros, 
    algo que un trait no admite. Y al contrario, una Clase abstracta no puede heredar más de una Clase, 
    por lo tanto, sólo podría heredar esa Clase abstracta. Mientras que, si es un trait, sí que podríamos 
    heredar múltiples trait. Entonces tenemos ventajas y desventajas a la hora de utilizar una Clase 
    abstracta o un Trait. 

*/

//  EJEMPLO 1
//  =========

    package curso

    abstract class Persona(nombre:String, apellidos:String) {

        def mayusculas = {
            println(nombre.toUpperCase)
        }
        
        def nombreCompleto: String
    }

    class Estudiante (nombre:String, apellidos:String) extends Persona (nombre, apellidos) {
    
        def nombreCompleto: String = nombre + " " + apellidos
    }

    object abstractClassDemo {
        def main(args: Array[String]): Unit = {

            var estudiante1 = new Estudiante("Alberto", "Perez")
            println(estudiante1.nombreCompleto)
            println(estudiante1.mayusculas)
        }
/*
        Alberto Perez
        ALBERTO
        ()
*/
    }