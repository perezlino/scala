/*  ======================================================
    ================== CLASES ABSTRACTAS =================
    ======================================================
*/

//  No podemos generar una instancia de una Clase 'abstracta'. Por tanto, no se puede llamar 'new' 
//  a una clase marcada como 'abstracta'.

//  Al estar marcada como 'abstract', todos los campos y métodos no necesariamente deben tener definiciones

//  Ya sabes también que una Clase 'abstracta', a diferencia de un interfaz o de un trait, en el caso de scala, 
//  admite argumentos, admite parámetros, algo que un 'trait' no admite. 
    
//  Una Clase abstracta no puede heredar más de una Clase, por lo tanto, sólo podría heredar esa Clase abstracta. 

    abstract class RollingStock {
        val name: String
    }

    abstract class Car extends RollingStock  // <----------- Se puede heredar solo una 'clase abstracta' a la vez

    abstract class Engine extends RollingStock

//  Mientras que, si es un trait, sí que podríamos heredar múltiples trait.

    trait Trait1 {
        var edad:Int = 0
        def imprimir(nombre:String) : Unit
        def imprimir1:Unit = {
            println ("Metodo implementado en el trait")
        }
    }

    trait Trait2 {
        def imprimir2():Unit
    }

    class Persona extends Trait1 with Trait2 { // <---------------- Se pueden heredar multiples 'traits'

        def imprimir(nombre:String):Unit = {
            println(nombre.toUpperCase)
        }

        override def imprimir1:Unit = {
            println("Estoy en la clase")
        }

        def imprimir2(): Unit = {
            println("Implementado cuerpo al metodo 'imprimir2' del Trait2")
        }
    }


//  EJEMPLO 1
//  =========

    package curso

    abstract class Persona(nombre:String, apellidos:String) {

        def mayusculas = {
            println(nombre.toUpperCase)
        }
        
        def nombreCompleto: String // <------- Un metodo sin definir
    }

    class Estudiante (nombre:String, apellidos:String) extends Persona (nombre, apellidos) {
    
        def nombreCompleto: String = nombre + " " + apellidos // Dado que se extiende de la Clase abstracta
    }                                                         // 'Persona' DEBEMOS SI O SI definir el metodo 
                                                              // 'nombreCompleto'. Si no vamos a definir el metodo, 
                                                              // debemos nombrar a la Clase 'abstracta'.

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


//  EJEMPLO 2
//  ---------

    package scala

    import java.time.LocalDate

    abstract class Car(make: String, model: String, year: Int) {

        def isVintage: Boolean = LocalDate.now.getYear - year > 20
    }

    object test {
        def main(args: Array[String]): Unit = {

            // val mustang = new Car("Ford", "Mustang", 1965)
            // Error: la clase Car es abstracta; no puede ser instanciada

            // sin embargo
            val mustang = new Car("Ford", "Mustang", 1965) {}
        }
    }

//  Cuando se incluye un cuerpo vacío, se crea una nueva clase concreta anónima (anonymous concrete class)

//  En las clases abstractas también se pueden omitir las definiciones de campos y métodos:

    abstract class Car(make: String, model: String, year: Int) {
        def isVintage: Boolean
    }


//  SOBREESCRIBIR UN METODO DE UNA CLASE ABSTRACT
//  =============================================

//  Un 'val' puede sobrescribir un 'def', pero no al revés

    package scala

    import java.time.LocalDate

    abstract class Car(val make: String, val model: String, val year: Int) {

        def isVintage: Boolean
    }

    object test {
        def main(args: Array[String]): Unit = {

            // val mustang = new Car("Ford", "Mustang", 1965)
            // Error: la clase Car es abstracta; no puede ser instanciada

            // LocalDate.now.getYear ==> Devuelve un 'Int' ==> 2023
            // println(LocalDate.now.getYear) ==> 2023

            // La sobreescritura la realizamos dentro de los {}
            val mustang = new Car("Ford", "Mustang", 1965) {
            // val isVintage = 2023 - 1965 > 20
            val isVintage = LocalDate.now.getYear - year > 20
            }

            println(mustang.isVintage)  // true
        }
    }


//  EJEMPLO 3
//  ---------

    package scala

    abstract class Animal {
        val creatureType: String // Atributo sin definir
        def eat(): Unit          // Metodo sin definir
        def preferredMeal: String = "anything"
    }

    // Las Clases no abstractas deben implementar los atributos y metodos no definidos en la Clase abstracta padre
    class Dog extends Animal {
        // 'override' no es necesario, pero se puede colocar.
        override val creatureType = "domestic"
        override def eat(): Unit = println("crunching this bone")
        // Tambien podemos sobreescribir un metodo ya definido en la Clase abstracta
        override val preferredMeal: String = "bones"
    }


    object test {
        def main(args: Array[String]): Unit = {

            val aDog = new Dog

            println(aDog.eat())           //  crunching this bone
                                        //  ()
            println(aDog.preferredMeal)   //  bones
            
        }
    }