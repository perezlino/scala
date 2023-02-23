/*  ======================================================
    =========== NUMERO VARIABLE DE ARGUMENTOS ============
    ======================================================
*/

//  Número variable de argumentos en una función.

//  También podemos trabajar con args:Int*, args:Float*, etc..

//  String* significa que está definiendo un Array[String]

//  No puede tener más de un *.

//  def nombreFuncion(args:String*) “args:” siempre va como único argumento o en el argumento de la derecha, 
//  es decir:

    def printMultipleTimes(args:String*) = {}
    def printMultipleTimes(n:Int, args:String*) = {}
    def printMultipleTimes(args:String*, n:Int) = {}    // DEVUELVE ERROR
    def printMultipleTimes(n:Int, args:String*, args:String*) = {}    // DEVUELVE ERROR


//  EJEMPLO 1
//  =========

    package scala

    object test {

        def printMultipleTimes(n:Int, args:String*) = {
            for (arg <- args) println(arg * n)
        }

        def main(args: Array[String]): Unit = {
        printMultipleTimes(3, "Hello", "World", "India", "Singapore")
        }
    /*
        HelloHelloHello
        WorldWorldWorld
        IndiaIndiaIndia
        SingaporeSingaporeSingapore
    */
    }


//  EJEMPLO 2
//  =========

    package scala

    object test {

        def calcularMuchos(operacion:String, numeros: Int*)= {
            if (numeros.length<2) {
            "No se puede calcular con solo un numero"
            } else {
                var total:Double = 0
                if (operacion=="+" || operacion=="-") total = 0 else total = 1

                operacion match {
                    case "+" => {numeros.foreach(x => total = total + x)
                                total}
                    case "-" => {numeros.foreach(x => total = total - x)
                                total}
                    case "*" => {numeros.foreach(x => total = total * x)
                                total}
                    case "/" => {numeros.foreach(x => total = total / x)
                                total}
                    case _ => "Operacion Incorrecta"
                }
            }
        }

        def main(args: Array[String]): Unit = {

        println(calcularMuchos("+",8,6,10))     // 24.0
        println(calcularMuchos("+",8))          // No se puede calcular con solo un numero
        println(calcularMuchos("/",8,6,0))      // Infinity

        }
    }