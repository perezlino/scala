/*  ======================================================
    ===================== ARRAYBUFFER ====================
    ======================================================
*/

//  Permite cambiar el tamaño del array (Mutable)

    package scala

    import scala.collection.mutable.ArrayBuffer

    object test {
        def main(args: Array[String]): Unit = {

            // Podemos tambien asignarle elementos al inicializarlo
            // var marks = ArrayBuffer(1,2,3)

            val marks = ArrayBuffer[Int]()
            marks +=1
            marks +=2
            marks +=3

            println(marks.length) // 3
            println(marks(0)) // 1

            println("Imprimiendo 'Marks' hasta ahora")
            marks.foreach(println)
/*
            Imprimiendo 'Marks' hasta ahora
            1
            2
            3
*/

            marks += 4
            println("Imprimiendo 'Marks' hasta ahora")
            marks.foreach(println)
/*
            Imprimiendo 'Marks' hasta ahora
            1
            2
            3
            4
*/

            marks.append(5)
            println("Imprimiendo 'Marks' hasta ahora")
            marks.foreach(println)
/*
            Imprimiendo 'Marks' hasta ahora
            1
            2
            3
            4
            5
*/

            marks -= 5
            println("Imprimiendo 'Marks' hasta ahora")
            marks.foreach(println)
/*
            Imprimiendo 'Marks' hasta ahora
            1
            2
            3
            4
*/            

            marks ++= Array(5,6,7)
            println("Imprimiendo 'Marks' hasta ahora")
            marks.foreach(println)
/*
            Imprimiendo 'Marks' hasta ahora
            1
            2
            3
            4
            5
            6
            7
*/
            marks ++= List(8,9,10)
            println("Imprimiendo 'Marks' hasta ahora")
            marks.foreach(println)
/*
            Imprimiendo 'Marks' hasta ahora
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

            marks --= List(9,10)
            println("Imprimiendo 'Marks' hasta ahora")
            marks.foreach(println)
/*
            Imprimiendo 'Marks' hasta ahora
            1
            2
            3
            4
            5
            6
            7
            8
*/
        }
    }