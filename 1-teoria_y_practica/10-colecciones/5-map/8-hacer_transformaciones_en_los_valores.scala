/*  ======================================================
    ======= HACER TRANSFORMACIONES EN LOS VALORES ========
    ======================================================
*/

    import scala.collection.mutable.Map

    val cars = Map("Mercedes"->"High Range",
                   "BMW"->"High Range",
                   "Toyota"->"Mid Range",
                   "Jaguar"->"High Range",
                   "Nano"->"Low Range",
                   "Toyota"->"Low Range")

    // 'mapValues' esta obsoleto (deprecated)
    // 'transform' esta obsoleto (deprecated)
    // cars.mapValues(value => value.toString.length)
    // cars.transform((carName, carRange) => carRange.toString.length.toString)

    // Si trato de asignarlo a 'var cars' devuelve Error!
    val autos = cars.mapValuesInPlace((carName, carRange) => carRange.length.toString)
    // val autos: cars.type = HashMap(Nano -> 9, Toyota -> 9, Jaguar -> 10, Mercedes -> 10, BMW -> 10)