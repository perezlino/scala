/*  ======================================================
    ============= TUPLA DENTRO DE UNA LISTA ==============
    ======================================================
*/

    val carList = List(("Mercedes","High Range"),("Suzuki","Mid Range"),("Jaguar","High Range"),("BMW","High Range"))

    carList.foreach{
        case ("Jaguar",range) => println("Car is Jaguar and the range is " + range)
        case _ => println("Elige otro vehiculo")
    }
/*
    Elige otro vehiculo
    Elige otro vehiculo
    Car is Jaguar and the range is High Range
    Elige otro vehiculo
*/