/*  ======================================================
    ============== FUNCIONES BASICAS CON MAP =============
    ======================================================
*/

    scala> cars.

    +             collect        exists           getOrElse            keys           par                 scanRight      to              transform
    ++            collectFirst   filter           groupBy              keysIterator   partition           seq            toArray         transpose
    ++:           companion      filterKeys       grouped              last           product             size           toBuffer        unzip
    -             compose        filterNot        hasDefiniteSize      lastOption     reduce              slice          toIndexedSeq    unzip3
    --            contains       find             hashCode             lift           reduceLeft          sliding        toIterable      updated
    /:            copyToArray    flatMap          head                 map            reduceLeftOption    span           toIterator      values
    :\            copyToBuffer   flatten          headOption           mapValues      reduceOption        splitAt        toList          valuesIterator
    WithFilter    count          fold             init                 max            reduceRight         stringPrefix   toMap           view
    addString     default        foldLeft         inits                maxBy          reduceRightOption   sum            toSeq           withDefault        
    aggregate     drop           foldRight        isDefinedAt          min            repr                tail           toSet           withDefaultValue
    andThen       dropRight      forall           isEmpty              minBy          runWith             tails          toStream        withFilter
    apply         dropWhile      foreach          isTraversableAgain   mkString       sameElements        take           toString        zip
    applyOrElse   empty          genericBuilder   iterator             nonEmpty       scan                takeRight      toTraversable   zipAll
    canEqual      equals         get              keySet               orElse         scanLeft            takeWhile      toVector        zipWithIndex


    import scala.collection.mutable.Map

    // Crear un Map
    var cars = Map("Mercedes"->"High Range",
    "BMW"->"High Range",
    "Toyota"->"Mid Range",
    "Jaguar"->"High Range",
    "Nano"->"Low Range")
    // var cars: scala.collection.mutable.Map[String,String] = HashMap(Jaguar -> High Range, 
    //                                                                 Nano -> Low Range, 
    //                                                                 Mercedes -> High Range, 
    //                                                                 Toyota -> Mid Range, 
    //                                                                 BMW -> High Range)

    // Devuelve todas las claves del Map
    cars.keys
    // val res0: Iterable[String] = Set(Jaguar, Nano, Mercedes, Toyota, BMW)

    // Devuelve todos los valores de Map
    cars.values
    // val res1: Iterable[String] = Iterable(High Range, Low Range, High Range, Mid Range, High Range)

    // Comprueba si el Map está vacío o no (Empty -> True, else False)
    cars.isEmpty
    // val res2: Boolean = false

    // Devuelve la clave mayor
    cars.max
    // val res3: (String, String) = (Toyota,Mid Range)

    // Devuelve la clave menor
    cars.min
    // val res4: (String, String) = (BMW,High Range)

    // Creación de un Map vacío
    var mapVacio = Map()
    // var mapVacio: scala.collection.mutable.Map[Nothing,Nothing] = HashMap()

    mapVacio.isEmpty
    // val res5: Boolean = true

    var mapVacio:Map[String,String] = Map()
    // var mapVacio: scala.collection.mutable.Map[String,String] = HashMap()

    mapVacio += ("a" -> "Alfonso", "b" -> "Javiera")
    // val res6: scala.collection.mutable.Map[String,String] = HashMap(a -> Alfonso, b -> Javiera)

    // Devuelve el primer elemento de Map
    cars.head
    // val res7: (String, String) = (Jaguar,High Range)

    // Devuelve todos los elementos excepto el primer elemento del Map
    cars.tail
    // var res8: scala.collection.mutable.Map[String,String] = HashMap(Nano -> Low Range, 
    //                                                                 Mercedes -> High Range, 
    //                                                                 Toyota -> Mid Range,  
    //                                                                 BMW -> High Range)