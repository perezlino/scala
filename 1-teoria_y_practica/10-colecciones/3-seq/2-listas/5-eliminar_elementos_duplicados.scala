/*  ======================================================
    =========== ELIMINAR ELEMENTOS DUPLICADOS ============
    ======================================================
*/

    var colores = List("Morado", "Naranjo", "Rojo", "Azul", "Verde", "Amarillo", "Morado")

    // Reasignando --> Debemos utilizar 'var'
    colores = colores.distinct  // mutated colores

    colores
    // val res0: List[String] = List(Morado, Naranjo, Rojo, Azul, Verde, Amarillo)