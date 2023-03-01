/*  ======================================================
    ================ FUNCTION CALL BY NAME ===============
    ======================================================


    Caso 1 – Llamando desde una función a otra función sin argumentos
    -----------------------------------------------------------------   

    A la función 'printValue' le paso como argumento otra función, la función 'increment'.

                            def printValue (m: => Int) 
    
    Así defino el argumento de una función a la cual le entrego otra función.    */

    package scala

    object test {

        def main(args: Array[String]): Unit = {
            printValue(increment())
        }
/*
        El valor de 'y' es 2
        El valor de 'y' despues de incrementar es 3
        El valor es 3
*/
        // Dado que 'm' es del tipo 'Int', entonces, podemos pasarle como argumento el metodo 'increment'
        // dado que 'retorna' un valor 'Int', el valor de 'z'. Si 'z' fuese un 'String', el metodo 'printValue'
        // no podria imprimirlo, dado que espera un 'Int'. Deberiamos cambiar tu tipo de retorno.
        def printValue (m: => Int) = {
            println("El valor es " + m)
        }

        // Recordar que la ultima linea de un metodo corresponde al 'return'.
        // En este caso se esta devolviendo 'z' que es un valor 'Int'
        def increment() = {
            var y = 2
            println("El valor de 'y' es " + y)
            var z = y + 1
            println("El valor de 'y' despues de incrementar es " + z)
            z
        }
    }


//    Caso 2 – Llamando desde una función a otra función con argumentos
//    -----------------------------------------------------------------

    package scala

    object test {

        def main(args: Array[String]): Unit = {
            printValue(increment(10)) // <==== Le entregamos un argumento al metodo 'increment'
        }
/*
        El valor de 'y' es 20
        El valor de 'y' despues de incrementar es 21
        21
*/
        // La '=>' significa 'Call by name', llama a una Funcion
        def printValue (m: => Int) = {
            println(m)
        }

        // Notar que ahora el metodo le asignamos un parametro 'increment(y:Int)'
        def increment(y:Int) = {
            var y = 20
            println("El valor de 'y' es " + y)
            var z = y + 1
            println("El valor de 'y' despues de incrementar es " + z)
            z
        }
    }


//    Caso 3 – Llamando desde una función a otra función con argumentos
//    -----------------------------------------------------------------

    package scala

    object test {

        def main(args: Array[String]): Unit = {
            printValue(increment, 2)  // Le entregamos los dos argumentos al metodo 'printValue'
        }
    /*
        El valor de 'y' es 2
        El valor de 'y' despues de incrementar es 3
        El valor es 3
    */
    /*
        Le agregamos un segundo parametro al metodo 'printValue'
        - m: => Int  corresponde a un metodo 'sin' argumentos que tiene un tipo de retorno 'Int', es decir, devuelve 
                     entero.
        - m: (Int) => Int, x:Int   corresponde a un metodo 'con' argumentos que tiene un tipo de retorno 'Int', es 
                                   decir, devuelve entero. El metodo recibe una funcion y un argumento de tipo 
                                   entero (m:(Int)). Por tanto, no puede ser x:String. El argumento de tipo 'Int' 
                                   (x:Int) se lo evalua dentro de la funcion que fue entregada como argumento.
    */        

        def printValue (m: (Int) => Int, x: Int) = {
            println("El valor es " + m(x))
        }

        def increment(y: Int) = {
            println("El valor de 'y' es " + y)
            var z = y + 1
            println("El valor de 'y' despues de incrementar es " + z)
            z
        }
    }


//    Caso 4 – Llamando desde una función a otra función con argumentos
//    -----------------------------------------------------------------

    package scala

    object test {

        def main(args: Array[String]): Unit = {
            println("La suma de 5 y 2 es " + calculator(add, 5,2))
            println("La resta de 5 y 2 es " + calculator(sub, 5,2))
            println("Multiplicación de 5 y 2 es " + calculator(mul, 5,2))
            println("Cociente de la división de 5 y 2 es " + calculator(div, 5,2))
            println("Resto de la división de 5 y 2 es " + calculator(rem, 5,2))
        }
/*
        La suma de 5 y 2 es 7
        La resta de 5 y 2 es 3
        Multiplicacion de 5 y 2 es 10
        Cociente de la division de 5 y 2 es 2
        Resto de la division de 5 y 2 es 1
*/


        def calculator (m: (Int, Int) => Int, x: Int, y:Int): Int = {
            m(x, y)
        }

        //Modo tradicional
        /*  def add(x:Int, y: Int) = {
                x + y
            }                               */

        //Funciones anónimas
        var add = (x:Int, y: Int) => x + y
        var sub = (x:Int, y: Int) => x - y
        var mul = (x:Int, y: Int) => x * y
        var div = (x:Int, y: Int) => x / y
        var rem = (x:Int, y: Int) => x % y

    }