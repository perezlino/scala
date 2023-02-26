/*  ======================================================
    ================== MATCHING OPTIONS ==================
    ======================================================
*/

//  Sólo hay dos estados para "Option2, 'Some(x)' y 'None'

//  Puedes descomprimir variables (unpack variables) desde dentro de la opción (y utilizarlas)

//  Este es el uso común, pero a menudo hay formas más idiomáticas de tratar con Option 
//  (por ejemplo, map, getOrElse)

    def matchOption(o: Option[Int]) =  o match {
        case Some(n) if n > 10 => "It's a number above 10"
        case Some(_)           => "It's a number 10 or less"
        case None              => "No number given"
    }

    matchOption(Some(50)) // val res0: String = It's a number above 10
    matchOption(Some(5))  // val res1: String = It's a number 10 or less
    matchOption(None)     // val res2: String = No number given