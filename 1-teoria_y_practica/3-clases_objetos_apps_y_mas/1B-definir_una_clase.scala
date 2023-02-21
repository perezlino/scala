/*  ======================================================
    ================= DEFINIR UNA CLASE ==================
    ======================================================
*/

//  Los parámetros (nombre y apellidos) de una clase (Alumno) son 'val', por tanto, si se quieren modificar 
//  se debe anteponer un 'var' 

    package curso

//  class Alumno (val nombre:String, val apellidos:String){  <========== Es lo mismo
    class Alumno (nombre:String, apellidos:String){

        var edad:Int =_  // Inicializar variable por defecto

        def visualizar():Unit = {
            println(nombre)
            println(apellidos)
            println(edad)
        }
    }

    object FuncionesClasesYObjetosD {

        def main(args: Array[String]): Unit = {

            var alumno1 = new Alumno("Alfonso","Perez")
            println(alumno1)            // curso.Alumno@7f63425a
            println(alumno1.toString)   // curso.Alumno@7f63425a
            alumno1.edad = 10
            println(alumno1.edad)       // 10
            alumno1.visualizar()        // Alfonso
                                        // Perez
                                        // 10
        }
    }