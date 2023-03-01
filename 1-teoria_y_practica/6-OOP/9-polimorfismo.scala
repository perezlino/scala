/*  ======================================================
    ==================== POLIMORFISMO ====================
    ======================================================
*/

//  EJEMPLO 1
//  ---------

//  El metodo 'mas especifico' sera llamado

    package scala

    class Animal{
        val tipoAnimal = "Salvaje"

        def comer(): String = "Comida Animal"
    }

    // Override una 'val' de la Clase padre
    // Override un 'metodo' de la Clase padre
    // Override el metodo 'toString' de la Clase Padre
    class Perro extends Animal {
        override val tipoAnimal = "Domestico"
        override def comer():String = s"Me gusta la ${super.comer()} de perro"
        override def toString: String = "Soy un perro de casa"
    }

    object test {
        def main(args: Array[String]): Unit = {

            // Polimorfismo
            val perro:Animal = new Perro

            println(perro.comer())
            // Me gusta la Comida de perro

            println(perro)
            // Soy un perro de casa
        }
    }

