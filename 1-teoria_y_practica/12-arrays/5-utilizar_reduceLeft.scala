/*  ======================================================
    ================ UTILIZAR REDUCELEFT =================
    ======================================================
*/

    package scala

    object test {
        def main(args: Array[String]): Unit = {

            // reduceLeft
            var marks = Array(1, 2, 3, 4, 5)
            var avg = marks.reduceLeft((x, y) => (x + y) / 2)
            // var avg2 = marks.reduceLeft(_/2+_/2)
            println("El resultado de '(x+y/2)': " + avg)  // El resultado de '(x+y/2)': 4

            // Así funciona reduceLeft
            var avg2 = marks.reduceLeft((x, y) => {
                println("El valor de 'x' es " + x + " y el de 'y' es: " + y + " y el valor del promedio es: " + (x + y) / 2)
                (x + y) / 2
            }
    /*
            El valor de 'x' es 1 y el de 'y' es: 2 y el valor del promedio es: 1
            El valor de 'x' es 1 y el de 'y' es: 3 y el valor del promedio es: 2
            El valor de 'x' es 2 y el de 'y' es: 4 y el valor del promedio es: 3
            El valor de 'x' es 3 y el de 'y' es: 5 y el valor del promedio es: 4
    */
            )
            println("El resultado de '(x+y/2)': " + avg2)  // El resultado de '(x+y/2)': 4

            //var totalMarks = marks.reduceLeft((x,y) => (x+y))
            var totalMarks = marks.reduceLeft(_+_)
            println("Total Marks is " + totalMarks) // Total Marks is 15

            var totalMarks2 = marks.reduceLeft((x,y) => {
                println("El valor de x es " + x + " y el de 'y' es: "+ y + " y la suma es: " + (x+y))
                (x+y)
            }
    /*
            El valor de x es 1 y el de 'y' es: 2 y la suma es: 3
            El valor de x es 3 y el de 'y' es: 3 y la suma es: 6
            El valor de x es 6 y el de 'y' es: 4 y la suma es: 10
            El valor de x es 10 y el de 'y' es: 5 y la suma es: 15
    */
            )

            //var maxMarks = marks.reduceLeft((x,y) => x max y)
            var maxMarks = marks.reduceLeft(_ max _)
            println("Max Marks es " + maxMarks)  // Max Marks es 5

            var maxMarks2 = marks.reduceLeft((x,y) => {
                println("El valor de 'x' es: " + x + " y el de 'y' es: "+ y + " y el de 'max' es: " + (x max y))
                (x max y)
            }
    /*
            El valor de 'x' es: 1 y el de 'y' es: 2 y el de 'max' es: 2
            El valor de 'x' es: 2 y el de 'y' es: 3 y el de 'max' es: 3
            El valor de 'x' es: 3 y el de 'y' es: 4 y el de 'max' es: 4
            El valor de 'x' es: 4 y el de 'y' es: 5 y el de 'max' es: 5
    */
            )

            //var minMarks = marks.reduceLeft((x,y) => x min y)
            var minMarks = marks.reduceLeft(_ min _)
            println("Min Marks es " + minMarks)  // Min Marks es 1

            var minMarks2 = marks.reduceLeft((x,y) => {
                println("El valor de 'x' es: " + x + " y el de 'y' es: "+ y + " y el de 'min' es: " + (x min y))
                (x min y)
            }
    /*
            El valor de 'x' es: 1 y el de 'y' es: 2 y el de 'min' es: 1
            El valor de 'x' es: 1 y el de 'y' es: 3 y el de 'min' es: 1
            El valor de 'x' es: 1 y el de 'y' es: 4 y el de 'min' es: 1
            El valor de 'x' es: 1 y el de 'y' es: 5 y el de 'min' es: 1
    */
            )
        }
    }