/*  ======================================================
    ============= INICIALIZACION DE LISTAS ===============
    ======================================================
*/

//  - Como se ha visto se puede inicializar una lista utilizando el método List.apply (o List(contenidos...) 
//    usando reescritura (rewriting))

    val lista = List.apply(1,2,3)   // val lista: List[Int] = List(1, 2, 3)

    val listab = List(1,2,3) // val listab: List[Int] = List(1, 2, 3)

//  - Para listas solamente, también puedes usar la forma cons de inicialización, usando ::

    val listac = 4 :: 5 :: 6 :: Nil // val listc: List[Int] = List(4, 5, 6)

//  :: es asociativo a la derecha, es decir, aplica el parámetro de la izquierda al elemento de la derecha, p.e.

    val listd = ((Nil.::(6)).::(5)).::(4)   // val listd: List[Int] = List(4, 5, 6)

//  - Cualquier operador que termine en : es asociativo a la derecha en Scala

//  - Otro operador exclusivo de listas es concatenar, ::: que une dos listas (de nuevo asociativo a la derecha):

    val liste = lista ::: listb  // val liste: List[Int] = List(1, 2, 3, 4, 5, 6)