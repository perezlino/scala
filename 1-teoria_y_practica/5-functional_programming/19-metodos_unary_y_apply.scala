/*  ======================================================
    ================ METODOS UNARY Y APPLY ===============
    ======================================================
*/

package scala

class Persona(val nombre:String, val edad:Int, val peliculaFavorita:String){

  // Siempre se utiliza 'unary_' y a continuacion podemos agregar un prefijo -, +, ~, !
  // Se debe dejar un espacio entre 'unary_- :' o en su defecto utilizar 'unary_-():'
  def unary_- :String = s"$nombre tiene superpoderes!"

  // Este metodo nos permite 'duplicar' un Objeto
  // Tambien nos permite modificar el valor de los argumentos
  def unary_+():Persona = new Persona(nombre, edad, peliculaFavorita = "Napoleon Dynamite!")

  def apply():String =
    s"Hola, mi nombre es $nombre y mi pelicula favorita es $peliculaFavorita"

  def apply(n:Int):String =
    s"He visto $peliculaFavorita $n veces el ultimo mes"
}

object test {

  def main(args: Array[String]): Unit = {

    val alfonso = new Persona("Alfonso",36,"La Naranja Mecanica")
    val javiera = new Persona("Javiera",28,"Fight Club")

    println(-alfonso)
    // Alfonso tiene superpoderes!

    // println(+alfonso)  // scala.Persona@511baa65
    val alfonsoNuevamente = +alfonso
    println(alfonsoNuevamente.peliculaFavorita)  // Napoleon Dynamite!

    println(alfonso())
    // Hola, mi nombre es Alfonso y mi pelicula favorita es La Naranja Mecanica

    println(alfonso(20))
    // He visto La Naranja Mecanica 20 veces el ultimo mes
    
  }
}