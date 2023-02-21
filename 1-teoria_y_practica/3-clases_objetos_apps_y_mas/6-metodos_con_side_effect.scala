/*  ======================================================
    ============== METODOS CON SIDE-EFFECT ===============
    ======================================================
*/

//  EJEMPLO 1
//  =========

    package curso

    class Car {
        var topClassExtraCost = 0
        private var roadTax = 100

        def cost(basicCost: Int) = basicCost + topClassExtraCost + roadTax
    }

    object FuncionesClasesYObjetosB {

        def main(args: Array[String]): Unit = {

            println("Bienvenido Cliente!")      // Bienvenido Cliente!

            var bmw = new Car
            bmw.topClassExtraCost = 400

            var resultado = bmw.cost(10000)
            println("El costo total del auto es: " + resultado)     // El costo total del auto es: 10500

        }
    }

//  EJEMPLO 2
//  =========

    package curso

    class Car {
        var topClassExtraCost = 0
        private var roadTax = 100

        def cost(basicCost: Int) = basicCost + topClassExtraCost + roadTax

        def checkTax(): Int = {     // Notar que podemos devolver un atributo 'privado'
            roadTax                 // dentro de un metodo
        }
    }

    object FuncionesClasesYObjetosB {

        def main(args: Array[String]): Unit = {

            println("Bienvenido Cliente!")          // Bienvenido Cliente!

            var bmw = new Car
            bmw.topClassExtraCost = 400

            println("El valor de RoadTax es: " + bmw.checkTax())    // El valor de RoadTax es: 100

            var resultado = bmw.cost(10000)
            println("El costo total del auto es: " + resultado)     // El costo total del auto es: 10500

        }
    }
    

//  EJEMPLO 3
//  =========

    package curso

    class Car {
        var topClassExtraCost = 0
        private var roadTax = 100

        def cost(basicCost: Int) = basicCost + topClassExtraCost + roadTax

        def checkTax(): Int = {
            roadTax = 300       
            roadTax         // Lo utilizamos porque si no lo hacemos se genera un error. El porque 'tecnico'
        }                   // tengo que averiguarlo. 
    }

    object FuncionesClasesYObjetosB {

    def main(args: Array[String]): Unit = {

        println("Bienvenido Cliente!")      // Bienvenido Cliente!

        var bmw = new Car
        bmw.topClassExtraCost = 400

        println("El valor de RoadTax es: " + bmw.checkTax())    // El valor de RoadTax es: 300

        var resultado = bmw.cost(10000)
        println("El costo total del auto es: " + resultado)     // El costo total del auto es: 10700

    }
    }

//  EJEMPLO 4
//  =========    
    
    package curso

    class Car {
        var topClassExtraCost = 0
        private var roadTax = 100

        def cost(basicCost: Int) = basicCost + topClassExtraCost + roadTax

        def checkTax(): Unit = {        // Notar que el 'return type' ahora lo colocamos como 'Unit'
            roadTax = 300               // de esta manera no genera error, pero, no devuelve el valor
        }                               // numerico de 'roadTax'

        def printTax():Int = roadTax    // Ambos metodos son lo mismo. Con () y sin ()

        def printTaxb:Int = roadTax
    }

    object FuncionesClasesYObjetosB {

        def main(args: Array[String]): Unit = {

            println("Bienvenido Cliente!")      // Bienvenido Cliente!

            var bmw = new Car
            bmw.topClassExtraCost = 400

            println("El valor de RoadTax es: " + bmw.checkTax())    // El valor de RoadTax es: ()

            println("El valor de RoadTax es: " + bmw.printTax())    // El valor de RoadTax es: 300

            println("El valor de RoadTax es: " + bmw.printTaxb)     // El valor de RoadTax es: 300

            var resultado = bmw.cost(10000)
            println("El costo total del auto es: " + resultado)     // El costo total del auto es: 10700

        }
    }