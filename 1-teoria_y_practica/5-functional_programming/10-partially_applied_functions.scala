/*  ======================================================
    ============= PARTIALLY APPLIED FUNCTION =============
    ======================================================
*/

//  Consiste en pasar algunos parametros o algunos argumentos que requiere la función, pero no todos. 
//  Y el resto demorarlos hasta más tarde.

//  EJEMPLO 1.A
//  ===========

    package scala

    object test {
        def main(args: Array[String]): Unit = {

            // Vemos que no pasamos el 3er argumento
            val x = calcular(10,20,_:Int)
            println(x)
        }
    //  scala.test$$$Lambda$15/0x0000000800c037b0@511baa65

        def calcular(n1:Int, n2:Int, n3:Int) = {
            n1 + n2 + n3
        }
    }


//  EJEMPLO 1.B
//  ===========

    // Le entregamos a la variable 'x' que almacena el valor devuelto por el metodo 'calcular'
    // el argumento que aun no entregamos, es decir, el 3er argumento.
    package scala

    object test {
        def main(args: Array[String]): Unit = {

            val x = calcular(10,20,_:Int)
            println(x(30)) // <=================================
        }
    // 60

        def calcular(n1:Int, n2:Int, n3:Int) = {
            n1 + n2 + n3
        }

    }


//  EJEMPLO 2
//  =========

    package scala

    object test {
        def main(args: Array[String]): Unit = {

            val v1 = sumar(_:Int,30,40)
            println(v1(20))
        }
    // 90
        
        // Funcion anonima
        val sumar = (n1:Int,n2:Int,n3:Int) => n1 + n2 + n3

    }


//  EJEMPLO 3 - CASO 1
//  ==================

//  Thread.sleep( ) : es un tiempo de espera, en este caso, de 2 segundos para que se ejecute la siguiente línea.

    package scala

    import java.util.Date

    object test {
        def main(args: Array[String]): Unit = {

            var date = new Date()

            log(date, "Hola 1 ")
            Thread.sleep(2000)
            log(date, "Hola 2 ")
            Thread.sleep(2000)
            log(date, "Hola 3 ")

        }
/*
        Hola 1 Thu Feb 23 14:15:09 CLST 2023
        ------- Esperamos 2 segundos y luego se imprimie la siguiente linea -------     
        Hola 2 Thu Feb 23 14:15:09 CLST 2023  
        ------- Esperamos 2 segundos y luego se imprimie la siguiente linea -------  
        Hola 3 Thu Feb 23 14:15:09 CLST 2023
*/

        def log(date: Date, msg: String) = {
            println(msg + date)
        }
    }

//  EJEMPLO 3 - CASO 2
//  ==================

    package scala

    import java.util.Date

    object test {
        def main(args: Array[String]): Unit = {

            var date = new Date()

            // Partially Applied Functions. _ será el parámetro
            // que espera la función aplicada parcialmente
            val logWithDate = log(date, _:String)

            logWithDate("Hola 1")
            Thread.sleep(2000)
            logWithDate("Hola 2")
            Thread.sleep(2000)
            logWithDate("Hola 3")
        }
/*
        Hola 1 Thu Feb 23 14:15:09 CLST 2023
        ------- Esperamos 2 segundos y luego se imprimie la siguiente linea -------     
        Hola 2 Thu Feb 23 14:15:09 CLST 2023  
        ------- Esperamos 2 segundos y luego se imprimie la siguiente linea -------  
        Hola 3 Thu Feb 23 14:15:09 CLST 2023
*/        

        def log(date: Date, msg: String) = {
            println(msg + date)
        }
    }


//  EJEMPLO 3
//  =========

    package scala

    object test {
        def main(args: Array[String]): Unit = {
            car("Mercedes")
            fourWheeler("BMW", "Car", 200000)
            truck("BMW")
        }
/*
        El nombre del vehiculo es: Mercedes, su tipo es: Car y su costo es: 200000
        El nombre del vehiculo es: BMW, su tipo es: Car y su costo es: 200000
        El nombre del vehiculo es: BMW, su tipo es: Truck y su costo es: 500000
*/

        val car = fourWheeler(_:String, "Car", 200000)        // partially implemented function
        val truck = fourWheeler(_:String, "Truck" , 500000)   // partially implemented function

        /*  Forma tradicional
            def fourWheeler(vehicleName: String, vehicleType: String, vehicleCost: Int): Unit = {
                println("El nombre del vehiculo es: " + vehicleName +
                ", su tipo es: " + vehicleType +
                " y su costo es: " + vehicleCost)
            }
        */
        
        // Funcion Anonima
        val fourWheeler = (vehicleName: String, vehicleType: String, vehicleCost: Int) => {
            println("El nombre del vehiculo es: " + vehicleName +
            ", su tipo es: " + vehicleType +
            " y su costo es: " + vehicleCost)
        }
    }


//  EJEMPLO 4
//  =========

    package scala

    object test {
        def main(args: Array[String]): Unit = {

            val resultado = sumar(4, _: Int, 7)
            println(resultado(5))     // 16
            
        }

        def sumar(a: Int, b: Int, c: Int) = a + b + c

    }


//  EJEMPLO 5
//  =========

package scala

object test {
    def main(args: Array[String]): Unit = {

        val resultado = sumar(_, _, _)
        println(resultado(1, 2, 3))     // 6

        // Obtenemos lo mismo reemplazando el parentesis por un _
        val resultado1 = sumar _
        println(resultado1(1, 2, 3))     // 6

    }

    def sumar(a: Int, b: Int, c: Int) = a + b + c

}