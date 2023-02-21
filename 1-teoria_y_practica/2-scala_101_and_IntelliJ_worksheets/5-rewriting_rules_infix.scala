/*  ======================================================
    ============== RE-WRITING RULES - INFIX ==============
    ======================================================
*/

//  - Scala no tiene operadores (como tales), aunque lo parezca:

val x = 1 + 2   // val x: Int = 3

//  - ¿Qué es + si no es un operador? Un método. Lo anterior se puede reescribir:

val y = 1.+(2)  // val y: Int = 3

//  - Esto se conoce como notación infija (infix), funciona para todos los métodos sobre una instancia con 
//    un parámetro, p.e.

val s = "hello" // val s: String = hello

s.charAt(1) // val res0: Char = e
s charAt 1  // val res1: Char = e

//  - Sin embargo, no funciona sin una instancia antes del método:

// println "hello" // no se compila

System.out println "hello"  // hello