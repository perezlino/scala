/*  ======================================================
    ==================== TOP CLASSES =====================
    ======================================================

    - Los lenguajes orientados a objetos suelen tener un objeto en la parte superior de la jerarquía de tipos
      por ejemplo, Object en Java

    Scala tiene 3 de estas clases superiores:

    - 'Any' es la cima absoluta de la jerarquía, todo en Scala es un Any (incluyendo instancias)
    - 'AnyVal' está por debajo de Any, pero por encima de todos los tipos "primitivos" (+ Unit)
    - 'AnyRef' es equivalente al Object de Java, está por encima de todos los tipos de Clase definidos por el usuario.

    - Los 'AnyRefs' se pueden crear para crear instancias

    - Los 'Objetos' también son 'AnyRefs'

    - 'Any' tiene métodos: toString, equals, hashCode, ==, ##, !=

    - 'AnyRef' tiene métodos: isInstanceOf[T], asInstanceOf[T], eq, ne, synchronized, wait, notify, notifyAll
*/

//  EJEMPLO TOP CLASSES
//  ===================

//  Any, AnyRef y String
//  --------------------

    val s: String = "hello"
    // val s: String = hello

    // Esto es valido porque 'String' es un subtipo de 'Any'
    // Por tanto, 's' es un subtipo de 'Any'
    val sa: Any = s
    // val sa: Any = hello

    // Esto es valido porque 'String' extiende de 'AnyRef'
    // y 'AnyRef' extiende de 'Any'
    val sar: AnyRef = s
    // val sar: AnyRef = hello

    // 'String' no extiende de 'AnyVal'
    // No compila
    // val sav: AnyVal = s


//  Any, AnyVal y Int
//  --------------------

    val i: Int = 10
    // val i: Int = 10

    // Esto es valido porque 'Int' es un subtipo de 'Any'
    // Es decir, extiende de 'Any', por tanto, 'i' es un 
    // subtipo de 'Any'
    val ia: Any = i
    // val ia: Any = 10

    // Esto es valido porque 'Int' extiende de 'AnyVal'
    // y 'AnyVal' extiende de 'Any'
    val iav: AnyVal = i

    // No compila
    // val iar: AnyRef = i    


//  isInstanceOf y asInstanceOf
//  ---------------------------

    ia.isInstanceOf[Int]  // val res0: Boolean = true
    ia.asInstanceOf[Int]  // val res1: Int = 10
    // ia.asInstanceOf[String]  // Error 

    sa.isInstanceOf[String]  // val res2: Boolean = true
    sa.asInstanceOf[String]  // val res3: String = hello
    // sa.asInstanceOf[Int]  // Error