/*  ======================================================
    ======================= TUPLAS =======================
    ======================================================
*/

//  - Hasta ahora hemos visto tipos simples como Int, String y Unit, también nuestros métodos han devuelto 
//    sólo uno de ellos

//  - ¿Qué pasa si queremos devolver más de una cosa de un método? Introduce tuplas

    def sumAndDifference(a: Int, b: Int): (Int, Int) = {
    val sum = a + b
    val difference = a - b
    (sum, difference)
    }

//  - Obteniendo las partes del resultado:

    val results = sumAndDifference(10, 5)  // val res: (Int, Int) = (15,5)
    results._1 // val res0: Int = 15
    results._2 // val res1: Int = 5

//  - Los tipos son llevados a través de, _1 y _2 puede ser pensado como elemento 1 y elemento 2

//  - Hay una forma mejor de conseguir las partes:

    val (sm, df) = sumAndDifference(10, 5)
/*  
    val sm: Int = 15 
    val df: Int = 5
*/

//  - Y la tupla puede tener más de 2 elementos, y tipos mixtos:

    val (a,b,c,d,e) = (0, 'u', 8, 1, "too")
/*
    val a: Int = 0 
    val b: Char = u 
    val c: Int = 8 
    val d: Int = 1 
    val e: String = too
*/
    a
    b
    c
    d
    e
/*
    val res2: Int = 0
    val res3: Char = u
    val res4: Int = 8
    val res5: Int = 1
    val res6: String = too
*/

    val tupla = (0, 'u', 8, 1, "too")
/*
    val tupla: (Int, Char, Int, Int, String) = (0,u,8,1,too)
*/
    tupla._1    // val res7: Int = 0
    tupla._2    // val res8: Char = u
    tupla._3    // val res9: Int = 8

    val (a,b,c,d,e) = tupla
/*
    val a: Int = 0
    val b: Char = u
    val c: Int = 8
    val d: Int = 1
    val e: String = too
*/

//  - Las tuplas pueden tener aridad hasta 22, porque tenía que parar en algún sitio.

//  - Futuras versiones de Scala pueden (probablemente lo harán) crear aridades de tupla sobre la marcha.