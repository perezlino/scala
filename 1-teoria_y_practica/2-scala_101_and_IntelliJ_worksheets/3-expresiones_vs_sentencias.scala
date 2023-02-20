/*  ======================================================
    ============= EXPRESIONES VS SENTENCIAS ==============
    ======================================================
*/

//  - Una expresión devuelve su carga útil como argumento de retorno con un tipo, por ejemplo:

    val a = 10
    val b = 20

    val max = if (a > b) a else b
/*
    val a: Int = 10
    val b: Int = 20

    val max: Int = 20
*/

//  - Una sentencia devuelve Unit y tiene que tener algún side effect para ser útil:

    if (a > b) println(s"max is $a") else println(s"max is $b")
/*
    max is 20
    res0: Unit = ()
*/

//  - El estilo de programación funcional prefiere las expresiones a las sentencias

//  - Recuerda que if, try...catch, for, y otros constructores comunes en Scala son expresiones

//  - while y do...while son los únicos constructores de flujo de control que sólo devuelven Unit: 

    var doIt: Boolean = true
    val result = while (doIt) {
    println("Hello")
    doIt = false
    }
/*
    var doIt: Boolean = true
    Hello
    val result: Unit = ()
*/

//  - val y var también producen tipos de retorno Unit, esto es sorprendente al principio:

    var x = 5
    val y = x = 10
    println(x)      // 10
    println(y)      // ()

//  - Un error común cuando se aprende Scala por primera vez es terminar un bloque de código con una sentencia val:

    def suma(a: Int, b: Int) = {
    val result = a + b
    }

    val resultado = suma(5, 6)   // val resultado: Unit = ()

//  - Se puede evitar añadiendo el tipo de retorno esperado Int, que es una buena práctica