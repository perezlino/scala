/*  ======================================================
    =========== FUNCIONES ANONIMAS - PARTITION ===========
    ======================================================
*/

//  EJEMPLO 1
//  =========

    package scala

    object test {
        def main(args: Array[String]): Unit = {

            // nums.partition(x => x % 4 != 0)
            // res1: (List[Int], List[Int]) = (List(1, 2, 3, 5, 6, 7, 9, 10),List(4, 8))

            // Obtenemos una TUPLA de listas
            println(nums.partition(x => x % 4 != 0))
            // (List(1, 2, 3, 5, 6, 7, 9, 10),List(4, 8))

            val numPartition = nums.partition(x => x % 4 != 0)
            // numPartition: (List[Int], List[Int]) = (List(1, 2, 3, 5, 6, 7, 9, 10),List(4, 8))
            
            println(numPartition._1)  // List(1, 2, 3, 5, 6, 7, 9, 10)
            println(numPartition._2)  // List(4, 8)

        }

        val nums = (1 to 10).toList

    }