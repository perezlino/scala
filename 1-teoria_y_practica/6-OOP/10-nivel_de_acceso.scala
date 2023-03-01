/*  ======================================================
    ================== NIVEL DE ACCESO ===================
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


//  EJEMPLO 1
//  ---------

//  En la Clase padre 'Persona' se crearon dos metodos: uno 'publico' y uno 'privado'. 
//  Vamos a llamar al metodo 'publico' ---> 'saludo()' desde sus Clases hijas.
//  El metodo 'privado' solo se puede llamar de la misma Clase 'Persona'.

    package scala

    class Persona(val nombre:String){
        def saludo():String = s"Hola, mi nombre es $nombre "
        private def mirarNetflix():String = "Estoy viendo mi serie favorita"  // Acceso solo en la misma clase
    }

    // Invocacion de constructor superclase
    class Joven(override val nombre:String, edad:Int) extends Persona(nombre){
        def saludarCortesmente():String =
            saludo() + "y me gusta jugar videojuegos"
    }

    // Invocacion de constructor superclase
    class JovenConPadres(override val nombre:String, edad:Int, 
                            nombreMadre:String, nombrePadre:String) extends Persona(nombre){
        val madre = new Persona(nombreMadre)
        val padre = new Persona(nombrePadre)

        println(madre.saludo())
        println(padre.saludo())

        def todosSaludan():String =
            s"Hola, mi nombre es $nombre y aca estan mis padres: " + madre.saludo() + padre.saludo()
    }

    object test {
        def main(args: Array[String]): Unit = {

            val persona = new Persona("Alfonso")
            val joven = new Joven("Tomas", 15)
            val jovenConPapas = new JovenConPadres("Andres", 20, "Victoria", "Alfredo")

            println(joven.saludo())
            println(joven.saludarCortesmente())
            println(jovenConPapas.saludo())
            println(jovenConPapas.todosSaludan())
        }
/*
        Hola, mi nombre es Victoria  <------- Se imprime al instanciar un Objeto de la Clase 'JovenConPadres'
        Hola, mi nombre es Alfredo   <------- Se imprime al instanciar un Objeto de la Clase 'JovenConPadres'
        Hola, mi nombre es Tomas
        Hola, mi nombre es Tomas y me gusta jugar videojuegos
        Hola, mi nombre es Andres
        Hola, mi nombre es Andres y aca estan mis padres: Hola, mi nombre es Victoria Hola, mi nombre es Alfredo
*/
    }


//  EJEMPLO 2.A
//  -----------

//  En la Clase padre 'Persona' se crearon dos metodos: uno 'protected' y uno 'privado'. 
//  Vamos a llamar al metodo 'protected' ---> 'saludo()' desde sus Clases hijas.
//  El metodo 'privado' solo se puede llamar de la misma Clase 'Persona'.
//  Al tratar de llamar al metodo 'protected' de la Clase padre TODO nos devuelve error. 
//  Entonces que hacemos???

    package scala

    class Persona(val nombre:String){
        protected def saludo():String = s"Hola, mi nombre es $nombre "
        private def mirarNetflix():String = "Estoy viendo mi serie favorita"  // Acceso solo en la misma clase
    }

    // Invocacion de constructor superclase
    class Joven(override val nombre:String, edad:Int) extends Persona(nombre){
        def saludarCortesmente():String =
            saludo() + "y me gusta jugar videojuegos"
    }

    // Invocacion de constructor superclase
    class JovenConPadres(override val nombre:String, edad:Int, 
                            nombreMadre:String, nombrePadre:String) extends Persona(nombre){
        val madre = new Persona(nombreMadre)
        val padre = new Persona(nombrePadre)

        println(madre.saludo()) // Al instanciar un Objeto de esta clase enviara un Error!
        println(padre.saludo()) // Al instanciar un Objeto de esta clase enviara un Error!

        def todosSaludan():String =
            s"Hola, mi nombre es $nombre y aca estan mis padres: " + madre.saludo() + padre.saludo()

        def saludoFamiliar():String =
            saludo() + "y les envio un cordial de saludo junto a mi familia"
    }

    object test {
        def main(args: Array[String]): Unit = {

            val persona = new Persona("Alfonso")
            val joven = new Joven("Tomas", 15)
            val jovenConPapas = new JovenConPadres("Andres", 20, "Victoria", "Alfredo")

            println(joven.saludo())                 // Error!
            println(joven.saludarCortesmente())     // Error! 
            println(jovenConPapas.saludo())         // Error!
            println(jovenConPapas.todosSaludan())   // Error!
            println(jovenConPapas.saludoFamiliar()) // Error!
        }
    }


//  EJEMPLO 2.B
//  -----------

    package scala

    class Persona(val nombre:String){
        protected def saludo():String = s"Hola, mi nombre es $nombre "
        private def mirarNetflix():String = "Estoy viendo mi serie favorita"  // Acceso solo en la misma clase
    }

    // Invocacion de constructor superclase
    class Joven(override val nombre:String, edad:Int) extends Persona(nombre){
        def saludarCortesmente():String =
            this.saludo() + "y me gusta jugar videojuegos"  // <------------ Le agregue el 'this' al metodo
    }

    // Invocacion de constructor superclase
    class JovenConPadres(override val nombre:String, edad:Int, 
                            nombreMadre:String, nombrePadre:String) extends Persona(nombre){
        val madre = new Persona(nombreMadre)
        val padre = new Persona(nombrePadre)

        //println(madre.saludo())  <---------- ESTO NO SE HACE NUNCA. NO HAY SOLUCION
        //println(padre.saludo())  <---------- ESTO NO SE HACE NUNCA. NO HAY SOLUCION

        //def todosSaludan():String =   
            //s"Hola, mi nombre es $nombre y aca estan mis padres: " + 
            //  madre.saludo() + padre.saludo()               <---------- ESTO NO SE HACE NUNCA. NO HAY SOLUCION   

        def saludoFamiliar():String =
            this.saludo() + "y les envio un cordial saludo junto a mi familia"  // <------------ Le agregue el 'this' al metodo
    }   

    object test {
        def main(args: Array[String]): Unit = {

            val persona = new Persona("Alfonso")
            val joven = new Joven("Tomas", 15)
            val jovenConPapas = new JovenConPadres("Andres", 20, "Victoria", "Alfredo")

            //println(joven.saludo)
            println(joven.saludarCortesmente())      // Hola, mi nombre es Tomas y me gusta jugar videojuegos
            //println(jovenConPapas.saludo())        //
            //println(jovenConPapas.todosSaludan())  //
            println(jovenConPapas.saludoFamiliar())  // Hola, mi nombre es Andres y les envio un cordial saludo junto a mi familia
        }
    }