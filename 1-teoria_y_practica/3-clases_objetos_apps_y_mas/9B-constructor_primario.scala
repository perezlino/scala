/*  ======================================================
    == CONSTRUCTOR PRIMARIO (CONSTRUCTOR PARAMETRIZADO) ==
    ======================================================
*/

//  Al crear un objeto, este por debajo, llama a un constructor. El constructor ejecutará todo lo que hay 
//  dentro de la clase.

//  EJEMPLO 1
//  =========

    package curso

    class DemoClass {
        println("Se inicia el Constructor")

        val x = 3   // var <= puede cambiar el valor de la variable
        val y = 2   // val <= no puede cambiar

        def addNumber:Int = {
            x + y
        }

        println(s"x = ${x} e y = ${y}")

        val z = addNumber
        println(s"z = ${z}")
    }

    object FuncionesClasesYObjetosF {
        def main(args: Array[String]): Unit = {

            println("Bienvenido Alfonso!")    // Bienvenido Alfonso!

            val demoObject1 = new DemoClass   // - Creamos un Objeto
                                              // - Instancia de una Clase
                                              // - Constructor: Ejecutará todo lo que se encuentre dentro
                                              //                de la Clase 'DemoClass'
        }
/*
            Se inicia el Constructor
            x = 3 e y = 2
            z = 5
*/
    }
    

//  EJEMPLO 2
//  =========

    package curso

    class Producto (var cod_producto:Int, var nombre:String){

        println("Se inicia el Constructor")

        def imprimir:Unit = {       // Notar que el 'Unit' lo utilizamos cuando queremos devolver 'println'
                                    // Es similar al 'void' en Java
            println(s"El codigo es ${cod_producto} y se llama ${nombre}")
        }

        println("Seguimos en el Constructor")
    }

    object FuncionesClasesYObjetosG {
        def main(args: Array[String]): Unit = {

            var producto1 = new Producto(10, "Tornillos")
            producto1.imprimir
            producto1.nombre = "Tuercas"    // Si el parametro de la Clase fuese 'val nombre:String' 
            producto1.imprimir              // no podriamos modificarlo

        }
/*
        Se inicia el Constructor
        Seguimos en el Constructor
        El codigo es 10 y se llama Tornillos
        El codigo es 10 y se llama Tuercas
*/
    }


//  EJEMPLO 3
//  =========

    package curso

// Program no 2: Parametrized Constructor (Primary constructor)

    class demoClass1(val a:Int, val b:Double, val c:String){
        val x = a       // var (puede cambiar el valor) y val (no puede cambiar el valor):
        var y = b       /* recuperar(GET) y modificar(SET) el contenido de y porque es
                            un var >>> INTERNAMENTE SCALA CREA 2 METODOS - GETTER Y SETTER */
        val z = c       /* SOLO recupera(GET) el contenido de y porque es un val () >>>
                            INTERNAMENTE SCALA CREA SOLO 1 MÉTODO - GETTER */

        def addNumber() = {
            x + y
        }

        println(s"x = ${x} , y = ${y} y z = ${z}")

    }

    object constructorDemo1 {
        def main(args: Array[String]): Unit = {

            val demoObject1 = new demoClass1(5,7.2,"Hello World!")  //Objeto: Instancia de la clase -> Llama al Constructor
            val demoObject2 = new demoClass1(6,8.3,"Hello World Again!")  //Objeto: Instancia de la clase -> Llama al Constructor

            /*  demoObject1.x =       No se puede cambiar(sólo recuperar) el contenido de 'x' ya que se definió como val en la clase y
                                    por lo que sólo tiene método getter   */


            demoObject1.y = 7.22222 /* puede recuperar y cambiar el contenido de 'y' ya que fue definido como var en la clase y
                                    por lo que tiene métodos getter y setter    */

            println(demoObject1.x, demoObject1.y,demoObject1.z)
            var result = demoObject1.addNumber()
            println(s"result = ${result}")

            println(demoObject2.x, demoObject2.y,demoObject2.z)
            result = demoObject2.addNumber()
            println(s"result = ${result}")

        }
/*
            x = 5 , y = 7.2 y z = Hello World!
            x = 6 , y = 8.3 y z = Hello World Again!
            (5,7.22222,Hello World!)
            result = 12.22222
            (6,8.3,Hello World Again!)
            result = 14.3
*/
    }


//  EJEMPLO 4
//  =========

    package curso

    class demoClass2(val a:Int = 99, val b:Double = 88.88, val c:String = "Hola Scala"){

        val x = a
        var y = b
        val z = c

        def addNumber() = {
            x + y
        }

        println(s"x = ${x} , y = ${y} y z = ${z}")
    }


    object constructorDemo2 {
        def main(args: Array[String]): Unit = {
            
            val demoObject1 = new demoClass2(5,7.2,"Hola Mundo!")
            val demoObject2 = new demoClass2()
            val demoObject3 = new demoClass2(25)
            //  val demoObject4 = new demoClass2("Hello") - Debes pasar los parámetros en el orden correcto,
            //                                              véase el siguiente ejemplo
            val demoObject5 = new demoClass2(c = "Hola")
            val demoObject6 = new demoClass2(c = "Hola", a = 5, b = 6.6)
            //  val demoObject7 = new demoClass2( , , "hola") - No se puede hacer
            //  val demoObject8 = new demoClass2(a, b, "hola") - No se puede hacer, no sabe lo que es 'a'
            //                                                     y 'b', puede hacerse como sigue a continuacion
            val demoObject9 = new demoClass2(a = 5, b = 5.5, "Hola")
        }
    }
    x = 5 , y = 7.2 y z = Hola Mundo!
    x = 99 , y = 88.88 y z = Hola Scala
    x = 25 , y = 88.88 y z = Hola Scala
    x = 99 , y = 88.88 y z = Hola
    x = 5 , y = 6.6 y z = Hola
    x = 5 , y = 5.5 y z = Hola