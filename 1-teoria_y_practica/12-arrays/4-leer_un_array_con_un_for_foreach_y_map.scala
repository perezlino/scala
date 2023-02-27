/*  ======================================================
    ======= LEER UN ARRAY CON UN FOR, FOREACH Y MAP ======
    ======================================================
*/

//  Leer un array con un 'For'
//  --------------------------

    package scala

    object test {
        def main(args: Array[String]): Unit = {

            var array = Array(1,2,3,4,5)

            for(i <- array) {
            println(i)
            }
        }
/*
        1
        2
        3
        4
        5
*/
    }

//  ----------------------------------------------------------------------------------------------------

//  Leer un array con un 'For' y obtener la suma y promedio de sus valores
//  ----------------------------------------------------------------------

    package scala

    object test {
        def main(args: Array[String]): Unit = {

            var array = Array(1,2,3,4,5)

            var totalArray = 0
            var promedioArray = 0

            for(i <- 0 to (array.length - 1)) {
            totalArray = totalArray + array(i)
            }

            promedioArray = totalArray / array.length

            println("La suma total de los elementos del Array es " + totalArray)
            println("El promedio de los elementos del Array es " + promedioArray)

        }
/*
        La suma total de los elementos del Array es 15
        El promedio de los elementos del Array es 3
*/
    }

//  ----------------------------------------------------------------------------------------------------

//  Leer un array con un 'Foreach' y obtener la suma y promedio de sus valores
//  --------------------------------------------------------------------------

package scala

object test {
  def main(args: Array[String]): Unit = {

    var array = Array(1, 2, 3, 4, 5)

    array.foreach(println)
/*
    1
    2
    3
    4
    5
*/
    var totalArray = 0

    // 1era Forma: array.foreach(i => totalArray = totalArray + i)
    //  2da Forma: array.foreach(i => totalArray += i)
    array.foreach(totalArray += _)
    println(totalArray)             // 15

    // Promedio de los elementos
    var promedioArray = totalArray / array.length
    println(promedioArray)          // 3
  }
}

//  ----------------------------------------------------------------------------------------------------

//  Utilizar 'map'
//  --------------

    // 1era Forma: 
    // var mapArray = mapArray.map(i => i + 10)
    var mapArray = array.map(_ + 10)

    mapArray.foreach(println)
/*
    11
    12
    13
    14
    15
*/

//  ----------------------------------------------------------------------------------------------------

//  Utilizar 'for' y 'yield' para obtener como resultado un Array
//  -------------------------------------------------------------

    var array = Array(1, 2, 3, 4, 5)

    val resultado = for (i <- array) yield {i + 10}
    // val resultado: Array[Int] = Array(11, 12, 13, 14, 15)

    resultado.foreach(println)
/*
    11
    12
    13
    14
    15
*/