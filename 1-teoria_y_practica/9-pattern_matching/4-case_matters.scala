/*  ======================================================
    ==================== CASE MATTERS! ===================
    ======================================================
*/

//  Los identificadores que empiezan por minúsculas se tratan como 'variables'

//  Los identificadores que empiezan por mayúsculas se tratan como 'constantes'

    val MaxLimit = 10  // Constantes comienzan con Mayuscula.
    val minLimit = 1

    def isALimit(x: Int) = x match {
        case MaxLimit => true           // <------  Las constantes podemos llamarlas de manera normal
        case `minLimit` => true         // <------  Las variables debemos ponerle comillas inclinadas.
                                        //          Si no lo hacemos, se devuelve resultados inesperados.
        case _ => false
    }

    isALimit(10)  // val res7: Boolean = true
    isALimit(1)   // val res8: Boolean = true
    isALimit(3)   // val res9: Boolean = false