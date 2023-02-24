/*  ======================================================
    ====================== CLOSURES ======================
    ======================================================
*/

//  Closure: Las variables se definen fuera de la definición de la función
//  Closure: Es una función que usa una o mas variables declaradas fuera de la función

//  EJEMPLO 1
//  =========

    package scala

    object test {
        def main(args: Array[String]): Unit = {
            println(multiplier(5))
            println(multiplier1(5))
        }
/*
        45
        5
*/
    
        // Si la variable (por ejemplo: factor) se define fuera del cuerpo de la función, se 
        // denomina 'Closure'
        var factor = 9
        
        // Forma tradicional
        /*  def multiplier (x: Int) = {
            x * 10
            }           */

        // Funcion anonima
        var multiplier = (x:Int) => x * factor


        // Si la variable utilizada dentro del cuerpo de la función (p.ej. factor) no es un parámetro 
        // de entrada o definida dentro del cuerpo de la función

        // Nota: La siguiente función no es un 'closure', porque factor1 está definido dentro del cuerpo 
        //       de la función
        var multiplier1 = (x:Int) => {
            var factor1 = 1
            x * factor1
        }
    }


//  EJEMPLO 2
//  =========

    package scala

    object test {
        var numero = 90
        val sumar = (x:Int) => {
            numero = x + numero
            numero
        }
    
        def main(args: Array[String]): Unit = {
            numero = 900
            println(numero)         // 900
            println(sumar(100))     // 1000
        }
    }


//  EJEMPLO 3
//  =========

    package scala

    object test {
        def main(args: Array[String]): Unit = {
            println(parOImpar(esPar,2))
            println(parOImpar(esPar,3))
            println(parOImpar(esPar,4))
            println(parOImpar(esPar,5))
            println(parOImpar(esPar,6))
        }
/*
        Numero par
        Numero impar
        Numero par
        Numero impar
        Numero par   
*/
        // Function Call by Name
        def parOImpar(f:(Int) => Boolean, x: Int): String ={
            var parFlag = f(x)
            if (parFlag) {
            "Numero par"
            } else {
            "Numero impar"
            }
        }

        // Definición tradicional de la función

        /*  def esPar (x: Int): Boolean ={
                x % 2 == 0
            }              */

        //  Funcion anonima
        var div = 2
        var esPar = (x:Int) => x % div == 0

        // val esPar: (Int) => Boolean = (x) => { x % 2 == 0 }
        // Si quieres especificar el tipo de retorno

    } 