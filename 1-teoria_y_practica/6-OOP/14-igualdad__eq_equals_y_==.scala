/*  ======================================================
    ============ IGUALDAD - EQ, EQUALS Y '==' ============
    ======================================================
*/

//  'eq' es la igualdad de instancia en Scala, mientras que '==' siempre llama a '.equals'
//  'equals' es la igualdad por valor.

    package scala

    class Persona {
        val numero = 50
        def metodo(x:Int) = x + 1
    }

    object test {
        def main(args: Array[String]): Unit = {

            // ------------------------- Ejemplo 1 -------------------------

            println("hello".eq("hello")) // true
            println(new String("hello").eq(new String("hello"))) // false

            println("hello" == "hello") // true
            println(new String("hello") == (new String("hello"))) // true

            println("hello" equals "hello") // true
            println(new String("hello") equals (new String("hello"))) // true

            // ------------------------- Ejemplo 2 -------------------------

            val persona1 = new Persona
            println(persona1)  // scala.Persona@511baa65

            val persona2 = new Persona
            println(persona2)  // scala.Persona@340f438e

            println(persona1 eq persona2)  // false
            println(persona1 == persona2)  // false
            println(persona1 equals persona2)  // false
            
        }
    }