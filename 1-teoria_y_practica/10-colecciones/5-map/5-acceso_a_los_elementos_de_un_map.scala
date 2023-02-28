/*  ======================================================
    ========== ACCESO A LOS ELEMENTOS DE UN MAP ==========
    ======================================================
*/

//  Utilizando la funcion 'get'
//  --------------------------

//  Se pasa como argumento una 'clave' y accedemos al valor.

    val cars = Map("Mercedes"->"High Range",
    "BMW"->"High Range",
    "Toyota"->"Mid Range",
    "Jaguar"->"High Range",
    "Nano"->"Low Range",
    "Toyota"->"Low Range")

    cars.get("Toyota")
    // val res0: Option[String] = Some(Low Range)

    cars.get("Jaguar")
    // val res1: Option[String] = Some(High Range)

    cars.get("Mazda")
    // val res2: Option[String] = None

    // Remover el 'Some' y el 'None'
    def removeSome(x: Option[String]) =
        x match {
            case Some(value) => value
            case None => "No encontrado"
    }

    var noSome = removeSome(cars.get("Toyota"))
    // var noSome: String = Low Range

    var noSome2 = removeSome(cars.get("Jaguar"))
    // var noSome2: String = High Range

    var noNone = removeSome(cars.get("Mazda"))
    // var noNone: String = No encontrado


//  Accediendo al valor
//  -------------------

    cars("Toyota")
    // val res0: String = Low Range

    cars("Jaguar")
    // val res1: String = High Range

    cars("Mazda")
    // Error!    


//  Utilizando 'foreach'
//  --------------------

    val cars = Map("Mercedes"->"High Range",
    "BMW"->"High Range",
    "Toyota"->"Mid Range",
    "Jaguar"->"High Range",
    "Nano"->"Low Range",
    "Toyota"->"Low Range")

    cars.keys.foreach{key => println("La 'clave' es: " + key + " y el 'valor' es: " + cars(key))}
/*
    La 'clave' es: Toyota y el 'valor' es: Low Range
    La 'clave' es: Mercedes y el 'valor' es: High Range
    La 'clave' es: BMW y el 'valor' es: High Range
    La 'clave' es: Jaguar y el 'valor' es: High Range
    La 'clave' es: Nano y el 'valor' es: Low Range
*/

    // El 1 corresponde al primer valor, es decir, a la clave. Y el 2 corresponde al segundo valor, es decir al valor.
    cars.foreach{car => println("La 'clave' es: " + car._1 + " y el 'valor' es: " + car._2)}
/*
    La 'clave' es: Toyota y el 'valor' es: Low Range
    La 'clave' es: Mercedes y el 'valor' es: High Range
    La 'clave' es: BMW y el 'valor' es: High Range
    La 'clave' es: Jaguar y el 'valor' es: High Range
    La 'clave' es: Nano y el 'valor' es: Low Range
*/

    cars.foreach{case(carName,carRange) => println("La 'clave' es: " + carName + " y el 'valor' es: " + carRange)}
/*
    La 'clave' es: Toyota y el 'valor' es: Low Range
    La 'clave' es: Mercedes y el 'valor' es: High Range
    La 'clave' es: BMW y el 'valor' es: High Range
    La 'clave' es: Jaguar y el 'valor' es: High Range
    La 'clave' es: Nano y el 'valor' es: Low Range
*/