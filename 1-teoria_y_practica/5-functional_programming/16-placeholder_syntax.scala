/*  ======================================================
    ================= PLACEHOLDER SYNTAX =================
    ======================================================
*/

//  Hasta ahora hemos visto definiciones de funciones como (a, b) => a + b y x => x * 2, pero para 
//  definiciones muy simples, existe un atajo sintáctico

    val nums = (1 to 10).toList
    nums.filter(_ < 4)            // placeholder style for x => x < 4
    nums.span(_ % 4 != 0)         // placeholder style for x => x % 4 != 0
    nums.partition(_ % 4 != 0)
    compareNeighbors(nums, _ + _) // placeholder style for (a, b) => a + b

//  El marcador de posición sólo se puede utilizar cuando cada parámetro se utiliza exactamente una vez 
//  en el orden

//  Por ejemplo, _ * _ no puede utilizarse en lugar de x => x * x, ya que x se utiliza dos veces.

//  Los _s tampoco pueden estar dentro de paréntesis (eso significa algo diferente), así que

    _ - _ // puede sustituirse por (a, b) => a - b

    // pero
    (_ - _).abs // no puede sustituirse por (a, b) => (a - b).abs

