/*  ======================================================
    ============== NIVEL DE ACCESO EN SCALA ==============
    ======================================================


    - public: puede acceder en cualquier lugar (Por defecto)
      ------

    - private: se puede acceder sólo en la clase que se define
      -------

    - protected: se puede acceder en la clase que se define, así como en la subclase que extiende la clase 
      ---------  dada utilizando la herencia
      
*/

//  Las variables llevan por defecto un 'public' antepuesto. No es necesario colocarlo.

    package curso

    class Car {
        public var topClassExtraCost = 0    // No es necesario anteponer 'public'
        public var roadTax = 100

        def cost(basicCost: Int) = basicCost + topClassExtraCost + roadTax
    }

//  Las variables 'private' solo pueden ser utilizadas en la clase donde fueron definidas. Fuera de la clase 
//  vemos que nos aparece un Error al tratar de utilizar la variable privada.

    package curso

    class Car {
        var topClassExtraCost = 0
        private var roadTax = 100

        def cost(basicCost: Int) = basicCost + topClassExtraCost + roadTax
    }


    object FuncionesClasesYObjetosB {

        def main(args: Array[String]): Unit = {

            println("Bienvenido Cliente!")

            var bmw = new Car
            println(bmw.roadTax)    // <== Se genera un error en la variable 'roadTax'
            bmw.roadTax = 400
            println(bmw.roadTax)    // <== Se genera un error en la variable 'roadTax'

            var ford = new Car
            println(ford.roadTax)   // <== Se genera un error en la variable 'roadTax'
    
        }
    }

//  Las variables 'protected' pueden ser utilizas en la clase donde fueron definidas y en las Clases hijas.

    package curso

    class Car {
        var topClassExtraCost = 0
        private var roadTax = 100
        protected var xyz = 3000

        def cost(basicCost: Int) = basicCost + topClassExtraCost + roadTax
    }

    class smallCar extends Car { // No se imprimira nada, solo se utilizo 'println' para demostrar que variables
                                 // podemos utilizar

        println(xyz)            // La variable es accesible desde la Clase hija
        println(roadTax)        // <== Se genera un error en la variable 'roadTax' 
    }


    object FuncionesClasesYObjetosB {

        def main(args: Array[String]): Unit = {

            println("Bienvenido Cliente!")

            var bmw = new Car
            println(bmw.roadTax)   // <== Se genera un error en la variable 'roadTax'
            bmw.roadTax = 400
            println(bmw.roadTax)   // <== Se genera un error en la variable 'roadTax'

            var ford = new Car
            println(ford.roadTax)   // <== Se genera un error en la variable 'roadTax'

        }
    }