/*  ======================================================
    ====================== HERENCIA ======================
    ======================================================
*/

    package curso

    class Vehiculo {
        var cv:Int =_
        var bastidor:String =_

        def visualizarDatos():Unit = {
            println(s"Tiene $cv caballos fuerza")
        }
    }

    class Coche extends Vehiculo {
        var ruedas:Int =_

        def verDatosCoche:Unit = {
            println(s"El vehiculo tiene $ruedas ruedas")
        }
    }

    object FuncionesClasesYObjetosE {
        def main(args: Array[String]): Unit = {
            var coche1 = new Coche
            coche1.cv = 100
            coche1.ruedas = 4
            coche1.visualizarDatos()    // Tiene 100 caballos fuerza
            coche1.verDatosCoche        // El vehiculo tiene 4 ruedas
        }
    }  