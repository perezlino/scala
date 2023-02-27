/*  ======================================================
    ================= DEFINIR UNA LISTA ==================
    ======================================================
*/

//  - Inmutable
//  - Rendimiento y memoria eficientes para las 'head operations'
//  - Covariante
//  - Siempre termina con el singleton Nil
//  - Implementación sencilla

//  Para una secuencia inmutable de objetos que comparten el mismo tipo puedes usar la clase List de Scala. 
//  Al igual que los arrays, una List[String] sólo contiene strings. Como las Listas son inmutables, se 
//  comportan un poco como las strings de Java: cuando llamas a un método en una lista que podría parecer 
//  por su nombre que la lista va a mutar, en su lugar crea y devuelve una nueva lista con el nuevo valor.

    val colores: List[String] = List("Rojo","Azul","Verde")
    // val colores: List[String] = List(Rojo, Azul, Verde)

    val colores = List("Rojo","Azul","Verde")
    // val colores: List[String] = List(Rojo, Azul, Verde)

    val numerosPar = List(2,4,6,8,10)
    // val numerosPar: List[Int] = List(2, 4, 6, 8, 10)

    // La lista de Integers y Double será considerada como una lista de Double
    val numeros = List(1,2,3.0,4.0,5)
    // val numeros: List[Double] = List(1.0, 2.0, 3.0, 4.0, 5.0)

    // Una lista de Integers, Double y String será considerada como una lista de Any
    val varios = List(1,2,3,"Alfonso",4.0)
    // val varios: List[Any] = List(1, 2, 3, Alfonso, 4.0)

    val listasA = List(List(1,2,3), List(4,5,6), List(7,8,9))
    // val listasA: List[List[Int]] = List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9))

    // List[Int] y List[Double] hacen List[AnyVal]
    val listasB = List(List(1,2,3), List(4.0,5.0,6.0), List(7,8,9))
    // val listasB: List[List[AnyVal]] = List(List(1, 2, 3), List(4.0, 5.0, 6.0), List(7, 8, 9))

//  ----------------------------------------------------------------------------------------------------

//  Definir la lista usando :: y Nil 

//  :: es asociativo derecho, por lo que el elemento final debe ser una Lista (es decir, Nil)

    (7 :: 8 :: 9 :: Nil)
    // val res0: List[Int] = List(7, 8, 9)

    (7 :: (8 :: (9 :: Nil)))
    // val res1: List[Int] = List(7, 8, 9)

    (7 :: (8 :: (9 :: Nil))) :: Nil
    // val res2: List[List[Int]] = List(List(7, 8, 9))

    val colores = "Rojo" :: "Azul" :: "Verde" :: Nil
    // val colores: List[String] = List(Rojo, Azul, Verde)

    val matriz = (1::(2::(3::Nil))) :: (4::(5::(6::Nil))) :: (7::(8::(9::Nil))) :: Nil
    // val matriz: List[List[Int]] = List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9))

//  ----------------------------------------------------------------------------------------------------

//  Definir la lista usando 'range'

    List.range(1, 5)
    // val res0: List[Int] = List(1, 2, 3, 4)

    val numeros = List.range(1, 5)
    // val numeros: List[Int] = List(1, 2, 3, 4)

    val numeros2 = List.range(2, 10, 2)
    // val numeros2: List[Int] = List(2, 4, 6, 8)

    val numeros3 = List.range(1, 10, 2)
    // val numeros3: List[Int] = List(1, 3, 5, 7, 9)

    val numeros4 = (1 to 10 by 2).toList
    // val numeros4: List[Int] = List(1, 3, 5, 7, 9)

//  ----------------------------------------------------------------------------------------------------

//  'fill' - Crear una lista con los mismos datos

    val colores = List.fill(3)("Azul")
    // val colores: List[String] = List(Azul, Azul, Azul)

    val doubles = List.fill(3)(2.0)
    // val doubles: List[Double] = List(2.0, 2.0, 2.0)

    val enteros = List.fill(3)(10)
    // val enteros: List[Int] = List(10, 10, 10)

//  ----------------------------------------------------------------------------------------------------

// 'tabulate' - Puede aplicar alguna función para generar elementos en la lista

    val numeros = List.tabulate(4) (x => x + 10)
    // val numeros: List[Int] = List(10, 11, 12, 13)

    val numeros2 = List.tabulate(4) (x => x * x)
    // val numeros2: List[Int] = List(0, 1, 4, 9)

    val numeros3 = List.tabulate(3,3) ((x,y) => x * y)
    // val numeros3 = List.tabulate(3,3) (_ * _)
    // val numeros3: List[List[Int]] = List(List(0, 0, 0), List(0, 1, 2), List(0, 2, 4))

    // Explicacion numeros3:
/*   _______________________________________________
    |   filas / columnas   |    0   |   1   |   2   | 
    |----------------------|--------|-------|-------|
    |           0          |    0   |   1   |   2   |   
    |           1          |    0   |   1   |   2   | 
    |           2          |    0   |   2   |   4   |
    |----------------------|--------|-------|-------|
*/