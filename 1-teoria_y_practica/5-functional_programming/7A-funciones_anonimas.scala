/*  ======================================================
    ================= FUNCIONES ANONIMAS =================
    ======================================================
*/

//  EJEMPLO 1
//  =========

    package scala

    object test {

        def main(args: Array[String]): Unit = {
            println("La salida de la funcion increments es " + increments(5)) // La salida de la funcion increments es 6
            printHelloWorld()   // Hello World
            println("La salida de la funcion Add es " + add(2,3)) // La salida de la funcion Add es 5
        }

        // ============= Ejemplo 1 =============

        // Ejemplo 1: Función anónima con 1 parámetro de entrada y 1 parámetro de salida
        // Forma normal de definir una función de incremento

        /*  def increments (x: Int) : Int = {
                x + 1
            }                                      */

        // Using function value / Anonymous functions
        var increments = (x: Int) => x + 1

        // ============= Ejemplo 2 =============

        // Ejemplo 2: Función anónima con 0 parámetro de entrada y 0 parámetro de salida
        // Forma normal de definir la función

        /*  def printHelloWorld () = {
                println("Hello World!")
            }                                      */

        // Using function value / Anonymous functions
        var printHelloWorld = () => println("Hello World")

        // ============= Ejemplo 3 =============

        // Ejemplo 3: Función anónima con 2 parámetros de entrada y 1 de salida
        // Forma normal de definir la función

        /*    def add (x: Int, y: Int) : Int = {
                x + y
                }                                    */

        // Using function value / Anonymous functions
        var add = (x:Int, y:Int) => x + y

    }