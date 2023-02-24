/*  ======================================================
    ================= FUNCIONES ANIDADAS =================
    ======================================================
*/

//  Si hay una función dentro de una función se llama función anidada, una función llamada desde dentro.

//  EJEMPLO 1
//  =========

//  En este ejemplo, un método dentro de una Función 'main'. Generalmente lo que hacemos es dejar afuera el 
//  método de la Función main. En este caso dejamos el método dentro de la Función main.

    package scala

    object test {
        def main(args: Array[String]): Unit = {

            // val printHello = (msg: String) => println("Hello " + msg)

            def printHello(msg: String): Unit = {
            println("Hola " + msg)
            }
            
            printHello("Mundo")
            printHello("Antofagasta")
        }
        /*
        Hola Mundo
        Hola Antofagasta
        */
    }


//  EJEMPLO 2
//  =========

    package scala

    object test {
        def main(args: Array[String]): Unit = {

            printHello("Mundo")
            printHello("Antofagasta")
        }
        /*
        Hola Mundo
        Hola Antofagasta
        */        

        def printHello(str: String): Unit ={

            def printSomeThing(str1: String, str2: String): Unit = {
            println(str1 + " " + str2)
            }

            printSomeThing("Hola", str)
        }
    }


//  EJEMPLO 3
//  =========

    package scala

    object test {
        def main(args: Array[String]): Unit = {
            println(factorial(5))
            println(factorial(3))
            println(factorial(0))
        }
/*
        120
        6
        1
*/

        def factorial(i: Int): Int ={
            def fact(x: Int, prevResult: Int): Int ={
            if (x <= 1)
                prevResult
            else
                fact(x - 1, x * prevResult)
            }

            var z = fact(i,1)
            return z

/*          // var z = fact(5,1)    
            if (5 <= 1)
                prevResult
            else
                fact(5 - 1, 5 * 1) ---> fact(4, 5)

                // var z = fact(4, 5)
                if (4 <= 1)
                    prevResult
                else
                    fact(4 - 1, 4 * 5) ---> fact(3, 20)            
                
                    // var z = fact(3, 20)
                    if (3 <= 1)
                        prevResult
                    else
                        fact(3 - 1, 3 * 20) ---> fact(2, 60)         
                        
                        // var z = fact(2, 60)
                        if (2 <= 1)
                            prevResult
                        else
                            fact(2 - 1, 2 * 60) ---> fact(1, 120)         

                            // var z = fact(1, 120)
                            if (1 <= 1)
                                prevResult --> 120
            }            
*/
        }
    }