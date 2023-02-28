/*  ======================================================
    ================== COMBINAR DOS MAP ==================
    ======================================================
*/

    var highandMidCar = Map("Mercedes"->"High Range",
                            "BMW"->"High Range",
                            "Toyota"->"Mid Range")

    var lowCar = Map("Nano"->"Low End",
                    "M800"->"Low End")

    // val cars = highandMidCar.++(lowCar)
    val cars = highandMidCar ++ lowCar
    // val cars: scala.collection.immutable.Map[String,String] = HashMap(Toyota -> Mid Range, 
    //                                                                   Mercedes -> High Range, 
    //                                                                   M800 -> Low End, 
    //                                                                   Nano -> Low End, 
    //                                                                   BMW -> High Range)