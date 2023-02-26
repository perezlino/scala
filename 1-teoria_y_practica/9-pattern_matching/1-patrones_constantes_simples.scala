/*  ======================================================
    ============ PATRONES CONSTANTES SIMPLES =============
    ======================================================
*/


//  En su uso más simple, el match de Scala es como el switch de Java:

    def matchIt(x: Any): Unit = x match {
        case 10 => println("The number 10")
        case true => println("This is the truth")
        case 2.0 => println("Double precision 2.0")
        case "hello" => println("Well, hi there")
        case () => println("Unit")
        case _ => println("It's something else")
    }
    matchIt(10) // The number 10
    matchIt(2.0) // Double precision 2.0
    matchIt("hello") // Well, hi there
    matchIt(()) // Unit
    matchIt(3) // It's something else

//  case _ es el equivalente de default en Java. El guión bajo _ es un comodín.

// -----------------------------------------------------------------------------------------------

//  'match' es una expresion.

//  Los casos se comprueban en orden, y la primera coincidencia con éxito consume el evento 'match'

//  A diferencia de Java, 'match' de Scala es también una expresión

    def pair(s: String): String = s match {
        case "fish"     => "chips"
        case "bacon"    => "eggs"
        case "tea"      => "scones"
        case "horse"    => "carraige"
    }

    pair("fish")    // val res5: String = chips
    pair("tea")     // val res6: String = scones
    pair("universe") // scala.MatchError: universe (of class java.lang.String)

// -----------------------------------------------------------------------------------------------

    def eligeColor(color: String): String = color match {
        case color if(color == "red" || color == "green") => println("rojo o verde")
        case "blue" | "yellow" => println("azul o amarillo")
        case _ => println("otro color")
    }

    eligeColor("green") // val res6: String = rojo o verde