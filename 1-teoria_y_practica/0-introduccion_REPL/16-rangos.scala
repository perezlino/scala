/*  ======================================================
    ======================= RANGOS =======================
    ======================================================

     __________________________________________________________________________________
    |                                                                                  | 
    |    scala> var rango = 1 to 5                                                     | 
    |    rango: scala.collection.immutable.Range.Inclusive = Range 1 to 5              | 
    |                                                                                  | 
    |    scala> println(rango)                                                         |     
    |    Range 1 to 5                                                                  | 
    |                                                                                  | 
    |    scala> for (x <- rango)                                                       | 
    |        | {                                                                       |     
    |        |    println(x)                                                           | 
    |        | }                                                                       | 
    |    1                                                                             | 
    |    2                                                                             | 
    |    3                                                                             | 
    |    4                                                                             | 
    |    5                                                                             | 
    |                                                                                  | 
    |    scala> rango                                                                  | 
    |    res7: scala.collection.immutable.Range.Inclusive = Range 1 to 5               |     
    |                                                                                  | 
    |    scala> x(1)                                                                   | 
    |    <console>:13: error: Int does not take parameters                             |     
    |        x(1)                                                                      | 
    |            ^                                                                     | 
    |                                                                                  | 
    |    scala> rango(1)                                                               | 
    |    res9: Int = 2                                                                 |         
    |                                                                                  | 
    |    scala> rango(0)                                                               | 
    |    res10: Int = 1                                                                | 
    |                                                                                  | 
    |    scala> rango(2)                                                               | 
    |    res11: Int = 3                                                                | 
    |                                                                                  |     
    |    scala> val rango1 = 1 until 5                                                 | 
    |    rango1: scala.collection.immutable.Range = Range 1 until 5                    | 
    |                                                                                  | 
    |    scala> for (x <- rango1)                                                      | 
    |        | {                                                                       | 
    |        |    println(x)                                                           | 
    |        | }                                                                       | 
    |    1                                                                             | 
    |    2                                                                             | 
    |    3                                                                             | 
    |    4                                                                             | 
    |                                                                                  | 
    |    scala> rango2 = 1 to 20 by 4                                                  | 
    |    <console>:11: error: not found: value rango2                                  | 
    |        rango2 = 1 to 20 by 4                                                     | 
    |        ^                                                                         |     
    |    <console>:12: error: not found: value rango2                                  | 
    |        val $ires2 = rango2                                                       | 
    |                        ^                                                         | 
    |                                                                                  | 
    |    scala> val rango2 = 1 to 20 by 4                                              |     
    |    rango2: scala.collection.immutable.Range = inexact Range 1 to 20 by 4         | 
    |                                                                                  | 
    |    scala> for (x <- rango2)                                                      | 
    |        | {                                                                       | 
    |        |    println(x)                                                           | 
    |        | }                                                                       | 
    |    1                                                                             | 
    |    5                                                                             | 
    |    9                                                                             | 
    |    13                                                                            |     
    |    17                                                                            | 
    |                                                                                  | 
    |    scala> var minusculas = 'a' to 'z'                                            | 
    |    minusculas: scala.collection.immutable.NumericRange.                          | 
    |                           Inclusive[Char] = NumericRange a to z                  | 
    |                                                                                  |                 
    |    scala> for (x <- minusculas)                                                  | 
    |        | {                                                                       | 
    |        |    println(x)                                                           |     
    |        | }                                                                       | 
    |    a                                                                             | 
    |    b                                                                             | 
    |    c                                                                             |  
    |    d                                                                             | 
    |    e                                                                             | 
    |    f                                                                             | 
    |    g                                                                             | 
    |    h                                                                             | 
    |    i                                                                             |     
    |    j                                                                             | 
    |    k                                                                             | 
    |    l                                                                             |     
    |    m                                                                             | 
    |    n                                                                             | 
    |    o                                                                             | 
    |    p                                                                             | 
    |    q                                                                             |     
    |    r                                                                             | 
    |    s                                                                             | 
    |    t                                                                             | 
    |    u                                                                             | 
    |    v                                                                             | 
    |    w                                                                             |     
    |    x                                                                             | 
    |    y                                                                             | 
    |    z                                                                             | 
    |                                                                                  |     
    |    scala> println(minusculas(10))                                                | 
    |    k                                                                             | 
    |                                                                                  |         
    |    scala> var r:Range =_                                                         | 
    |    r: Range = null                                                               | 
    |                                                                                  | 
    |    scala> r = 1 to 4                                                             | 
    |    r: Range = Range 1 to 4                                                       | 
    |                                                                                  | 
    |    scala> r                                                                      | 
    |    res16: Range = Range 1 to 4                                                   | 
    |                                                                                  | 
    |                                                                                  |         
    |   scala>                                                                         | 
    |__________________________________________________________________________________|

*/     