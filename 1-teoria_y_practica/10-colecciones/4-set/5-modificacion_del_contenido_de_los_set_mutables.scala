/*  ======================================================
    === MODIFICACION DEL CONTENIDO DE LOS SET MUTABLES ===
    ======================================================
*/

    import  scala.collection.mutable.Set

    var numeros = Set(1,2)
    // var numeros: scala.collection.mutable.Set[Int] = HashSet(1, 2)

    // Añadir un nuevo elemento 3 al Set
    numeros += 3
    // val res0: scala.collection.mutable.Set[Int] = HashSet(1, 2, 3)

    // Añadir 2 nuevos elementos (4,5) al Set
    numeros += (4,5)
    // val res1: scala.collection.mutable.Set[Int] = HashSet(1, 2, 3, 4, 5)

    // Añadir un nuevo elemento 6 al Set
    // numeros add 6
    numeros.add(6)
    // val res2: Boolean = true

    numeros
    // val res3: scala.collection.mutable.Set[Int] = HashSet(1, 2, 3, 4, 5, 6)

    // Eliminar 2 elementos (1,3) del Set
    numeros -= (1,3)
    // val res4: scala.collection.mutable.Set[Int] = HashSet(2, 4, 5, 6)

    // Eliminar el elemento 4 del Set
    numeros -= 4
    // val res5: scala.collection.mutable.Set[Int] = HashSet(2, 5, 6)

    // Eliminar el elemento 2 al Set
    // numeros remove 2
    numeros.remove(2)
    // val res6: Boolean = true

    numeros
    // val res7: scala.collection.mutable.Set[Int] = HashSet(5, 6)