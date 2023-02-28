/*  ======================================================
    ================= VAL Y VAR EN UN MAP ================
    ======================================================
*/

//  1.	El operador += y -= (método) se comporta de forma diferente en scala.collection.immutable.Map y 
//      scala.collection.mutable.Map 

//  2.	En Map inmutable, el operador += y -= (método) devolverá un nuevo objeto Map. Y el nuevo objeto 
//      sólo se puede guardar si el objeto es de tipo var 

//  3.	En Map mutable, el operador += y -= (método) modificará el objeto Map existente. Por lo tanto, 
//      funcionará tanto en var y val 


//  Utilizando 'val' en un 'map' inmutable
//  --------------------------------------

    val cars = Map("Mercedes"->"High Range",
                   "BMW"->"High Range",
                   "Toyota"->"Mid Range",
                   "Jaguar"->"High Range",
                   "Nano"->"Low Range")

    cars += ("Suzuki" -> "Mid Range")
    // Error!

    // Se eliminan todas los pares clave/valor que tengan la clave 'Toyota'
    cars -= "Toyota"
    // Error!    


//  Utilizando 'var' en un 'map' inmutable
//  --------------------------------------

    var cars = Map("Mercedes"->"High Range",
    "BMW"->"High Range",
    "Toyota"->"Mid Range",
    "Jaguar"->"High Range",
    "Nano"->"Low Range")

    // cars.put("Suzuki", "Mid Range") <--- Lo mismo
    cars += ("Suzuki" -> "Mid Range")

    cars
    // val res1: scala.collection.immutable.Map[String,String] = HashMap(Toyota -> Mid Range, 
    //                                                                   Mercedes -> High Range, 
    //                                                                   Suzuki -> Mid Range,  <--------------
    //                                                                   BMW -> High Range, 
    //                                                                   Jaguar -> High Range, 
    //                                                                   Nano -> Low Range)


    // Se eliminan todas los pares clave/valor que tengan la clave 'Toyota'
    // cars.remove("Toyota") <--- Lo mismo
    cars -= "Toyota"  

    cars
    // val res1: scala.collection.immutable.Map[String,String] = HashMap(Mercedes -> High Range, 
    //                                                                   Suzuki -> Mid Range, 
    //                                                                   BMW -> High Range, 
    //                                                                   Jaguar -> High Range, 
    //                                                                   Nano -> Low Range)  

    // Eliminar un par clave/valor especifico
    cars -= ("Toyota","Mid Range")

    // Eliminar todos los pares clave/valor que tengan estas claves
    cars --= List("Jaguar","Nano")


//  Utilizando 'val' en un 'map' mutable
//  ------------------------------------

    import scala.collection.mutable.Map

    val cars = Map("Mercedes"->"High Range",
    "BMW"->"High Range",
    "Toyota"->"Mid Range",
    "Jaguar"->"High Range",
    "Nano"->"Low Range")

    cars += ("Suzuki" -> "Mid Range")
    // val res0: cars.type = HashMap(Nano -> Low Range, 
    //                               Toyota -> Mid Range, 
    //                               Suzuki -> Mid Range, <-----------
    //                               Jaguar -> High Range, 
    //                               Mercedes -> High Range, 
    //                               BMW -> High Range)

    cars
    // val res1: scala.collection.mutable.Map[String,String] = HashMap(Nano -> Low Range, 
    //                                                                 Toyota -> Mid Range, 
    //                                                                 Suzuki -> Mid Range, 
    //                                                                 Jaguar -> High Range, 
    //                                                                 Mercedes -> High Range, 
    //                                                                 BMW -> High Range)

    // Se eliminan todas los pares clave/valor que tengan la clave 'Toyota'
    cars -= "Toyota"
    // val res1: scala.collection.mutable.Map[String,String] = HashMap(Nano -> Low Range, 
    //                                                                 Suzuki -> Mid Range, 
    //                                                                 Jaguar -> High Range, 
    //                                                                 Mercedes -> High Range, 
    //                                                                 BMW -> High Range)


//  Utilizando 'var' en un 'map' mutable
//  ------------------------------------

    import scala.collection.mutable.Map

    var cars = Map("Mercedes"->"High Range",
    "BMW"->"High Range",
    "Toyota"->"Mid Range",
    "Jaguar"->"High Range",
    "Nano"->"Low Range")

    cars += ("Suzuki" -> "Mid Range")
    // val res0: cars.type = HashMap(Nano -> Low Range, 
    //                               Toyota -> Mid Range, 
    //                               Suzuki -> Mid Range, <-----------
    //                               Jaguar -> High Range, 
    //                               Mercedes -> High Range, 
    //                               BMW -> High Range)

    cars
    // val res1: scala.collection.mutable.Map[String,String] = HashMap(Nano -> Low Range, 
    //                                                                 Toyota -> Mid Range, 
    //                                                                 Suzuki -> Mid Range, 
    //                                                                 Jaguar -> High Range, 
    //                                                                 Mercedes -> High Range, 
    //                                                                 BMW -> High Range)


    // Se eliminan todas los pares clave/valor que tengan la clave 'Toyota'
    cars -= "Toyota"
    // val res1: scala.collection.mutable.Map[String,String] = HashMap(Nano -> Low Range, 
    //                                                                 Suzuki -> Mid Range, 
    //                                                                 Jaguar -> High Range, 
    //                                                                 Mercedes -> High Range, 
    //                                                                 BMW -> High Range)    