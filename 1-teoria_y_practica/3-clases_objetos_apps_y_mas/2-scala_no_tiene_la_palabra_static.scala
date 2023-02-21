/*  ======================================================
    ========= SCALA NO TIENE LA PALABRA 'STATIC' =========
    ======================================================
*/

//  En Java se declara el metodo 'main' de la siguiente manera:

                                    public static void main()

//  En Scala no se utiliza la 'static' keyword. Por lo tanto, no podemos definir un main() con 'static'.

//  TODOS LOS METODOS SON ESTATICOS:

    object helloWorld {

        // Este es el metodo 'main' en Scala. Recordar que 'Unit' cumple la funcion de 'void'
        def main(args: Array[String]): Unit = {  

            println("Hello World!")

    }
