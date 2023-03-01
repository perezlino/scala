/*  ======================================================
    ============= CLASES Y CLASES ABSTRACTAS =============
    ======================================================
*/

//  Una definición de clase puede tener nuevas instancias creadas para ella

    package scala

    class Person(name: String, age: Int) {

        def isAdult: Boolean = age >= 21
    }

    object test {
        def main(args: Array[String]): Unit = {

            val p1 = new Person("Dave", 18) 
            val p2 = new Person("Jill", 25) 

            println(p1) // scala.Person@7f63425a
            println(p2) // scala.Person@36d64342

            println(p1.isAdult) // false
            println(p2.isAdult) // true
        }
    }

//  Como no está marcado como 'abstract', puedes crear una nueva instancia.

//  También porque no está marcado como 'abstract', todos los campos y métodos deben tener definiciones

//  Cuando llamas a 'new' en Scala, siempre obtienes una nueva instancia

//  'eq' es la igualdad de instancia en Scala, mientras que '==' siempre llama a '.equal'

    "hello".eq("hello") // true
    new String("hello").eq(new String("hello")) // false