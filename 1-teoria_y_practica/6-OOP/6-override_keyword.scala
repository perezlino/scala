/*  ======================================================
    ================== OVERRIDE KEYWORD ==================
    ======================================================
*/

//  Si un val o def define un atributo o método con los mismos tipos de parámetros sobre otro del mismo nombre, 
//  debe marcarse con override

//  Si un val o def define un atributo o método que no sobreescribe un atributo o método de la superclase con los 
//  mismos tipos de parámetros, no debe marcarse con override

//  Si un val o def define un atributo o método con los mismos tipos de parámetros implementando un atributo o método 
//  previamente abstracto, puede o no estar marcado con override


//  EJEMPLO 1
//  =========

// CLASE ABSTRACTA = PADRE
// CLASE NORMAL = HIJA

    abstract class Upper {
        def blip: String
        val blep: String
        val blop: String = "blop"
        def op(x: Int, y: Int): Int
    }

    class Lower extends Upper {

        // override def blip: String = "blip" <---  Obtenemos el mismo resultado
        def blip:String = "blip"
        // val blip:String = "blip" <-- Funciona

        // def blep:String = "blep" <-- Error
        // val blep:String <-- Funciona
        val blep:String = "blep"

        // val blop: String = "bloop"  <--------- Error
        override val blop: String = "bloop"

        //override def op(x: Int, y: Int): Int = x + y  <---  Obtenemos el mismo resultado
        def op(x: Int, y: Int): Int = x + y

        // Si nos fijamos es el mismo metodo 'op' pero con distintos tipos para sus
        // parametros. Por tanto, se toma como un metodo 'nuevo' y no necesita ni debemos
        // sobreeescribirlo, sino, nos devolvera error.
        
        // override def op(x: Double, y: Double): Double = x + y  <-- Error
        def op(x: Double, y: Double): Double = x + y
    }


//  EJEMPLO 2
//  =========

// CLASE NORMAL = PADRE
// CLASE NORMAL = HIJA

    class Upper {
        def blip: String = "Hola Mundo!"
        val blop: String = "blop"
        def op(x: Int, y: Int): Int = x + y
        def op(x: Double, y: Double): Double = x + y
    }

    class Lower extends Upper {

        override def blip: String = "blip"
        // def blip:String = "blip" <--- Error 
        // override val blip:String = "blip"  <--- Funciona  
        // val blip:String = "blip" <-- Error

        // val blop: String = "bloop"  <--------- Error
        override val blop: String = "bloop"

        // def op(x: Int, y: Int): Int = x + y <-- Error
        override def op(x: Int, y: Int): Int = x + y

        // def op(x: Double, y: Double): Double = x + y  <---- Error
        override def op(x: Double, y: Double): Double = x + y
    }