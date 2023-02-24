/*  ======================================================
    ================= DEFINIR UNA CLASE ==================
    ======================================================
*/

//  Si queremos acceder directamente a los parametros de la Clase 'Alumno' desde las instancias, DEBEMOS
//  especificar EXPLICITAMENTE 'val' (si solo queremos visualziarlas) o 'var' (si queremos visualizarlas 
//  o modificarlas)

    package scala

    class Alumno (nombre:String, apellidos:String){

        var edad:Int =_ 

    def visualizar():Unit = {
        println(nombre)
        println(apellidos)
        println(edad)
    }
    }

    object test {
        def main(args: Array[String]): Unit = {

            var alumno1 = new Alumno("Alfonso","Perez")

            println(alumno1.nombre) // ERROR

        }
    }

//  MANERA CORRECTA

    package scala

    // Se especifica EXPLICITAMENTE 'val'. Si queremos lo hacemos para uno o para todos los parametros
    class Alumno (val nombre:String, val apellidos:String){

        var edad:Int =_ 

    def visualizar():Unit = {
        println(nombre)
        println(apellidos)
        println(edad)
    }
    }

    object test {
        def main(args: Array[String]): Unit = {

            var alumno1 = new Alumno("Alfonso","Perez")

            // Al utilizar 'val' solo podemos visualizar PERO NO MODIFICAR
            println(alumno1.nombre) // Alfonso

        }
    }