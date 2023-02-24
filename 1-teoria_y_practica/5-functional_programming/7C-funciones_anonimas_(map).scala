/*  ======================================================
    ============== FUNCIONES ANONIMAS - MAP ==============
    ======================================================
*/

//  Ver al ".map" como una función que realiza lo mismo que un for each y nos permite realizar operaciones 
//  al mismo tiempo que recorre cada elemento.


//  EJEMPLO 1
//  =========

    package scala

    object test {

        def main(args: Array[String]): Unit = {

            println("============= Ejemplo 1 =============")
            println(squareOfNumbers)
            println("============= Ejemplo 2 =============")
            println(squareOfNumbersAAA)
            println("============= Ejemplo 3 =============")
            println(doubleOfNumbers)

        }

        var listOfNumbers: List[Int] = List(0,1,2,3,4,5,6,7,8,9)

        //============= Ejemplo 1 =============

        // Forma tradicional
        /*  def square(x: Int): Int = {
                x * x
            }                               */

        // Función Variable (Función Anónima)
        var square:Int => Int = (x: Int) => x * x

        // Usar con Map
        var squareOfNumbers = listOfNumbers.map(square)

        //============= Ejemplo 2 =============

        //var squareOfNumbersAAA = listOfNumbers.map((x: Int) => x * x)
        var squareOfNumbersAAA = listOfNumbers.map(x => x * x)

        //var squareOfNumbersAAA = listOfNumbers.map(_ * _)
        // NOTA: ESTO NO FUNCIONARÁ, PORQUE DOS "_"
        //       ESPERA DOS ENTRADAS PERO map SOLO PROPORCIONA 1 ENTRADA.
        //       es decir, map PROPORCIONA UN NÚMERO EN UN MOMENTO DADO

        //============= Ejemplo 3 =============

        //var doubleOfNumbers = listOfNumbers.map((x: Int) => x * 2)
        //var doubleOfNumbers = listOfNumbers.map(x => x * 2)
        var doubleOfNumbers = listOfNumbers.map(_ * 2)

        //============= Ejemplo 4 =============
        // Observe que convierte un Int en un Booleano, y el resultado del map 
        // es entonces una List[Boolean].
        var doubleOfNumbers = listOfNumbers.map(x => x % 2 == 0)

    }
/*
        ============= Ejemplo 1 =============
        List(0, 1, 4, 9, 16, 25, 36, 49, 64, 81)
        ============= Ejemplo 2 =============
        List(0, 1, 4, 9, 16, 25, 36, 49, 64, 81)
        ============= Ejemplo 3 =============
        List(0, 2, 4, 6, 8, 10, 12, 14, 16, 18)
        ============= Ejemplo 4 =============
        List(true, false, true, false, true, false, true, false, true, false)

*/