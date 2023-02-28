/*  ======================================================
    ============= FUNCIONES SIMPLES EN UN SET ============
    ======================================================
*/

    var numeros = Set(1,2,3,4,5,6)

    scala> numeros.

    &            apply          dropWhile   foreach              iterator     reduce              slice          to              toVector       
    &~           canEqual       empty       genericBuilder       last         reduceLeft          sliding        toArray         transpose      
    +            collect        equals      groupBy              lastOption   reduceLeftOption    span           toBuffer        union
    ++           collectFirst   exists      grouped              map          reduceOption        splitAt        toIndexedSeq    unzip
    ++:          companion      filter      hasDefiniteSize      max          reduceRight         stringPrefix   toIterable      unzip3
    -            compose        filterNot   hashCode             maxBy        reduceRightOption   subsetOf       toIterator      view
    --           contains       find        head                 min          repr                subsets        toList          withFilter     
    /:           copyToArray    flatMap     headOption           minBy        sameElements        sum            toMap           zip
    :\           copyToBuffer   flatten     init                 mkString     scan                tail           toSeq           zipAll
    WithFilter   count          fold        inits                nonEmpty     scanLeft            tails          toSet           zipWithIndex   
    addString    diff           foldLeft    intersect            par          scanRight           take           toStream        |
    aggregate    drop           foldRight   isEmpty              partition    seq                 takeRight      toString
    andThen      dropRight      forall      isTraversableAgain   product      size                takeWhile      toTraversable


//  El Set de enteros no se devuelve de manera ordenada

    var numeros = Set(1,2,3,4,5,6)
    // var numeros: scala.collection.immutable.Set[Int] = HashSet(5, 1, 6, 2, 3, 4)

    numeros.head
    // val res0: Int = 5

    numeros.tail
    // val res1: scala.collection.immutable.Set[Int] = HashSet(1, 6, 2, 3, 4)

    numeros.isEmpty
    // val res2: Boolean = false

    numeros.min
    // val res3: Int = 1

    numeros.max
    // val res4: Int = 6

    numeros.contains(2)
    // val res5: Boolean = true
