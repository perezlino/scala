/*  ======================================================
    == SORTEDMAP - ALMACENA LOS DATOS EN ORDEN ORDENADO ==
    ======================================================
*/

    var cars = scala.collection.SortedMap("Mercedes"->"HighRange", 
                                          "BMW"->"High Range", 
                                          "Toyota"->"Mid Range", 
                                          "Jaguar"->"High Range", 
                                          "Nano"->"Low Range", 
                                          "Mercedes"->"Low Range")
    // var cars: scala.collection.SortedMap[String,String] = TreeMap(BMW -> High Range, 
    //                                                               Jaguar -> High Range, 
    //                                                               Mercedes -> Low Range, 
    //                                                               Nano -> Low Range, 
    //                                                               Toyota -> Mid Range)

    cars
    // var res0: scala.collection.SortedMap[String,String] = TreeMap(BMW -> High Range, 
    //                                                               Jaguar -> High Range, 
    //                                                               Mercedes -> Low Range, 
    //                                                               Nano -> Low Range, 
    //                                                               Toyota -> Mid Range)