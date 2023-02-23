/*  ======================================================
    ================= MATCH EXPRESSIONS ==================
    ======================================================
*/

//  La progresión de las pruebas sólo continúa hasta la primera coincidencia de todo a la izquierda del =>

//  EJEMPLO 1
//  =========

//  Como 'switch' de Java, pero más potente:

    val x = 1

    x match {
    case 1 => println("it's one")
    case 2 => println("it's two")
    case _ => println("it's something else")
    }
/*
    val x: Int = 1

    it's one
*/


//  EJEMPLO 2
//  =========

//  Es una expresión:

    val res = x match {
        case 1 => "one"
        case 2 => "two"
        case _ => "something else"
    }
//  val res: String = one


//  EJEMPLO 3
//  =========

// 'v' toma el valor de 'n'

    val n = -1

    n match {
        case 0 => "It's zero"
        case v if n > 0 => s"It's positive $v"
        case v => s"It's negative ${v.abs}"
    }
//  val res1: String = It's negative 1


//  EJEMPLO 4
//  =========

    def matchIt(x: Any): String = x match {
        case "Hello" => "Well, hello back"
        case 1 :: rest => s"A list beginning with 1, rest is $rest"
        case Nil => "The empty list"
        case 5 => "The number 5"
        case _: List[_] => "Some kind of list, not empty and not starting with 1"
    }

    matchIt(5) 
    matchIt(List(1,2,3)) 
    matchIt(List(1)) 
    matchIt(List(2,3)) 
    matchIt(Nil) 
    matchIt(2.0) // Exception!: MatchError
/*
    val res2: String = The number 5
    val res3: String = A list beginning with 1, rest is List(2, 3)
    val res4: String = A list beginning with 1, rest is List()
    val res5: String = Some kind of list, not empty and not starting with 1
    val res6: String = The empty list
*/