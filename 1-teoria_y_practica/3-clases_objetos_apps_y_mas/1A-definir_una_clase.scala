/*  ======================================================
    ================= DEFINIR UNA CLASE ==================
    ======================================================
*/

//  En la JVM, todos los métodos/campos deben ir dentro de clases (a diferencia de la REPL)

//  En Scala, esto incluye objetos, traits, y objetos de paquete (más adelante)

//  EJEMPLO 1
//  =========

    class DemoWithFieldsAndMethods {

        val x: Int = 10
        val y: Int = x * 2

        def timesY(a: Int): Int = a * y
    }

    // Creamos el Objeto 'demoWithFieldsAndMethods'
    val demoWithFieldsAndMethods = new DemoWithFieldsAndMethods 

    // Llamamos al atributo 'x' de la Clase
    demoWithFieldsAndMethods.x              // val res0: Int = 10

    // Llamamos al metodo 'timesY' de la Clase
    demoWithFieldsAndMethods.timesY(4)      // val res1: Int = 80


//  EJEMPLO 2
//  =========

    class DemoWithParams(name: String) {

        println(s"Constructing for $name")
    
        def sayHi(times: Int): Unit = {
            var time = 0

            while (time < times) {
                println(s"Hola $name ")
                time += 1
            }
        }
    }

    // Creamos el Objeto 'demoWithParams'
    val demoWithParams = new DemoWithParams("Alfonso")

    // Llamamos al metodo 'sayHi' de la Clase
    demoWithParams.sayHi(5)
/*
    Hola Alfonso 
    Hola Alfonso 
    Hola Alfonso 
    Hola Alfonso 
    Hola Alfonso
*/