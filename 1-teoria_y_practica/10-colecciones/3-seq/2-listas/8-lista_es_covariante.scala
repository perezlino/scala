/*  ======================================================
    ================ LISTA ES COVARIANTE =================
    ======================================================
*/

//  Si A es una extensión de B, List[A] es un subtipo de List[B].

//  La lista también se amplía según sea necesario en la cons y la concatenación

//  Recordar que el orden de jerarquia coloca primero a 'Any' -> 'AnyVal' -> 'List'

    val xs1 = 1 :: Nil    // List[Int] = List(1)
    val xs2 = true :: xs1 // List[AnyVal] = List(true, 1)
    val xs3 = "hi" :: xs2 // List[Any] = List(hi, true, 1)
    
    def sizeOfList(xs: List[Any]): Int = xs.size

    sizeOfList(xs1) // 1
    sizeOfList(xs2) // 2
    sizeOfList(xs3) // 3