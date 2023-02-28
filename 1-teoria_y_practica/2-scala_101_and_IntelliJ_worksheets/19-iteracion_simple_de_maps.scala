/*  ======================================================
    ============== ITERACION SIMPLE DE MAPS ==============
    ======================================================
*/

//  Todo ese esfuerzo para -> es hacer maps fácil y bonito de inicializar

    val mapToRiches = Map(
    1 -> "robar calzoncillos",
    2 -> "???",
    3 -> "profit"
    )
/*
val mapToRiches: scala.collection.immutable.Map[Int,String] = Map(1 -> steal underpants, 2 -> ???, 3 -> profit)
*/

//  También es fácil (y bonito) iterar sobre ellos con una expresión 'for'

    for ((paso, instruccion) <- mapToRiches) {
    println(s "Paso $paso - $instruccion")
    }
/*
    Paso 1 - steal underpants
    Paso 2 - ???
    Paso 3 - profit
*/

//  El (paso, instruccion) desempaqueta la tupla2 de la secuencia en el map

//  Sin embargo, recuerda que el orden puede variar en algunas implementaciones de map.