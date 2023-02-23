/*  ======================================================
    ================== TRY CATCH FINALLY =================
    ======================================================
*/

//  Al igual que if, try ... catch ... finally de Scala es una expresión

//  El resultado (y el tipo) lo deciden los bloques try y catch.

//  Si está presente, el bloque finally siempre se ejecuta, pero no afecta al resultado ni al tipo

    // Devuelve un Array de 'length' igual a 0
    val args = Array.empty[String]

    val fileName2 =
    try {
        // Selecciona el primer elemento del Array
        args.head
    }
    catch {
        // NoSuchElementException:
        // Lanzado por varios métodos de acceso para indicar que el elemento solicitado no existe.
        case _: NoSuchElementException => "default.txt"
    }
    finally {
        println("Finalmente")
        "the finally block"
    }
  /*
    Finalmente
    val fileName2: String = default.txt
  */