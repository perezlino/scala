/*  ======================================================
     COMPROBAR SI UNA CLAVE O UN VALOR EXISTEN EN UN MAP 
    ======================================================
*/

    val cars = Map("Mercedes"->"High Range",
    "BMW"->"High Range",
    "Toyota"->"Mid Range",
    "Jaguar"->"High Range",
    "Nano"->"Low Range",
    "Toyota"->"Low Range")

    // Comprobar si existe la clave "Toyota"
    cars.contains("Toyota")
    // val res0: Boolean = true

    cars.contains("Mazda")
    // val res1: Boolean = false

    // Comprobar si existe el valor "Mid Range"
    cars.valuesIterator.exists(x => x.equals("Mid Range"))
    // val res2: Boolean = false

    // 'contains' es para comprobar que "h Ra" está presente en el value string
    cars.valuesIterator.exists(_.contains("h Ra"))
    // val res3: Boolean = true

    cars.valuesIterator.exists(_.contains("Mid Range"))
    // val res4: Boolean = false