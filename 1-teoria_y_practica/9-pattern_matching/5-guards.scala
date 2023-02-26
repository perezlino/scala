/*  ======================================================
    ======================= GUARDS =======================
    ======================================================
*/

//  Cualquier cosa a la izquierda del => es parte del pattern match, cualquier cosa a la derecha es lo que 
//  hay que hacer

//  Las expresiones if pueden utilizarse a la izquierda de =>:

    def describeNumber(x: Int): String = x match {
        case 0 => "zero"
        case n if n > 0 && n < 100 => "smallish positive"
        case n if n > 0 => "large positive"
        case n if n < 0 && n > -100 => "smallish negative"
        case _ => "large negative"
    }
    describeNumber(-99) // smallish negative
    describeNumber(99) // smallish positive
    describeNumber(0) // zero
    describeNumber(101) // large positive
    describeNumber(-101) // large negative


//  Remember that the first full match stops the attempt going any further

