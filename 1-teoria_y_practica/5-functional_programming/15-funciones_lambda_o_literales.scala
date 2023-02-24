/*  ======================================================
    ============ FUNCIONES LAMBDA O LITERALES ============
    ======================================================


    Una funcion literal (o lambda) no es más que una función (como un método) que puede no tener 
    nombre.

    Desde el punto de vista de quien llama, la sintaxis es intercambiable, por ejemplo:     */

    package scala

    object test {
        def main(args: Array[String]): Unit = {
            println(multiplyMethod(2, 3))     // 6
            println(multiplyAnonimo(2, 3))    // 6
            println(multiplyFunction(2, 3))   // 6

        }

        // Metodo tradicional
        def multiplyMethod(a: Int, b: Int): Int = a * b
        // multiplyMethod: (a: Int, b: Int)Int

        // Funcion anonima
        var multiplyAnonimo = (a:Int, b:Int) => a * b
        // multiplyAnonimo: (Int, Int) => Int = $Lambda$1079/0x0000000801190400@433d93e7

        // Metodo Literal o Lambda
        val multiplyFunction: (Int, Int) => Int = (a, b) => a * b
        // multiplyFunction: (Int, Int) => Int = $Lambda$1080/0x0000000801191198@54556723

    }

/*  Observa cómo el método tiene un nombre 'multiplyMethod' pero la lambda sólo tiene un tipo. Lo 
    asignamos a un valor para tener un nombre, pero eso no es necesario para usar una funcion literal, 
    sólo para identificarlo.        


    Como funciona un Metodo Literal o Lambda
    ========================================    

    Aunque ahora utilizan Java 8 Lambdas, detrás de escena los detalles son los mismos que siempre han 
    sido para las funciones literales de Scala  */

    package scala

    object test {
        def main(args: Array[String]): Unit = {
            println(fn1(2, 3))          // 5
            println(fn1.apply(2, 3))    // 5
            println(fn2(2, 3))          // 5
            println(fn2.apply(2, 3))    // 5
        }

        val fn1: (Int, Int) => Int = (a, b) => a + b

        // El 3er argumento de Function2 es el tipo de retorno
        val fn2 = new Function2[Int, Int, Int] {
            override def apply(a: Int, b: Int) = a + b
        }
    }
