/*  ======================================================
    ============= EXPRESIONES VS SENTENCIAS ==============
    ======================================================
*/

//  - Las expresiones son estructuras que pueden evaluarse para obtener un valor.

    val expresion = 40 + 2

//  - Una expresión devuelve su carga útil como argumento de retorno con un tipo, por ejemplo:

    val a = 10
    val b = 20

    val max = if (a > b) a else b   // 'if' es una 'Expresion'
/*
    val a: Int = 10
    val b: Int = 20

    val max: Int = 20
*/

//  Expresiones matematicas: +, -, *, /, bitwise |, &, <<, >>, <<<

    val expresionMatematica = 2 + 3 * 4

//  Expresiones de comparacion: <, >, <=, >=, ==, !=

    val equalityTest = 1 == 2

//  Expresiones booleanas: !, ||, &&

    val nonEqualityTest = !equalityTest

//  Los bloques de codigo son 'Expresiones'

    val codeBlock = {
        val a = 20
        val b = 40
        val c = a + b
        c  // <---------- Ultima expresion: Valor del bloque
    }



//  Sentencias (Instrucciones) vs Expresiones
//  -----------------------------------------

//  Las 'expresiones' se evalúan, las 'instrucciones' se ejecutan.


//  - Una sentencia (o instruccion) devuelve Unit y tiene que tener algún side effect para ser útil:

    val a = 10
    val b = 20

    if (a > b) println(s"max is $a") else println(s"max is $b")
/*
    max is 20
    res0: Unit = ()
*/

    val imprimirTexto = println("Scala")
/*
    Scala
    res1: Unit = ()    
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