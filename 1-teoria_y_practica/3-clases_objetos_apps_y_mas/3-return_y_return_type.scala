/*  ======================================================
    ================ RETURN Y RETURN TYPE ================
    ======================================================
*/

package scala

object FuncionesClasesYObjetos {

  def main(args: Array[String]): Unit = {

    def suma(x:Int, y:Int):Int = {
      var z = x + y
      return z
    }

    def sumaa(x:Int, y:Int):Int = {
      var z = x + y
      z                             // No es obligatorio especificar la palabra clave 'return'
    }

    def sumab(x:Int, y:Int) = {     // No es obligatorio especificar el 'return type'. Se autointerpreta
      var z = x + y
      z                             // No es obligatorio especificar la palabra clave 'return'
    }

    def sumac(x:Int, y:Int):Int = { // Si se especifica la palabra clave 'return'
      var z = x + y                 // es obligatorio especificar el 'return type'
      return z
    }

    def sumad(x:Int, y:Int) = x + y // No es obligatorio utilizar { }. Se utiliza { } para mas de 1 linea de codigo
  }
}