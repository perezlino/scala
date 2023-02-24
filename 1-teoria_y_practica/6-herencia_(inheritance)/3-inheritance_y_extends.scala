/*  ======================================================
    ================ INHERITANCE Y EXTENDS ===============
    ======================================================
*/

//  Las clases extienden otras clases utilizando la palabra clave 'extends'.

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