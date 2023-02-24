/*  ======================================================
    ================= CARRYING FUNCTIONS =================
    ======================================================
*/

//  Es la técnica de transformación que nos permite, digamos, modificar o transformar una función que 
//  tiene múltiples argumentos A, B, C, D, da igual cuántos, en una función que tome un solo argumento, 
//  que se ha convertido a un solo argumento. En realidad, el proceso se hace transformando esa función 
//  (con múltiples argumentos) en una cadena de funciones, cada una con un parámetro individual, con un 
//  solo parámetro, y de hecho digamos que la cadena de funciones, lo que se va haciendo, es irse 
//  resolviéndo una tras otra, es decir, se hace la primera función, el resultado que es, digamos, una 
//  función, se encadena con la siguiente y así sucesivamente.

//  EJEMPLO 1
//  =========

    package scala

    object test {
        /*  Carrying es la técnica de transformar una función que tiene multiples argumentos
        //  en una función que tome un argumento simple
        //  En realidad lo transforma en una cadena de funciones, cada una con un parametro
        //          (Int,Int)=>Int
        //  se transforma en
        //           Int => Int => Int
        */
        def sumar(x:Int, y:Int) = x + y
        def sumar1 (x:Int) = (y:Int) => x + y
        def sumar2 (x:Int) (y:Int) = x + y

        def main(args: Array[String]): Unit = {

            println(sumar(10,20))       // 30
            println(sumar1(20)(40))     // 60

            val v1 = sumar1(50)
            println(v1(100))            // 150

            println(sumar2(90)(80))     // 170

            val v2 = sumar2(90)_
            println(v2(900))            // 990
        }
    }



//  EJEMPLO 2
//  =========

    package scala

    object test {
        def main(args: Array[String]): Unit = {
            val str1 = "Hola"
            val str2 = "Mundo"

            // println("str1, str2 : " + printSomeThing(str1, str2)) <------- Obtenemos lo mismo
            println("str1, str2 : " + printSomeThing(str1)(str2))
        }
/*
        str1, str2 : Hola Mundo
*/

/*      def printSomeThing(str1: String, str2: String): String = {  <------- Obtenemos lo mismo
            str1 + " " + str2
        }

        def printSomeThing(str1: String)(str2: String): String = {  <------- Obtenemos lo mismo
            str1 + " " + str2
        }                                                          
*/
        def printSomeThing (str1:String) = (str2:String) => str1 + " " + str2

    }


