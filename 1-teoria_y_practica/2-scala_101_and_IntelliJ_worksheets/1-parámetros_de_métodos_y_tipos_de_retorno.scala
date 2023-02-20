/*  ======================================================
    ====== PARAMETROS DE METODOS Y TIPOS DE RETORNOS =====
    ======================================================
*/

//  - Veamos la definición de un método:

    def max(x: Int, y: Int): Int =
        if (x > y) x else y

// - Esto es completamente tipado, en que el parámetro, y el retorno, los tipos son especificados. Podemos 
//   omitir el tipo de retorno, ya que Scala puede inferirlo:

    def min(x: Int, y: Int) =
        if (x < y) x else y

// - Como verás en la worksheet, el método tiene exactamente el mismo tipo, el tipo de retorno Int es 
//   inferido por el compilador

// - Sin embargo no puedes dejar las anotaciones de tipo de los parámetros, ya que Scala no tiene contexto 
//   para deducirlas.