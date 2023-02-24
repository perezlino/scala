/*  ======================================================
    ================= FUNCTION BY VALUE ==================
    ======================================================
*/

//  EJEMPLO 1
//  =========

/* Puntos a recordar
    
    1. Primero ejecutará la función interna "time()" y luego
        ejecutará la función exterior "exec(140698097570299)".

    2. Como la función interna "time()" se ejecuta primero, llama
       a la función externa "exec(140698097570299)" utilizando el
       valor 140698097570299, es por este motivo que se le llama 
       como "Función por Valor".
*/

    package scala

    object test {

        def main(args: Array[String]): Unit = {
            println("Funcion 'main' " + exec(time()))
        }
    /*
        Dentro de la funcion 'time'
        Entrando en la funcion 'exec'
        Time: 411707733192900
        Saliendo de la funcion 'exec'
        Funcion 'main' 411707733192900
    */

        def time() : Long = {
            println("Dentro de la funcion 'time'")
            return System.nanoTime() // El return no es necesario
        }

        // Vemos que el parametro del metodo 'exec' espera un 'valor' (i:Long) y no una funcion (i: => Long)
        def exec(i:Long) : Long = {
            println("Entrando en la funcion 'exec'")
            println("Time: " + i)
            println("Saliendo de la funcion 'exec'")
            return i  // El return no es necesario
        }
    }


//  EJEMPLO 2
//  =========

// Puntos a recordar
/*
    1. Primero ejecutará la función EXTERNA "exec()" y
       después ejecutará la función INTERNA "time()" cada vez
       que 'i' seasea referido.

    2. Como la función EXTERNA "exec()" se ejecuta primero, se
       llama a la función INTERNA "time()" usando la VARIABLE
       REFERENCIADA 'i', es por este motivo que se le llama
       como "Función por Nombre".
 */

    package scala

    object test {

        def main(args: Array[String]): Unit = {
            println("Funcion 'main' " + exec(time()))
        }
    /*
        Entrando en la funcion 'exec'
        Dentro de la funcion 'time'
        Time: 412426826053000
        Saliendo de la funcion 'exec'
        Dentro de la funcion 'time'
        Funcion 'main' 412426826225900
    */

        def time() : Long = {
            println("Dentro de la funcion 'time'")
            return System.nanoTime() // El return no es necesario
        }

        // Vemos que el parametro del metodo 'exec' espera una 'funcion' (i: => Long) y no un valor (i:Long) 
        def exec(i: => Long) : Long = {
            println("Entrando en la funcion 'exec'")
            println("Time: " + i)
            println("Saliendo de la funcion 'exec'")
            return i  // El return no es necesario
        }
    }
