/*  ======================================================
    ===================== CASE CLASS =====================
    ======================================================


    Con la clase case obtienes:

    - Campos paramétricos inmutables por defecto (no necesita val)
    - Un bonito método 'toString'
    - Equals y hashCode
    - Método factory (apply) (no es necesario new)
    - Más (se verá más adelante)
*/

//  COMPARACION ENTRE 'case class' Y 'class'
//  ========================================

//  case class
//  ----------

    package scala

    import java.time.LocalDate

    case class Car(make: String, model: String, year: Int) {
        lazy val isVintage: Boolean =
            LocalDate.now.getYear - year > 20
    }

    object test {
        def main(args: Array[String]): Unit = {

            val mustang = Car("Ford", "Mustang", 1965)  // <----- 1. No necesitamos escribir 'new'

            println(mustang) // Car(Ford,Mustang,1965)  // <----- 2. Autoimplementa el metodo 'toString'

            println(mustang.make)       // Ford         // <----- 3. Podemos acceder a los parametros de la Clase 'Car'
            println(mustang.model)      // Mustang                   sin escribir explicitamente 'val' o 'var' en cada 
            println(mustang.year)       // 1965                      parametro de la Clase 'Car'.
            println(mustang.isVintage)  // true

            println(mustang == Car("Ford", "Mustang", 1965))  // true    // <----- 4. Evalua el valor y no la referencia. Es
            println(mustang == Car("Ford", "Mustang", 1964))  // false                decir, modifica el '==' que compara si  
        }                                                                //           son 'el mismo objeto' y lo transforma a     
    }                                                                    //           al comportamiento de un 'equals', que 
                                                                         //           compara dos objetos de referencia por el 
                                                                         //           'valor'.


//  class
//  -----

    package scala

    import java.time.LocalDate

    class Car(val make: String, val model: String, val year: Int) {  // <----- 1. Necesitamos escribir 'val' para
        lazy val isVintage: Boolean =                                //           hacer publico el parametro de la Clase             
            LocalDate.now.getYear - year > 20
    }

    object test {
        def main(args: Array[String]): Unit = {

            val mustang = new Car("Ford", "Mustang", 1965)      // <----- 2. Necesitamos escribir 'new'

            println(mustang)            // scala.Car@7f63425a   // <----- 3. No autoimplementa el metodo 'toString'
            println(mustang.make)       // Ford
            println(mustang.model)      // Mustang
            println(mustang.year)       // 1965
            println(mustang.isVintage)  // true

            println(mustang == new Car("Ford", "Mustang", 1965))  // false   // <----- 4. Compara por referencia. Son el mismo
            println(mustang == new Car("Ford", "Mustang", 1964))  // false                objeto? No.
        }
    }