/*  ======================================================
    == PROCEDIMIENTOS - FUNCIONES QUE NO DEVUELVEN VALOR =
    ======================================================
*/

//  'Unit' es un tipo de dato que no espera recibir nada

//  Lo que hacemos es crear una función que lo único que hace es 'ejecutar' cosas, pero no llega a 
//  devolver nada


//  EJEMPLO 1
//  =========

    package curso

    object example {

        def procedimiento():Unit = {
            println("Bienvenido a Scala!")
        }

        def main(args: Array[String]): Unit = {

            procedimiento() // Bienvenido a Scala!
            procedimiento   // Bienvenido a Scala!

        }
    }