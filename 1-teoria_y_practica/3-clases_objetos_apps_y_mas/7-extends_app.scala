/*  ======================================================
    ==================== EXTENDS APP =====================
    ======================================================
*/

//  Ambas vias podemos utilizarlas para comenzar a ejecutar nuestras aplicaciones:

//  FORMA 1
//  =======

    package curso

    object FuncionesClasesYObjetosC {

        def main(args: Array[String]): Unit = {

            println("Hola a todos!")
        }
    }

//  FORMA 2
//  =======

    package curso

    object FuncionesClasesYObjetosC extends App {

        println("Hola a todos!")

    }