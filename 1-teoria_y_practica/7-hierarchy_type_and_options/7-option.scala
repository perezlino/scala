/*  ======================================================
    ======================= OPTION =======================
    ======================================================
*/    

//  'null' es la ausencia de una instancia. El compilador no puede ayudarte:

    val s1: String = "hello"
    val s2: String = null

    s1.length  // <----- val res0: Int = 5
    // s2.length  <----- compila, pero lanzará una Excepcion

//  -----------------------------------------------------------------------------------------------------    

//  Hacer un tipo 'Option' significa que el compilador te cubre las espaldas.
//  Esto toma un error común en tiempo de ejecución, y lo traslada a un problema en tiempo de compilación

    val os1: Option[String] = Some("hello")
    val os2: Option[String] = None

    // os1.length <----- No compila "value length is not a member of Option[String]"
    // os2.length <----- No compila "value length is not a member of Option[String]"

    os1.map(_.length)  // val res2: Option[Int] = Some(5)
    os2.map(_.length)  // val res3: Option[Int] = None

//  -----------------------------------------------------------------------------------------------------     

//  Option es compatible con las librerías básicas y las API de terceros.

    val numWords = Map(1 -> "one", 2 -> "two", 3 -> "three")

    numWords(1)  // <----- val res4: String = one
    // numWords(4)  <----- compila, pero lanzará una Excepcion

    val word1 = numWords.get(1)  // val word1: Option[String] = Some(one)
    val word2 = numWords.get(4)  // val word2: Option[String] = None

//  -----------------------------------------------------------------------------------------------------     

//  Puedes hacer 'Pattern matching'

    word1 match {
        case Some(one) => "Hola Mundo"    //  val res4: String = Hola Mundo
        case None => "unknown"
    }

//  -----------------------------------------------------------------------------------------------------     

//  Usa 'getOrElse'

    word2.getOrElse("Hola Mundo")  // val res5: String = Hola Mundo
    word2.getOrElse("unknown")     // val res5: String = unknown
    word2.getOrElse(2.0)           // val res5: Any = 2.0
    word2.getOrElse(10)            // val res5: Any = 10

//  ----------------------------------------------------------------------------------------------------- 

//  Usando isEmpty() para comprobar si tiene Some(devuelve False) o None(devuelve True)

    val numWords = Map(1 -> "one", 2 -> "two", 3 -> "three")

    val word1 = numWords.get(1)  // val word1: Option[String] = Some(one)
    val word2 = numWords.get(4)  // val word2: Option[String] = None

    word1.isEmpty   // val res0: Boolean = false
    word2.isEmpty   // val res1: Boolean = true

//  ----------------------------------------------------------------------------------------------------- 

//  Remover SOME y NONE

    val numWords = Map(1 -> "one", 2 -> "two", 3 -> "three")

    val word1 = numWords.get(1)  // val word1: Option[String] = Some(one)
    val word2 = numWords.get(4)  // val word2: Option[String] = None

    // Definir un metodo para remover 'Some' y 'None'
    def removeSome(x: Option[String]) =
    x match {
        case Some(value) => value
        case None => "Not found"
    }

    var noSome = removeSome(numWords.get(1))  // var noSome: String = one
    var noNone = removeSome(numWords.get(4))  // var noNone: String = Not found

//  ----------------------------------------------------------------------------------------------------- 

//  'get' dará error si 'Option' tiene un valor 'None'

    val option1:Option[Int] = None

    // option1.get
    // java.util.NoSuchElementException: None.get

    val option1:Option[Int] = Some(200)

    option1.get
    // val res2: Int = 200

//  En su lugar puedes utilizar 'getOrElse()'

    option1.getOrElse(0)
    // val res1: Int = 0

    option1.getOrElse(0)
    // val res3: Int = 200

//  ----------------------------------------------------------------------------------------------------- 

//  O componer opciones con expresiones 'for'. Este bucle 'for' devolverá la cuarta letra de alguna palabra 
//  que se encuentre en el 'Map' de la variable 'numWords'. Al metodo le entregamos un numero que corresponde
//  al indice del 'Map'.

    def cuartaLetra(i: Int): Option[Char] =
    for {
        word <- numWords.get(i)
        char <- word.drop(4).headOption
    } yield char

    cuartaLetra(1)  // val res6: Option[Char] = None
/*
    for {
        word <- numWords.get(1)             // numWords.get(1) = one   <----- No tiene 4 letra
        char <- word.drop(4).headOption     // word.drop(4) ----> Ejemplo 
                                               val palabra: String = "Hola"
                                               palabra.drop(1) = "ola"  ----> Elimina caracteres de izq. a der.
                                            // Y como 'one' tiene 3 letras, no se puede
                                            // 'headOption' devuelve el primer caracter. En este caso, devuelve 
                                            // el primero despues de haber eliminado los 4 primeros.
    } yield char
*/

    cuartaLetra(3)  // val res7: Option[Char] = Some(e)
/*
    for {
        word <- numWords.get(3)             // numWords.get(1) = three   <----- No tiene 5 letra
        char <- word.drop(4).headOption     // word.drop(4) ----> "e"
                                            // word.drop(4).headOption ----> "e"
    } yield char                                                                                                */

//  -----------------------------------------------------------------------------------------------------     
//  Incorporando Options y Collections

//  En este caso toSeq en las opciones no es necesario, pero se recomienda

//  La colección que sigue a una opción en una expresión for necesita toSeq

    def fourthLetters(nums: Seq[Int]): Seq[Char] =
        for {
            i <- nums
            word <- numWords.get(i).toSeq
            char <- word.drop(4).headOption.toSeq
    } yield char

    fourthLetters(List(1, 2, 3))    // val res8: Seq[Char] = List(e)