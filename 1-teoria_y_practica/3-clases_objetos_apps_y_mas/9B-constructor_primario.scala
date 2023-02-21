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
