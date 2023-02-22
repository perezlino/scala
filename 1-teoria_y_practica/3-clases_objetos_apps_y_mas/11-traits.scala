/*  ======================================================
    ======================= TRAITS =======================
    ======================================================

    Es solo una especie de plantilla que obliga a que los desarrolladores tengan que implementar el código 
    que aparece en el trait. Sería como decir que es el que contiene el 'Qué se va a hacer' mas no el 
    'Cómo se va a hacer'.


    Diferencias entre un Trait y una Class
    ======================================

    - Para un Trait no podemos generar una instancia, es decir, un objeto:
     ______________________________________________________________________
    |                                                                      | 
    |   Trait car {                                                        |                   
    |       val x = 10;                                                    | 
    |       def add() = { println(“Hola Mundo”) }                          | 
    |   }                                                                  | 
    |                                                                      | 
    |   object Demo {                                                      | 
    |       val objeto = new car()      ESTO NO ES CORRECTO                | 
    |   }                                                                  |  
    |______________________________________________________________________| 
    
    - Trait solo se utiliza para propósitos de HERENCIA (Inheritence)

    - Utilizando 'Clases' no se permite la HERENCIA MULTIPLE. Utilizando 'Traits' si es permitido.
      Podemos heredar en una 'Clase' multiples 'Traits'. Por el contrario, en una Clase podemos heredar
      solo una Clase.
    
*/


//  EJEMPLO 1
//  =========

//  Los “unimplementd methods” en el trait Car son los métodos “wheel” y “breaks”, dado que son métodos que 
//  no tienen un cuerpo, por tanto, no tienen una utilidad. Estos métodos deben estar implemetados en la Clase 
//  extendida del trait en cuestión, en este ejemplo, en la clase Mercedes.

    package curso

    trait Auto {     // keyword trait
                             
        def engine(): Unit = {             // el cuerpo está presente para el método engine()
            println ("Engine is 1000 CC")
        }

        def break()                        // el cuerpo no está presente para el método break(). Debería implementarse
                                           // en la clase que extiende el trait car
        
        def tyres()                        // el cuerpo no está presente para el método tyres(). Debería implementarse
                                           // en la clase que extiende el trait car
    }

    class Mercedes extends Auto{          // keyword es extendida

        def break(): Unit = {              // aquí se implementa el método break() no implementado
            println("Disk Breaks")
        }

        def tyres: Unit = {                // el método no implementado tyres() se implementa aquí
            println("4 Tyres")
        }
    }

    object DemoATrait {
        def main(args: Array[String]): Unit = {

            val m1 = new Mercedes
            m1.break()      // Disk Breaks
            m1.tyres        // 4 Tyres
            m1.engine()     // Engine is 1000 CC
        }
    }


//  EJEMPLO 2
//  =========
    
    package curso

    trait Trait1 {

        def imprimir(nombre:String) : Unit      // el cuerpo no está presente para el método imprimir(). Debería implementarse
    }                                           // en la clase que extiende el trait Trait1

    class Persona extends Trait1 {

        def imprimir (nombre:String):Unit = {
            println(nombre.toUpperCase)
        }
    }

    object DemoTrait {
        def main(args: Array[String]): Unit = {

            var persona1 = new Persona()
            persona1.Imprimir("alberto")    // ALBERTO
        }
    }


//  EJEMPLO 3
//  =========

    package curso

    trait TraitUno {

        var edad:Int = 0

        def imprimir(nombre:String) : Unit  // el cuerpo no está presente para el método imprimir(). Debería implementarse
                                            // en la clase que extiende el trait TraitUno
        def imprimir1:Unit = {
            println ("Metodo implementado en el trait")
        }
    }

    class People extends TraitUno {

        def imprimir(nombre:String):Unit = {
            println(nombre.toUpperCase)
        }

        override def imprimir1:Unit = {     // Podemos volver a definir el valor de un metodo heredado del trait 
            println("Estoy en la clase")    // utilizando override (para sobrescribirla).
        }
    }

    object traitExample {
        def main(args: Array[String]): Unit = {

            var persona1 = new People()
            persona1.imprimir("alberto")
            persona1.imprimir1
            persona1.edad = 20
            println(persona1.edad)
        }
/*
        ALBERTO
        Estoy en la clase
        20
*/
    }


//  EJEMPLO 4
//  =========

    package test

    trait Trait1 {
        var edad:Int = 0

        def imprimir(nombre:String) : Unit

        def imprimir1:Unit = {
            println ("Metodo implementado en el trait")
        }
    }

    trait Trait2 {
        def imprimir2():Unit
    }

    class Persona extends Trait1 with Trait2 {

        def imprimir(nombre:String):Unit = {
            println(nombre.toUpperCase)
        }

        override def imprimir1:Unit = {
            println("Estoy en la clase")
        }

        def imprimir2(): Unit = {
            println("Implementado cuerpo al metodo 'imprimir2' del Trait2")
        }
    }

    object DemoTrait {
        def main(args: Array[String]): Unit = {

            var persona1 = new Persona()
            persona1.imprimir("alberto")
            persona1.imprimir1
            persona1.edad = 20
            println(persona1.edad)
            println(persona1.imprimir2)
        }
/*
        ALBERTO
        Estoy en la clase
        20
        Implementado cuerpo al metodo 'imprimir2' del Trait2
        ()
*/
    }


/*  EJEMPLO 5
    =========

    class MercedesB extends FourWheelerB with CarB: 
    -----------------------------------------------
    Con el “with” podemos añadir más de un trait a nuestra clase.

    
    override def tyres( ): Unit = super.tyres( ): 
    ---------------------------------------------
    El método “tyres” es implementado en dos traits. Debemos utilizar esta sentencia para poder ejecutarlo.
    Se ejecutará el método “tyres” que se encuentre a la derecha de “with” en la sentencia del class, en 
    nuestro ejemplo, se ejecutará el método “tyres” del trait “CarB”.   */

    package test

    trait FourWheelerB {

        def tyres(): Unit = {
            println("4 Neumáticos estan presentes en Cuatro ruedas")
        }
    }

    trait CarB {

        def engine(): Unit = { // el cuerpo está presente para el método engine()
            println("El motor es de 1000 CC en un automovil")
        }

        def tyres(): Unit = {
            println("Un automovil tiene 4 neumaticos")
        }

        def break() // el cuerpo no está presente para el método break(). Debería implementarse
    }               // en la clase que extiende el trait CarB

    class MercedesB extends FourWheelerB with CarB {

        def break(): Unit = {                     // el cuerpo está presente para el método break()
            println("Frenos de disco en Mercedes")
        }

        override def tyres(): Unit = super.tyres()    // si el mismo método "tyres()" se implementa en
                                                      // múltiples traits, se ejecutará desde el
                                                      // trait del lado derecho
    }

    object DemoBTrait {
        def main(args: Array[String]): Unit = {

            val m1 = new MercedesB
            m1.break()
            m1.engine()
            m1.tyres()
        }
/*
        Frenos de disco en Mercedes
        El motor es de 1000 CC en un automovil
        Un automovil tiene 4 neumaticos
*/
    }