/*  ======================================================
    ============ SIMPLE CLASS AND OBJECT DEMO ============
    ======================================================
*/

//  EJEMPLO 1
//  =========

    package curso

    class Car {
        var topClassExtraCost = 0
        var roadTax = 100

        def cost(basicCost: Int) = basicCost + topClassExtraCost + roadTax
    }

    object FuncionesClasesYObjetosB {

        def main(args: Array[String]): Unit = {   // Metodo 'main'

            println("Bienvenido Cliente!")      // Bienvenido Cliente!

            var bmw = new Car
            println(bmw.cost(200))              // 300
            println(bmw.topClassExtraCost)      // 0
            println(bmw.roadTax)                // 100

        }

    }

//  EJEMPLO 2
//  =========

    package curso

    class Car {
        var topClassExtraCost = 0
        var roadTax = 100

        def cost(basicCost: Int) = basicCost + topClassExtraCost + roadTax
    }

    object FuncionesClasesYObjetosB {

        def main(args: Array[String]): Unit = {

            println("Bienvenido Cliente!")      // Bienvenido Cliente!

            var bmw = new Car                   
            println(bmw.roadTax)                // 100
            bmw.roadTax = 400
            println(bmw.roadTax)                // 400

            var ford = new Car
            println(ford.roadTax)               // 100

        }

    }