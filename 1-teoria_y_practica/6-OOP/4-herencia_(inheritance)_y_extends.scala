/*  ======================================================
    ================ INHERITANCE Y EXTENDS ===============
    ======================================================
*/

//  Las clases extienden otras clases utilizando la palabra clave 'extends'.


//  EJEMPLO 1
//  ---------

    package scala

    class Animal{
        val tipoAnimal = "Salvaje"
        def comer(): String =
            "Comida"
    }

    class Gato extends Animal {
        def crunch() = {
            comer()
            println("crunch, crunch")
        }
    }

    class Persona(val nombre:String, edad:Int){

    // Constructor auxiliar
    def this(nombre:String) =
        this(nombre,0)
    }


    // Invocacion del constructor de superclase
    // Si utilizamos el mismo argumento debemos especificarlo al extender la Clase
    // class Adulto(override val nombre:String, edad:Int, idTarjeta:String) extends Persona(nombre) <--- Lo mismo
    class Adulto(nombre:String, edad:Int, idTarjeta:String) extends Persona(nombre)

    // Override una 'val' de la Clase padre
    // Override un 'metodo' de la Clase padre
    // Override el metodo 'toString' de la Clase Padre
    class Perro extends Animal {
        override val tipoAnimal = "Domestico"
        override def comer():String = s"Me gusta la ${super.comer()} de perro"
        override def toString: String = "Soy un perro de casa"
    }
    // OVERRIDE vs OVERLOAD
    class Cocodrilo extends Animal {
        override val tipoAnimal: String = "Muy salvaje"
        override def comer(): String = "Come de todo"

        // OVERLOADING: varios métodos con el mismo nombre y distinta cantidad de argumentos +
        //              tipo distinto del argumento + tipo distinto de retorno (opcional)
        def comer(animal:Animal):Unit = println(s"Me estoy comiendo a este pobre ${animal}")
        def comer(perro:Perro):Unit = println("Me estoy comiendo un perro")
        def comer(persona:Persona):Unit = println(s"Me estoy comiendo una persona con el nombre ${persona.nombre}")
        def comer(persona:Persona, perro:Perro):Unit = println("Me estoy comiendo un humano y un perro")
        def comer(perro:Perro,persona:Persona):Unit = println("Me estoy comiendo un perro y un humano")
    }

    object test {
        def main(args: Array[String]): Unit = {

            val gato = new Gato

            println(gato.comer())
            // Comida

            gato.crunch()
            /*
            Comida
            crunch, crunch
        */

            val perro = new Perro

            println(perro.comer())
            // Me gusta la Comida de perro

            println(perro)
            // Soy un perro de casa

            val cocodrilo = new Cocodrilo
            val alfonso = new Persona("Alfonso", 36)

            println(cocodrilo.tipoAnimal)  // Muy salvaje
            println(cocodrilo.comer())     // Come de todo
            cocodrilo.comer(gato)          // Me estoy comiendo a este pobre scala.Gato@340f438e
            cocodrilo.comer(perro)         // Me estoy comiendo un perro
            cocodrilo.comer(alfonso)       // Me estoy comiendo una persona con el nombre Alfonso
            cocodrilo.comer(alfonso,perro) // Me estoy comiendo un humano y un perro
            cocodrilo.comer(perro,alfonso) // Me estoy comiendo un perro y un humano
        }
    }
    

//  EJEMPLO 2
//  ---------

//  'Fruit' debe ser 'abstracta' o proporcionar una definición de 'name'

//  'val name: String' es un campo paramétrico en 'Orange' y proporciona una sobreescritura (override) a 'name'

//  Se pueden crear nuevas instancias de 'Orange', proporcionando un valor para 'name' (es el constructor)

    package scala

    abstract class Food {
        def name: String     // <============================= Metodo debe ser definido
        println("Estamos en la Clase abstracta 'Food'")
    }

    abstract class Fruit extends Food {
        println("Estamos en la Clase abstracta 'Fruit'")
    }

    class Orange(val name: String) extends Fruit {
        println("Estamos en la Clase 'Orange'")
    }

    object test {
        def main(args: Array[String]): Unit = {

            val postre = new Orange("Naranja con crema")

        }
/*
        Estamos en la Clase abstracta 'Food'
        Estamos en la Clase abstracta 'Fruit'
        Estamos en la Clase 'Orange'
*/
    }