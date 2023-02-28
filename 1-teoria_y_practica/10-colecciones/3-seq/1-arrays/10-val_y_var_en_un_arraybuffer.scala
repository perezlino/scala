/*  ======================================================
    ============= VAL Y VAR EN UN ARRAYBUFFER ============
    ======================================================
*/

//  Utilizando 'val'
//  ----------------

    import scala.collection.mutable.ArrayBuffer

    val x = ArrayBuffer(1,2,3,4,5)
    // val x: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 4, 5)

    // Nota: hemos añadido el nuevo elemento '6', porque es mutable. Si hubiera sido inmutable, no se podría 
    // haber añadido.
    x += 6
    // val res0: x.type = ArrayBuffer(1, 2, 3, 4, 5, 6)

    x.map(i => i + 1)
    // val res1: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(2, 3, 4, 5, 6, 7)

    // Nota: no se puede reasignar a val un valor. Si hubiera sido un var, se puede reasignar
    x = x.map(i => i + 1)
    // Error!

    // Nota: si quieres seguir modificar los elementos de la lista, puedes hacer una nueva lista como abajo: 
    val y = x.map(i => i + 1)
    // val y: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(2, 3, 4, 5, 6, 7)


//  Utilizando 'var'
//  ----------------

    import scala.collection.mutable.ArrayBuffer

    var x = ArrayBuffer(1,2,3,4,5)
    // val x: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 4, 5)

    x += 6
    // val res0: x.type = ArrayBuffer(1, 2, 3, 4, 5, 6)

    x.map(i => i + 1)
    // val res1: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(2, 3, 4, 5, 6, 7)

    x = x.map(i => i + 1)
    // mutated x

    x
    // val res2: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(2, 3, 4, 5, 6, 7)