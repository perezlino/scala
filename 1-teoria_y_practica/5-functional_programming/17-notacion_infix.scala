/*  ======================================================
    =================== NOTACION INFIX ===================
    ======================================================
*/

    package scala

    class Persona(nombre:String, edad:Int, peliculaFavorita:String){

        def gustos(movie:String):Boolean = movie == peliculaFavorita
    }

    object test {
        def main(args: Array[String]): Unit = {

            val alfonso = new Persona("Alfonso",36,"La Naranja Mecanica")

            println(alfonso.gustos("Children of Men"))
            // false

            // Escribimos la llamada al metodo de la forma 'INFIX'
            // Esta notacion podemos utilizar solo con los metodos con un argumento
            println(alfonso gustos "Children of men") <----------------------------------------
            // false
        }
    }