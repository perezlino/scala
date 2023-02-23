/*  ======================================================
    ================ PARAMETRO POR DEFECTO ===============
    ======================================================
*/

//  EJEMPLO 1
//  =========

    package scala

    object test {

        def div (x: Int  = 5, y:Int = 1) : Double = {
            println("El valor de x es: " + x)
            println("El valor de y es: " + y)
            return(x / y.toDouble)
        }

        def main(args: Array[String]): Unit = {

            println(div(5,3))
/*
            El valor de x es: 5
            El valor de y es: 3
            1.6666666666666667
*/
            println(div(2,0))
/*
            El valor de x es: 2
            El valor de y es: 0
            Infinity
*/
            println(div(2))
/*
            El valor de x es: 2
            El valor de y es: 1
            2.0
*/
            println(div(y = 2))
/*
            El valor de x es: 5
            El valor de y es: 2
            2.5
*/
        }
    }


//  EJEMPLO 2
//  =========

    package scala

    object test {

        def calcular(operacion:String, numero1:Int = 5, numero2:Int = 2) = {
            if (numero2 == 0) {
                "No se puede dividir por 0"
            } else {
                operacion match {
                case "+" => numero1 + numero2
                case "-" => numero1 - numero2
                case "*" => numero1 * numero2
                case "/" => numero1 / numero2
                case _ => "Operacion Incorrecta"
                }
            }
        }

        def main(args: Array[String]): Unit = {

            println(calcular("+", 90))              // 92
            println(calcular("+", numero2 = 20))    // 25
            println(calcular("+", 90, 8))           // 98
            println(calcular("*"))                  // 10
        }
    }