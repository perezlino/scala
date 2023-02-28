/*  ======================================================
    ====================== SORTING =======================
    ======================================================
*/

//  Utilizar 'sorted'
//  -----------------

    val numeros = List(10,4,6,7,1,2,8,3,9,5)

    // Ordenar en orden ascendente por defecto
    numeros.sorted
    // val res0: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // Ordenar en orden descendente usando reverse
    numeros.sorted(Ordering.Int.reverse)
    // val res1: List[Int] = List(10, 9, 8, 7, 6, 5, 4, 3, 2, 1)


//  Utilizar 'sortBy'
//  -----------------

    val numeros = List(10,4,6,7,1,2,8,3,9,5)

    // Ordenar en orden ascendente por defecto
    numeros.sortBy(x => x)
    // val res0: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // Ordenar en orden descendente usando reverse
    numeros.sortBy(x => x).reverse
    // val res1: List[Int] = List(10, 9, 8, 7, 6, 5, 4, 3, 2, 1)


    //  Ejemplo con 'case class'
    //  ------------------------

    case class Cars(nombre:String, costo:Int)

    // Creación de objetos para la case class
    val car1 = Cars("Mercedes",50000)

    val car2 = Cars("BMW",80000)

    val car3 = Cars("Toyota",90000)

    // Hacer la lista de todos los autos
    val listaCar = List(car1,car2,car3)
    // val listaCar: List[Cars] = List(Cars(Mercedes,50000), Cars(BMW,80000), Cars(Toyota,90000))

    // Ordenar por orden ascendente del costo
    // listaCar.sortBy(_.costo)
    listaCar.sortBy(c => c.costo)
    // val res0: List[Cars] = List(Cars(Mercedes,50000), Cars(BMW,80000), Cars(Toyota,90000))

    // Ordenar por orden descendente del costo
    listaCar.sortBy(c => c.costo).reverse
    // val res1: List[Cars] = List(Cars(Toyota,90000), Cars(BMW,80000), Cars(Mercedes,50000))

    // Ordenar por orden ascendente del nombre
    listaCar.sortBy(n => n.nombre)
    // val res2: List[Cars] = List(Cars(BMW,80000), Cars(Mercedes,50000), Cars(Toyota,90000))


//  Utilizar 'sortWith'
//  -------------------

    val numeros = List(10,4,6,7,1,2,8,3,9,5)

    // numeros.sortWith(_ < _)
    numeros.sortWith((x,y) => x < y)
    // val res0: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    numeros.sortWith((x,y) => x > y)
    // val res1: List[Int] = List(10, 9, 8, 7, 6, 5, 4, 3, 2, 1)


    //  Ejemplo con 'case class'
    //  ------------------------

    case class Cars(nombre:String, costo:Int)

    // Creación de objetos para la case class
    val car1 = Cars("Mercedes",50000)

    val car2 = Cars("BMW",80000)

    val car3 = Cars("Toyota",90000)

    // Hacer la lista de todos los autos
    val listaCar = List(car1,car2,car3)
    // val listaCar: List[Cars] = List(Cars(Mercedes,50000), Cars(BMW,80000), Cars(Toyota,90000))

    // Ordenar por orden ascendente del costo
    // listaCar.sortWith(_.costo < _.costo)
    listaCar.sortWith((c1,c2) => c1.costo < c2.costo)
    // val res0: List[Cars] = List(Cars(Mercedes,50000), Cars(BMW,80000), Cars(Toyota,90000))

    // Ordenar por orden descendente del costo
    listaCar.sortWith((c1,c2) => c1.costo > c2.costo)
    // val res1: List[Cars] = List(Cars(Toyota,90000), Cars(BMW,80000), Cars(Mercedes,50000))

    // Ordenar por orden descendente del nombre. Shorthand notation
    listaCar.sortWith(_.nombre > _.nombre)
    // val res2: List[Cars] = List(Cars(Toyota,90000), Cars(Mercedes,50000), Cars(BMW,80000))