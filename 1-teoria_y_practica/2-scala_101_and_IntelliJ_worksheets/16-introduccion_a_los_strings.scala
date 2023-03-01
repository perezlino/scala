/*  ======================================================
    ============= INTRODUCCION A LOS STRINGS =============
    ======================================================
*/

//  "cadena" es una instancia de un Objeto de tipo 'String', es decir, es un Objeto de tipo 'String'. 
//  Por lo tanto, tiene sus propios métodos/propiedades.

    var cadena = "cadena"   
    // var cadena: String = cadena     

    scala> cadena.

    *                 collectFirst          filterNot         init                  mkString              reverse           stripMargin     toLowerCase        
    +                 combinations          find              inits                 nonEmpty              reverseIterator   stripPrefix     toMap
    ++                companion             flatMap           intern                offsetByCodePoints    reverseMap        stripSuffix     toSeq
    ++:               compare               flatten           intersect             orElse                runWith           stripTrailing   toSet
    +:                compareTo             fold              isBlank               padTo                 sameElements      subSequence     toShort
    /:                compareToIgnoreCase   foldLeft          isDefinedAt           par                   scan              substring       toStream
    :+                compose               foldRight         isEmpty               partition             scanLeft          sum             toString
    :\                concat                forall            isTraversableAgain    patch                 scanRight         tail            toTraversable      
    <                 contains              foreach           iterator              permutations          segmentLength     tails           toUpperCase        
    <=                containsSlice         format            last                  prefixLength          self              take            toVector
    >                 contentEquals         formatLocal       lastIndexOf           product               seq               takeRight       transform
    >=                copyToArray           formatted         lastIndexOfSlice      r                     size              takeWhile       translateEscapes   
    addString         copyToBuffer          genericBuilder    lastIndexWhere        reduce                slice             to              transpose
    aggregate         corresponds           getBytes          lastOption            reduceLeft            sliding           toArray         trim
    andThen           count                 getChars          length                reduceLeftOption      sortBy            toBoolean       union
    apply             describeConstable     groupBy           lengthCompare         reduceOption          sortWith          toBuffer        unzip
    applyOrElse       diff                  grouped           lift                  reduceRight           sorted            toByte          unzip3
    canEqual          distinct              hasDefiniteSize   lines                 reduceRightOption     span              toCharArray     updated
    capitalize        drop                  hashCode          linesIterator         regionMatches         split             toDouble        view
    charAt            dropRight             head              linesWithSeparators   repeat                splitAt           toFloat         withFilter
    chars             dropWhile             headOption        map                   replace               startsWith        toIndexedSeq    zip
    codePointAt       endsWith              indent            matches               replaceAll            stringPrefix      toInt           zipAll
    codePointBefore   equals                indexOf           max                   replaceAllLiterally   strip             toIterable      zipWithIndex
    codePointCount    equalsIgnoreCase      indexOfSlice      maxBy                 replaceFirst          stripIndent       toIterator
    codePoints        exists                indexWhere        min                   repr                  stripLeading      toList
    collect           filter                indices           minBy                 resolveConstantDesc   stripLineEnd      toLong


    // cadena.length
    cadena.length()
    // val res0: Int = 6

    cadena.head
    // val res1: Char = c

    cadena.last
    // val res2: Char = a

    cadena.charAt(2)
    // val res3: Char = d

    cadena.toUpperCase
    // val res4: String = CADENA

    cadena.substring(0,2)
    // val res5: String = cad

    cadena.startsWith("C")  // val res6: Boolean = false
    cadena.startsWith("c")  // val res7: Boolean = true

    var cadena2 = "Hola Chile como estan"
    cadena2.split(" ")
    // val res8: Array[String] = Array(Hola, Chile, como, estan)

    cadena2.replace(" ","-")
    // val res9: String = Hola-Chile-como-estan

    cadena.foreach(println)
/*
    c
    a
    d
    e
    n
    a
*/
    cadena.toUpperCase.foreach(println)
/*
    C
    A
    D
    E
    N
    A
*/

    var str1 = "Hola"
    var str2 = "Mundo"

    str1.concat(str2).concat("!")
    // val res7: String = HolaMundo!

    var str3 = "Hola"
    var str4 = "Hola"

    str3 == str4
    // val res8: Boolean = true

    str3.equals(str4)
    // val res9: Boolean = true

//  ---------------------------------------------------------------------------------------------------------

//  String interpolation
//  --------------------

    var nombre = "Alfonso"
    var edad = 36

    println("Te llamas " + nombre + " y tienes " + edad + " años")
    // Te llamas Alfonso y tienes 36 años

    println(s"Te llamas $nombre y tienes $edad años")
    // Te llamas Alfonso y tienes 36 años

    println(s"Te llamas: $nombre y dentro de 2 años tendras ${edad+2} años")
    // Te llamas Alfonso y tienes 38 años

    val nombreEdad = s"Te llamas $nombre y tienes $edad años"
    // val nombreEdad: String = Te llamas Alfonso y tienes 36 años


//  f - interpolation
//  -----------------

    val velocidad = 1.2f
    //  val velocidad: Float = 1.2

    val mito = f"$nombre puede comer $velocidad%2.2f hamburguesas por minuto"
    // val mito: String = Alfonso puede comer 1,20 hamburguesas por minuto


//  raw - interpolation
//  -------------------

    val escape1 = "Esto es una \n nueva linea"
/*
    val escape1: String =
    Esto es una
    nueva linea
*/

    val escape2 = raw"Esto es una \n nueva linea"
/*
    val escape: String = Esto es una \n nueva linea
*/