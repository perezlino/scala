/*  ======================================================
    ======== CREACION DE SET INMUTABLE Y MUTABLE =========
    ======================================================
*/

//  Los 'set' por defecto son 'inmmutable'. Para trabajar con la 'mutabilidad' debemos importar
//  'scala.collection.mutable.set'. Un 'set' puede tener valores duplicados. No son ordenados.


//  Crear un set inmutable
//  ----------------------

    // Crear un Set["String"] inmutable
    val s = Set("India", "Singapore", "US")
    // var s: scala.collection.immutable.Set[String] = Set(India, Singapore, US)

    // Ver el contenido del Set 's' creado en el paso anterior
    s
    // val res0: scala.collection.immutable.Set[String] = Set(India, Singapore, US)

    // Aqui no estamos llamando a la posición, sino, al elemento, se verifica si existe en el conjunto
    s("India")
    // val res1: Boolean = true

    // Ver la Clase para la que se creó el Objeto al crear el Set. Por defecto debe ser inmutable
    s.getClass
    // val res2: Class[_ <: scala.collection.immutable.Set[String]] = class scala.collection.immutable.Set$Set3

    // Crear un Set["String"] vacío e inmutable
    val s:Set[String] = Set()
    // var s: Set[String] = Set()

    s.getClass
    // val res3: Class[_ <: Set[String]] = class scala.collection.immutable.Set$EmptySet$

    val s:Set[String] = Set("Antofagasta")
    // val s: Set[String] = Set(Antofagasta)

    s.getClass
    // val res4: Class[_ <: Set[String]] = class scala.collection.immutable.Set$Set1


//  Crear un set mutable
//  ----------------------

    import  scala.collection.mutable.Set

    // Crear un Set mutable
    var mutableSet = Set("Chile","Argentina")
    // var mutableSet: scala.collection.mutable.Set[String] = HashSet(Argentina, Chile)

    // Añadir un elemento al set mutable
    mutableSet += "Peru"
    // val res0: scala.collection.mutable.Set[String] = HashSet(Argentina, Chile, Peru)

    // Ver la Clase para la que se crea el Objeto mientras se crea el Set
    mutableSet.getClass
    // val res1: Class[_ <: scala.collection.mutable.Set[String]] = class scala.collection.mutable.HashSet