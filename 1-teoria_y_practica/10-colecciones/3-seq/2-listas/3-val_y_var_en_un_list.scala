/*  ======================================================
    ================ VAL Y VAR EN UN LIST ================
    ======================================================
*/

//  Utilizando 'val'
//  ----------------

//  Nota: como es inmutable, no podemos añadir un elemento más porque += que es un operador (detrás de las 
//        escenas es realmente un método) para añadir nuevos elementos no está disponible en 
//        'scala.collection.immutable' 
//        El operador (o método) += está definido sólo en 'scala.collection.mutable'

//  De manera implicita se importa 'scala.collection.immutable.List'

    val x = List(1,2,3,4,5)

    x += 6 // Error!

    // Al parecer si se pudo agregar un elemento???
    x :+ 6
    // val res0: List[Int] = List(1, 2, 3, 4, 5, 6)

    // Nooo! No se puede agregar elementos!!!
    x
    // val res1: List[Int] = List(1, 2, 3, 4, 5)

//  Nota: si quieres añadir un nuevo elemento a la lista, puedes hacer una nueva lista como abajo: 

    val y = x += 6 // Error!

    val y = x:+ 6
    // val y: List[Int] = List(1, 2, 3, 4, 5, 6)

//  No se puede reasignar a val un valor. Si hubiera sido un var, se puede reasignar:

    val x = List(1,2,3,4,5)

    x.map(i => i + 1)
    // val res1: List[Int] = List(2, 3, 4, 5, 6) 

    x = x.map(i => i + 1) // Error!

    x :+ 6

    x = x :+ 6  // Error!



//  Utilizando 'var'
//  ----------------

//  Al igual que utilizando 'val' no podemos añadir nuevos elementos. Para eso debemos crear una nueva variable
//  y crear ahi la lista.

//  Sin embargo, si nos permite reasignar un valor:

    var x = List(1,2,3,4,5)

    x.map(i => i + 1)
    // val res0: List[Int] = List(2, 3, 4, 5, 6)

    x = x.map(i => i + 1)
    // mutated x

    x
    // val res1: List[Int] = List(2, 3, 4, 5, 6)




