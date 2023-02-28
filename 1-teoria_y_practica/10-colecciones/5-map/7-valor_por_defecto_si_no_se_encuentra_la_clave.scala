/*  ======================================================
    === VALOR POR DEFECTO SI NO SE ENCUENTRA LA CLAVE ====
    ======================================================
*/

//  Utilizamos 'withDefaultValue()'
//  ------------------------------

    val cars = Map("Mercedes"->"High Range",
    "BMW"->"High Range",
    "Toyota"->"Mid Range",
    "Jaguar"->"High Range",
    "Nano"->"Low Range",
    "Toyota"->"Low Range").withDefaultValue("Null")

    cars("Mercedes")
    // val res0: String = High Range

    cars("Mazda")
    // val res1: String = Null

//  Utilizamos 'getOrElse()'
//  ------------------------

    cars.get("Mercedes")
    // val res2: Option[String] = Some(High Range)

    cars.getOrElse("Mazda","No encontrado")
    // val res2: String = No encontrado