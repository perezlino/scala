/*  ======================================================
    ================== DEFINIR UN ARRAY ==================
    ======================================================
*/

//  Un array de Scala es una secuencia mutable de objetos que comparten el mismo tipo. Un Array[String] 
//  contiene sólo strings, por ejemplo. Aunque no puedes cambiar la longitud de un array después de su 
//  instanciación, puedes cambiar los valores de sus elementos. Por lo tanto, los arrays son objetos 
//  mutables.

    var num:Array[Int] = new Array[Int](3)
    // var num: Array[Int] = Array(0, 0, 0)

//  O tambien:

    var num = new Array[Int](3)
    // var num: Array[Int] = Array(0, 0, 0)

//  Para strings:

    var str: Array[String] = new Array[String](4)
    // var str: Array[String] = Array(null, null, null, null)

//  Para Double:

    var double: Array[Double] = new Array[Double](4)
    // var double: Array[Double] = Array(0.0, 0.0, 0.0, 0.0)

//  ----------------------------------------------------------------------------------------------------

//  Definir un array con valores

//  El Array identificará los valores ingresados y les asignará un tipo de dato.

    var num1 = Array(30, 40, 50)  // var num1: Array[Int] = Array(30, 40, 50)

    var str = Array("Chile","Argentina","Peru")  //  var str: Array[String] = Array(Chile, Argentina, Peru)

    var array1: Array[Int] = (1 to 10).toArray[Int] // var array1: Array[Int] = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    var array2: Array[Int] = new Array(array1.size) // var array2: Array[Int] = Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)

//  ----------------------------------------------------------------------------------------------------

//  Copiar los elementos del array1 desde la posición 0, en el array2 desde la posición 0, la cantidad de 
//  elementos que tenga el array1.

    Array.copy(array3,0,array4,0,array3.size)

    array2  // res0: Array[Int] = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
