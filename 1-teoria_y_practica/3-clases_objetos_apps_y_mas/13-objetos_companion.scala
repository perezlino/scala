/*  ======================================================
    ================= OBJETOS COMPANION ==================
    ======================================================
*/

// 	- La clase y el Objeto tienen el mismo nombre
//  - Un Objeto en el mismo archivo fuente con el mismo nombre que la Clase (o Trait)
// 	- Puedo usar una variable & método definido en una Clase dentro del Objeto. 
// 	- Puedo usar una variable & método definido en un Objeto dentro de la Clase.
//  - Los objetos companion, tanto la clase como el objeto, deben estar SIEMPRE en el mismo archivo.
//  - Comparte estado private y comportamiento con la clase (y viceversa)
//  - La alternativa de Scala a static

//  EJEMPLO 1
//  =========

    package curso

    class CompanionDemo {

        var x = 5

        def getValue(): Unit ={
            println(s"El valor de x es ${x} y el valor de y es: ${CompanionDemo.y}" )
        }
    }

    object CompanionDemo {

        var y = 2.2

        def main(args: Array[String]): Unit = {

            val objectForCompanionDemoClass = new CompanionDemo()
            println(s"El valor de x cuando se recupera del objeto companion es ${objectForCompanionDemoClass.x}")
            println(s"El valor de y es ${y}")

            objectForCompanionDemoClass.getValue
        }
/*
        El valor de x cuando se recupera del objeto companion es 5
        El valor de y es 2.2
        El valor de x es 5 y el valor de y es: 2.2
*/
    }


//  EJEMPLO 2
//  =========

    package curso
    
    class Estudiante(var nombre:String, var apellidos :String, var tipo: String) {
    
    //  Cada clase tiene un método 'toString' que puede ser sobreescrito:

    //  println("Nombre:" + nombre + " " + apellidos + " " + tipo)  ===> Estudiante@2f67a4d3
        override def toString: String = "Nombre:" + nombre + " " + apellidos + " " + tipo
    }
    
    object Estudiante {
    
        val TIPO_VIP = "VIP"
        val TIPO_NORMAL = "NORMAL"
        
        def estatico = {
            println("Esto es un metodo estatico")
        }
    }
    
    object CompanionObject {
        def main(args: Array[String]): Unit = {
            
            var estudiante1 = new Estudiante("Alberto","Perez",tipo = Estudiante.TIPO_VIP)
            Estudiante.estatico
            println(estudiante1)
        }
/*
        Esto es un metodo estatico
        Nombre:Alberto Perez VIP
*/
    }