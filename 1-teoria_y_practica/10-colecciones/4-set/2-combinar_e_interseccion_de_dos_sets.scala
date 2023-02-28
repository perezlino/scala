/*  ======================================================
    ========= COMBINAR E INTERSECCION DE DOS SETS ========
    ======================================================
*/

//  Combinar dos Set
//  ----------------

    var americaSur = Set("Chile","Argentina","Peru","Bolivia")
    // var americaSur: scala.collection.immutable.Set[String] = Set(Chile, Argentina, Peru, Bolivia)

    var americaNorte = Set("Mexico","USA","Canada")
    // var americaNorte: scala.collection.immutable.Set[String] = Set(Mexico, USA, Canada)

    var america = americaSur ++ americaNorte
    // var america: scala.collection.immutable.Set[String] = HashSet(USA, Peru, Canada, Bolivia, Chile, Argentina, Mexico)

    var america2 = americaSur.union(americaNorte)
    // var america2: scala.collection.immutable.Set[String] = HashSet(USA, Peru, Canada, Bolivia, Chile, Argentina, Mexico)


//  Interseccion de dos Set
//  -----------------------

    var americaSur = Set("Chile","Argentina","Peru","Bolivia")
    // var americaSur: scala.collection.immutable.Set[String] = Set(Chile, Argentina, Peru, Bolivia)

    var southAmerica = Set("Chile","Brasil","Peru","Uruguay")
    //var southAmerica: scala.collection.immutable.Set[String] = Set(Chile, Brasil, Peru, Uruguay)

    americaSur & southAmerica
    // val res0: scala.collection.immutable.Set[String] = Set(Chile, Peru)

    americaSur.intersect(southAmerica)
    // val res1: scala.collection.immutable.Set[String] = Set(Chile, Peru)