/*  ======================================================
    ================= OTRAS COLECCIONES ==================
    ======================================================
*/

//  Puede hacer coincidencias similares para otras colecciones (pero no con la notación cons):

    def matchSeq(xs: Vector[Int]): String = xs match {
        case 1 +: 2 +: rest => s"A 1, 2 vector followed by $rest"
        case Vector(a, b, rest @ _*) => s"A vector of at least 2 items, starting with $a, $b, rest is $rest"
        case Vector(a) => s"A single element vector of $a"
        case Vector() => "The empty vector"
    }

    matchSeq(Vector(1,2,3))   // val res15: String = A 1, 2 vector followed by Vector(3)
    matchSeq(Vector(1,2))     // val res16: String = A 1, 2 vector followed by Vector()
    matchSeq(Vector(1,3,4))   // val res17: String = A vector of at least 2 items, starting with 1, 3, rest is Vector(4)
    matchSeq(Vector(4))       // val res18: String = A single element vector of 4
    matchSeq(Vector.empty)    // val res19: String = The empty vector

//  +: sustituye a ::

//  También puede utilizar el operador de expansión _* para que coincida con resto en el estilo "constructor"

//  Y bindings, por lo que Vector(1, 2, rest @ _*) => es equivalente a 1 +: 2 +: rest =>

//  Esta sintaxis también funciona para las listas (pero con List sustituyendo a Vector, por supuesto)