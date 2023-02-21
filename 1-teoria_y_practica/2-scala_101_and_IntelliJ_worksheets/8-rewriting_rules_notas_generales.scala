/*  ======================================================
    ======== RE-WRITING RULES - NOTAS GENERALES ==========
    ======================================================
*/

// - Veremos otras reglas de reescritura de Scala a medida que avancemos en el material

// - La reescritura sólo se hace si el código no se verifica sin una reescritura.

// - Si un elemento no tiene un método apply o update, la reescritura se intentará pero no se compilará:

    val z = 10
    // z(2) // no compila --> "Error de compilación " La aplicación no acepta parámetros

    val xs = List(1,2,3)    // podría escribirse List.apply(1,2,3)
    xs(1)  // funciona
    // xs(1) = 10 // no compila --> error de compilación, ya que no hay método update en una lista inmutable