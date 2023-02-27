/*  ======================================================
    ============ AÑADIR ELEMENTOS A UNA LISTA ============
    ======================================================
*/

    var colores = List("Rojo","Azul","Verde")

    // Reasignando --> Siempre utilizar 'var'
    colores = colores :+ "Amarillo"  // mutated colores

    colores
    // val res0: List[String] = List(Rojo, Azul, Verde, Amarillo)

    // Añadir elementos al principio de la lista
    colores = "Naranjo" +: colores  // mutated colores

    colores
    // val res1: List[String] = List(Naranjo, Rojo, Azul, Verde, Amarillo)

    // Añadir elementos al principio de la lista
    colores = "Morado" :: colores  // mutated colores

    colores
    // val res2: List[String] = List(Morado, Naranjo, Rojo, Azul, Verde, Amarillo)

    colores = colores :+ "Morado"  // mutated colores

    colores
    // val res3: List[String] = List(Morado, Naranjo, Rojo, Azul, Verde, Amarillo, Morado)