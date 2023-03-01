/*  ======================================================
    ================== CLASES ABSTRACTAS =================
    ======================================================
*/

//  Por el contrario, no se puede llamar new a una clase marcada como 'abstracta'.

    package scala

    import java.time.LocalDate

    abstract class Car(make: String, model: String, year: Int) {

        def isVintage: Boolean = LocalDate.now.getYear - year > 20
    }

    object test {
        def main(args: Array[String]): Unit = {

            // val mustang = new Car("Ford", "Mustang", 1965)
            // Error: la clase Car es abstracta; no puede ser instanciada

            // sin embargo
            val mustang = new Car("Ford", "Mustang", 1965) {}
        }
    }

//  Cuando se incluye un cuerpo vacío, se crea una nueva clase concreta anónima (anonymous concrete class)

//  En las clases abstractas también se pueden omitir las definiciones de campos y métodos:

    abstract class Car(make: String, model: String, year: Int) {
        def isVintage: Boolean
    }


//  SOBREESCRIBIR UN METODO DE UNA CLASE ABSTRACT
//  =============================================

//  Un 'val' puede sobrescribir un 'def', pero no al revés

    package scala

    import java.time.LocalDate

    abstract class Car(val make: String, val model: String, val year: Int) {

        def isVintage: Boolean
    }

    object test {
        def main(args: Array[String]): Unit = {

            // val mustang = new Car("Ford", "Mustang", 1965)
            // Error: la clase Car es abstracta; no puede ser instanciada

            // LocalDate.now.getYear ==> Devuelve un 'Int' ==> 2023
            // println(LocalDate.now.getYear) ==> 2023

            // La sobreescritura la realizamos dentro de los {}
            val mustang = new Car("Ford", "Mustang", 1965) {
            // val isVintage = 2023 - 1965 > 20
            val isVintage = LocalDate.now.getYear - year > 20
            }

            println(mustang.isVintage)  // true
        }
    }
