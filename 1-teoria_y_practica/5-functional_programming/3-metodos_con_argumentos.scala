/*  ======================================================
    =============== METODOS CON ARGUMENTOS ===============
    ======================================================
*/

//  EJEMPLO 1
//  =========

    package curso

    object example {

        def sum(x:Int, y:Int):Int = {
            println("El valor de 'x' es " +  x)
            println("El valor de 'y' es " +  y)
            return (x + y)  // No es obligatorio utilizar 'return'
        }

        def main(args: Array[String]): Unit = {
            var z = sum(y = 2, x = 3)
            println(z)
        }
    }
/*
        El valor de 'x' es 3
        El valor de 'y' es 2
        5
*/


//  EJEMPLO 2
//  =========

    package scala

    class Practica {

        def ejemplo1(funcion:Unit) {

        }

        def ejemplo2(cifra1:Int, f:Int=>Int):Int = {
            f(cifra1)
        }

    }

    object FuncionComoParametro {
        def main(args: Array[String]): Unit = {

            var pr1 = new Practica
            pr1.ejemplo1(println("nada"))               // nada

            def multi(numero:Int)={
            numero*5
            }

            println(pr1.ejemplo2(10,multi))             // 50

            println(pr1.ejemplo2(10,(x:Int)=>x*20 ))    // 200
        }
    }


//  EJEMPLO 3
//  =========

    package scala

    object test {

        def calcular(operacion:String, numero1:Int, numero2:Int) = {
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

            println(calcular("+",10,20))
            println(calcular("+",10,0))
            println(calcular("xxx",10,0))
            println(calcular("xxx",10,20))
            println(calcular(numero1 = 10,operacion = "+", numero2 = 20))
            println(calcular(operacion = "+", 50, 60))

        }
/*
        30
        No se puede dividir por 0
        No se puede dividir por 0
        Operacion Incorrecta
        30
        110
*/
    }