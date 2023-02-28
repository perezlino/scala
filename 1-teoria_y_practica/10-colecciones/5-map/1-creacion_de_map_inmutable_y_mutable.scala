/*  ======================================================
    ======== CREACION DE MAP INMUTABLE Y MUTABLE =========
    ======================================================
*/

//  - Los 'map' por defecto son 'inmmutable'. Para trabajar con la 'mutabilidad' debemos importar
//    'scala.collection.mutable.map'. 

//  - Un 'map' puede tener valores duplicados, pero no puede tener claves duplicadas. 

//  - La secuencia de inserción de datos no se conserva en el Map.


//  Crear un 'map' inmutable
//  ------------------------

//  El valor de "High Range" se repite a continuación.

    var cars = Map("Mercedes"->"High Range", 
                   "BMW"->"High Range", 
                   "Toyota"->"Mid Range", 
                   "Jaguar"->"High Range", 
                   "Nano"->"Low Range")
    // var cars: scala.collection.immutable.Map[String,String] = HashMap(Toyota -> Mid Range, 
    //                                                                   Mercedes -> High Range, <-------
    //                                                                   BMW -> High Range, 
    //                                                                   Jaguar -> High Range, <-------
    //                                                                   Nano -> Low Range)


//  Cuando se intente poner claves duplicadas, se tomará el valor de la última clave.

    var cars = Map("Mercedes"->"High Range", // <----
                   "BMW"->"High Range", 
                   "Toyota"->"Mid Range", 
                   "Jaguar"->"High Range", 
                   "Nano"->"Low Range",
                   "Mercedes"->"Low Range") // <----

    // var cars: scala.collection.immutable.Map[String,String] = HashMap(Toyota -> Mid Range, 
    //                                                                   Mercedes -> Low Range, <------ 
    //                                                                   BMW -> High Range, 
    //                                                                   Jaguar -> High Range, 
    //                                                                   Nano -> Low Range)