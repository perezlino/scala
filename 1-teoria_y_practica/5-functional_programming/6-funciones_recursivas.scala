/*  ======================================================
    ================ FUNCIONES RECURSIVAS ================
    ======================================================
*/

//  EJEMPLO 1
//  =========

    package scala

    object test {

        def factorial (n: Int): Int = {
            if (n <= 1)
            1
            else
            n * factorial(n-1)    // Función recursiva. Se llama a sí misma
        }

        def main(args: Array[String]): Unit = {
            var fact = factorial(5)
            println(fact)                   // 120
        }
    }