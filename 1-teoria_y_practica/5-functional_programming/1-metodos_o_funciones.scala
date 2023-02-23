/*  ======================================================
    ================ METODOS O FUNCIONES =================
    ======================================================
*/

//  EJEMPLO 1
//  =========

    object DemoAFunction {

        // Metodo o Funcion
        def suma(x:Int, y:Int):Int = {
            return (x + y)
        }

        // Metodo 'main'                            // Dentro del Metodo 'main' se llama al Metodo 'suma'
        def main(args: Array[String]): Unit = {     // y se ejecuta el programa. TODO debe ser ejecutado
                                                    // dentro del metodo 'main'.
            var z: Int = sum(2,3)
            println(z)                              // El Metodo 'main' se debe utilizar dentro de un 'Object'
            // 5                                    // (el cual Java detrás de cámaras lo trata como una 'Class')
        }
    }


//  EJEMPLO 2
//  =========

    package curso

    object example {
        def main(args: Array[String]): Unit = {

            def funcion1 = "Hola"
            println(funcion1)                   // Hola

            def funcion2() = "Hola"
            println(funcion2)                   // Hola

            def funcion3:String = "Hola"
            println(funcion3)                   // Hola

            def funcion4():String = "Hola"
            println(funcion4)                   // Hola

            def funcion5():String = {
            "Hola"
            }
            println(funcion5)                   // Hola

            // Scala entiende que la última linea que se encuentra antes de salir de la función es el 'RETURN'
            def funcion6():String = {
            "Hola"
            "Adios"
            "Amigos"
            }
            println(funcion6)                   // Amigos
        }
    }