/*  ======================================================
    ====================== EJEMPLO ======================
    ======================================================
*/

//  - Como por ejemplo, hagamos algo para representar un número Racional a partir de lo que sabemos hasta 
//    ahora:

    package curso

    class Rational(val n: Int, val d: Int) // Clase sin cuerpo


    object example {
        def main(args: Array[String]): Unit = {

            val racional1 = new Rational(1, 2)
            println(racional1)
            // curso.Rational@7f63425a
        }
    }

//  --------------------------------------------------------------------------------------------------------
//  - Cada clase tiene un método toString que puede ser sobreescrito:

    package curso

    class Rational(val n: Int, val d: Int) {

        override def toString: String = s"R($n/$d)"
    }

    object example {
        def main(args: Array[String]): Unit = {

            val racional1 = new Rational(1, 2)
            println(racional1)
            // R(1/2)

            val divByZero = new Rational(1, 0) // probablemente deberías evitar esto
            println(divByZero)
            // R(1/0)

        }
    }

//  --------------------------------------------------------------------------------------------------------
//  - Si utilizas 'require' y el predicado falla, obtendrás una 'IllegalArgumentException'
//  - El campo String en 'require' es opcional pero recomendado 

    package curso

    class Rational(val n: Int, val d: Int) {

        require(d != 0, "Zero denominator!") // precondicion
        override def toString: String = s"R($n/$d)"
    }

    object example {
        def main(args: Array[String]): Unit = {

            val racional1 = new Rational(1, 2)
            println(racional1)
            // R(1/2)

            val divByZero = new Rational(1, 0)
            println(divByZero)
        /*  Exception in thread "main" java.lang.IllegalArgumentException: requirement failed: Zero denominator!
            at scala.Predef$.require(Predef.scala:337)
            at curso.Rational.<init>(test.scala:4)
            at curso.example$.main(test.scala:15)
            at curso.example.main(test.scala)
        */

        }
    }

//  --------------------------------------------------------------------------------------------------------
//  - También podría escribir ==> require(this.d != 0, "¡Zero denominator!")
//  - 'this' es una referencia a la instancia actual. Es inferida por Scala cuando es posible

    package curso

    class Rational(val n: Int, val d: Int) {

        require(d != 0, "Zero denominator!") // precondicion
        override def toString: String = s"R($n/$d)"

        // Notar que se utiliza el tipo 'Rational', de manera que a su argumento podemos pasarle
        // un Objeto de tipo 'Rational'
        def min(objeto: Rational): Rational = {
                                // Se antepone 'objeto' (puede llevar cualquier nombre) para
                                // llamar (hacer referencia) a los atributos del Objeto que se paso 
                                // como argumento en el metodo.
            if ((n.toDouble / d) < (objeto.n.toDouble / objeto.d)) // Podríamos haber utilizado 'this' para las 
                                                                   // referencias n y d en min
        //  if ((this.n.toDouble / this.d) < (objeto.n.toDouble / objeto.d))

            this else objeto    // Se tiene que usar esto para devolver                                                                   
        }
    } 

    object example {
    def main(args: Array[String]): Unit = {

        val racional1 = new Rational(1, 2)
        println(racional1)
        // R(1/2)

        val racional2 = new Rational(1, 5)
        println(racional2)
        // R(1/5)

        val minimo = racional1.min(racional2)  // Llamamos al metodo 'min'
        println(minimo)                        // Podriamos utilizar la sintaxis 'infix' ==> racional1 min racional2
        // R(1/5)                              // y es exactamente lo mismo
        
    }
    }

//  --------------------------------------------------------------------------------------------------------
//  - Infix y Symbolic methods

    package curso

    class Rational(val n: Int, val d: Int) {

        require(d != 0, "Zero denominator!") 
        override def toString: String = s"R($n/$d)"

        def min(objeto: Rational): Rational = {
            if ((this.n.toDouble / this.d) < (objeto.n.toDouble / objeto.d))
            this else objeto
    }

        // Suma racional
        // Se utiliza el 'new Rational' dado que el metodo va a obtener 
        // Por ejemplo --> 'new Rational(2,2)'
        // Instanciando un nuevo Objeto 'Rational'
        def suma(objeto: Rational): Rational =
            new Rational(
            this.n * objeto.d + this.d * objeto.n,
            this.d * objeto.d
            )
    }

    object example {
        def main(args: Array[String]): Unit = {

            val racional1 = new Rational(1, 2)
            println(racional1)
            // R(1/2)

            val racional2 = new Rational(1, 5)
            println(racional2)
            // R(1/5)

            val minimo = racional1.min(racional2)
            println(minimo)
            // R(1/5)

            val adicion = racional1 suma racional2  // ===> Utilizamos el metodo 'suma'
            // R(7/10)    
        }
    }

//  --------------------------------------------------------------------------------------------------------
//  - Infix y Symbolic methods
//  - Cambia 'suma' por '+' e infix hace el resto    

    package curso

    class Rational(val n: Int, val d: Int) {

        require(d != 0, "Zero denominator!") 
        override def toString: String = s"R($n/$d)"

        def min(objeto: Rational): Rational = {
            if ((this.n.toDouble / this.d) < (objeto.n.toDouble / objeto.d))
            this else objeto
    }

        // Suma racional
        def +(objeto: Rational): Rational =
            new Rational(
            this.n * objeto.d + this.d * objeto.n,
            this.d * objeto.d
            )
    }

    object example {
        def main(args: Array[String]): Unit = {

            val racional1 = new Rational(1, 2)
            println(racional1)
            // R(1/2)

            val racional2 = new Rational(1, 5)
            println(racional2)
            // R(1/5)

            val minimo = racional1.min(racional2)
            println(minimo)
            // R(1/5)

            val adicion = racional1 + racional2  // ===> Utilizamos el metodo 'suma'
            // R(7/10)    
        }
    }

//  --------------------------------------------------------------------------------------------------------
//  Tambien podemos agregar un constructor auxiliar a la Clase 'Rational'
//  Una mejor alternativa es usar 'Factory methods' en un 'Objeto Companion'

    package curso

    class Rational(val n: Int, val d: Int) {

        require(d != 0, "Zero denominator!")
        override def toString: String = s"R($n/$d)"

        def min(objeto: Rational): Rational = {
            if ((this.n.toDouble / this.d) < (objeto.n.toDouble / objeto.d))
            this else objeto
    }

        // Suma racional
        def +(objeto: Rational): Rational =
            new Rational(
            this.n * objeto.d + this.d * objeto.n,
            this.d * objeto.d
            )

        // Constructor auxiliar de un argumento
        // Por defecto, el segundo argumento será igual a 1
        def this(numero:Int) = this(numero, 1)
    }

    object example {
        def main(args: Array[String]): Unit = {

            val racional1 = new Rational(1, 2)
            println(racional1)
            // R(1/2)

            val racional2 = new Rational(1, 5)
            println(racional2)
            // R(1/5)

            val minimo = racional1.min(racional2)
            println(minimo)
            // R(1/5)

            val adicion = racional1 + racional2
            // R(7/10)

            // Este Objeto es un numero entero
            // El constructor de un argumento por defecto le entrega un denominador igual a 1
            val racional3  = new Rational(5)
            println(racional3)
            // R(5/1)

            val adicion2 = racional1 + racional3
            println(adicion2)
            // R(11/2)
        }
    }

//  --------------------------------------------------------------------------------------------------------
//  Creamos un 'Objeto Companion' y dos 'Factory methods' que nos permitiran crear instancias sin utilizar
//  la palabra 'new'

    package curso

    class Rational(val n: Int, val d: Int) {

        require(d != 0, "Zero denominator!")
        override def toString: String = s"R($n/$d)"

        def min(objeto: Rational): Rational = {
            if ((this.n.toDouble / this.d) < (objeto.n.toDouble / objeto.d))
            this else objeto
    }

    // Suma racional
    def +(objeto: Rational): Rational =
        new Rational(
        this.n * objeto.d + this.d * objeto.n,
        this.d * objeto.d
        )

    // Constructor auxiliar de un argumento
    // def this(numero:Int) = this(numero, 1)
    }

    // Objeto Companion
    object Rational {

        // Factory methods
        def apply(n: Int, d: Int): Rational = new Rational(n, d)
        def apply(i: Int): Rational = new Rational(i, 1)

    }

    object example {
        def main(args: Array[String]): Unit = {

            // Ahora TODAS LAS INSTANCIAS no usan 'new'

            val racional1 = Rational(1, 2)
            println(racional1)
            // R(1/2)

            val racional2 = Rational(1, 5)
            println(racional2)
            // R(1/5)

            val minimo = racional1.min(racional2)
            println(minimo)
            // R(1/5)

            val adicion = racional1 + racional2
            // R(7/10)

            val racional3 = Rational(5)
            println(racional3)
            // R(5/1)

            val adicion2 = racional1 + racional3
            println(adicion2)
            // R(11/2)
        }
    }

//  --------------------------------------------------------------------------------------------------------
//  Sobrecarga de metodos

    package curso

    class Rational(val n: Int, val d: Int) {

        require(d != 0, "Zero denominator!")
        override def toString: String = s"R($n/$d)"

        def min(objeto: Rational): Rational = {
            if ((this.n.toDouble / this.d) < (objeto.n.toDouble / objeto.d))
            this else objeto
    }

    // Suma racional 1
    def +(objeto: Rational): Rational =
        new Rational(
        this.n * objeto.d + this.d * objeto.n,
        this.d * objeto.d
        )

    // Suma racional 2 --> Basicamente sumara un racional con un entero
    def +(i: Int): Rational = 
        this + Rational(i) // Se utilizará un 'Factory method' de un argumento
    }

    // Objeto Companion
    object Rational {

        // Factory methods
        def apply(n: Int, d: Int): Rational = new Rational(n, d)
        def apply(i: Int): Rational = new Rational(i, 1)

    }

    object example {
        def main(args: Array[String]): Unit = {

            // Ahora TODAS LAS INSTANCIAS no usan 'new'

            val racional1 = Rational(1, 2)
            println(racional1)
            // R(1/2)

            val racional2 = Rational(1, 5)
            println(racional2)
            // R(1/5)

            val minimo = racional1.min(racional2)
            println(minimo)
            // R(1/5)

            val adicion = racional1 + racional2
            // R(7/10)

            val racional3 = Rational(5)
            println(racional3)
            // R(5/1)

            // Aqui se utiliza la 'Suma racional 2'
            val adicion2 = racional1 + racional3
            println(adicion2)
            // R(11/2)
        }
    }

//  --------------------------------------------------------------------------------------------------------
//  Se puede calcular 'racional1 + 5' y 'Rational(5) + racional1' pero no '5 + racional1'
//  Se debe aplicar 'implicit'

    package curso

    class Rational(val n: Int, val d: Int) {

        require(d != 0, "Zero denominator!")
        override def toString: String = s"R($n/$d)"

        def min(objeto: Rational): Rational = {
            if ((this.n.toDouble / this.d) < (objeto.n.toDouble / objeto.d))
            this else objeto
    }

    // Suma racional 1
    def +(objeto: Rational): Rational =
        new Rational(
        this.n * objeto.d + this.d * objeto.n,
        this.d * objeto.d
        )

    // Suma racional 2 --> Basicamente sumara un racional con un entero
    def +(i: Int): Rational = 
        this + Rational(i) // Se utilizará un 'Factory method' de un argumento
    }

    // Objeto Companion
    object Rational {

        // Factory methods
        def apply(n: Int, d: Int): Rational = new Rational(n, d)
        def apply(i: Int): Rational = new Rational(i, 1)

    }

    object example {
        def main(args: Array[String]): Unit = {

            // Ahora TODAS LAS INSTANCIAS no usan 'new'

            val racional1 = Rational(1, 2)
            println(racional1)
            // R(1/2)

            val racional2 = Rational(1, 5)
            println(racional2)
            // R(1/5)

            val minimo = racional1.min(racional2)
            println(minimo)
            // R(1/5)

            val adicion = racional1 + racional2
            // R(7/10)

            val racional3 = Rational(5)
            println(racional3)
            // R(5/1)

            // Aqui se utiliza la 'Suma racional 2'
            val adicion2 = racional1 + racional3
            println(adicion2)
            // R(11/2)

            // Utiliza la 'Suma racional 2'
            // this + Rational(5) ---> racional1 + Rational(5)  ---> Rationa(1,2) + Rational(5,1)
            println(racional1 + 5)
            // R(11/2)

            // Utiliza la 'Suma racional 1'
            // Rational(5,1) + Rational(1,2)
            // new Rational ((5*2)+(1*1),(1*2)) --> new Rational(11,2) --> R(11/2)
            println(Rational(5) + racional1)
            // R(11/2)

            // No se puede
            println(5 + racional1)
        }
    }

//  --------------------------------------------------------------------------------------------------------
//  Aplicar 'implicit'

//  - Para la conversión implícita, debe importar language.implicitConversions para evitar la advertencia
//  - Ya no es necesario el método sobrecargado + para Int
//  - Scala usa implicits para resolver problemas de tipos
//  - La conversión implícita tiene un único tipo "in" y un único tipo "out", por ejemplo:

    implicit def apply(i: Int): Rational = new Rational(i, 1)

//  - Los objetos companion para tipos involucrados en problemas de tipos son uno de los lugares donde Scala 
//    busca implicits
//  - Los implícitos en un objeto companion son difíciles de "des-invitar".
//  - Deben estar marcados con la palabra clave 'implicit'
//  - El nombre no le importa a Scala, sólo importan los tipos
//  - Los implícitos también se pueden usar para val, object y class (más sobre implícitos más adelante)

    package curso

    class Rational(val n: Int, val d: Int) {

        require(d != 0, "Zero denominator!")
        override def toString: String = s"R($n/$d)"

        def min(objeto: Rational): Rational = {
            if ((this.n.toDouble / this.d) < (objeto.n.toDouble / objeto.d))
            this else objeto
    }

    // Suma racional 1
    def +(objeto: Rational): Rational =
        new Rational(
        this.n * objeto.d + this.d * objeto.n,
        this.d * objeto.d
        )

    // Suma racional 2 --> Basicamente sumara un racional con un entero
    // def +(i: Int): Rational = 
    //     this + Rational(i) // Se utilizará un 'Factory method' de un argumento
    }

    // Objeto Companion
    object Rational {

        // Factory methods
        def apply(n: Int, d: Int): Rational = new Rational(n, d)
        implicit def apply(i: Int): Rational = new Rational(i, 1)  // <============== Anteponemos 'implicit'

    }

    object example {
        def main(args: Array[String]): Unit = {

            // Ahora TODAS LAS INSTANCIAS no usan 'new'

            val racional1 = Rational(1, 2)
            println(racional1)
            // R(1/2)

            val racional2 = Rational(1, 5)
            println(racional2)
            // R(1/5)

            val minimo = racional1.min(racional2)
            println(minimo)
            // R(1/5)

            val adicion = racional1 + racional2
            // R(7/10)

            val racional3 = Rational(5)
            println(racional3)
            // R(5/1)

            // Aqui se utiliza la 'Suma racional 2'
            val adicion2 = racional1 + racional3
            println(adicion2)
            // R(11/2)

            println(racional1 + 5)
            // R(11/2)

            println(Rational(5) + racional1)
            // R(11/2)

            println(5 + racional1)
            // R(11/2)
        }
    }