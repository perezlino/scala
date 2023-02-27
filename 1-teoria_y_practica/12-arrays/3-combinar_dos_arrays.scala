/*  ======================================================
    ================ COMBINAR DOS ARRAYS =================
    ======================================================
*/

package scala

import Array.concat

object test {
  def main(args: Array[String]): Unit = {

    var array1 = Array(1,2,3,4,5)
    var array2 = Array(6,7,8,9,10)

    var combinarArray = concat(array1, array2) // El metodo 'concat' sirve para combinar Arrays

    combinarArray.foreach(println)
  }
/*
    1
    2
    3
    4
    5
    6
    7
    8
    9
    10
*/
}