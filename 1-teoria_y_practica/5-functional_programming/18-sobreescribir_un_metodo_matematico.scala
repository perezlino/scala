/*  ======================================================
    ========= SOBREESCRIBIR UN METODO MATEMATICO =========
    ======================================================
*/

//  Notar que sobreescribimos el metodo '+'. De esta forma le estamos agregando funciones
//  especificas. Si lo utilizamos con el fin de 'suma' funciona correctamente, al igual cuando
//  se utiliza con el fin de 'concatenacion'

package scala

class Persona(val nombre:String, val edad:Int, peliculaFavorita:String){

  // Recordar 'this.nombre' llama al argumento 'nombre' de la Clase
  // 'person.nombre' llama al argumento 'nombre' del Objeto pasado por argumento
  def +(person:Persona):String =
    s"${this.nombre} es el mejor amigo de ${person.nombre}"

  // OVERLOADING
  def +(nickname:String):Persona =
    new Persona(s"$nombre ($nickname)", edad, peliculaFavorita)    
}

object test {
  def main(args: Array[String]): Unit = {

    val alfonso = new Persona("Alfonso",36,"La Naranja Mecanica")
    val javiera = new Persona("Javiera",28,"Fight Club")

    println(alfonso + javiera)
    // Alfonso es el mejor amigo de Javiera

    println(1 + 2)
    // 3

    println("Hola " + alfonso.nombre)
    // Hola Alfonso    

    // println(alfonso + "Batman") // scala.Persona@511baa65
    val alfonsoNickname = alfonso + "Batman"
    println(alfonsoNickname.nombre) // Alfonso (Batman)    

  }
}