/*  ======================================================
    ============= FUNCIONES ANONIMAS - SPAN ==============
    ======================================================
*/

//  EJEMPLO 1
//  =========

    package scala

    object test {
        def main(args: Array[String]): Unit = {

            // Obtenemos una TUPLA de listas
            println(nums.span(x => x % 4 != 0))
            // (List(1, 2, 3),List(4, 5, 6, 7, 8, 9, 10))

            val numSpan = nums.span(x => x % 4 != 0)
            println(numSpan._1)  // List(1, 2, 3)
            println(numSpan._2)  // List(4, 5, 6, 7, 8, 9, 10)

        }

        val nums = (1 to 10).toList

    }