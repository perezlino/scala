/*  ======================================================
    === USO DE LAS PALABRAS 'FINAL', 'SEALED' Y 'OPEN' ===
    ======================================================


    // 'final' y 'sealed' nos permiten RESTRINGIR LA HERENCIA.


    USOS DE LA PALABRA FINAL
    ========================

    - En VARIABLES: La palabra 'final' evita cambiar el valor que almacena la variable

    - En METODOS: La palabra 'final' evita que se modifique la definicion de un metodo desde una subclase. 
                  Cuando trabajamos con el concepto de 'Herencia', la palabra 'final' evita que los metodos
                  en la Clase hija modifiquen el comportamiento definido de un metodo en la Clase padre

    - En CLASES: La palabra 'final' evita que se cree una subclase. Cuando trabajamos con el concepto de 
                 'Herencia', la palabra 'final' evita que creemos Clases hijas de la Clase que hemos
                 marcado como 'final'.


    USO DE LA PALABRA 'SEALED'
    =========================

    Al utilizar 'sealed' junto a una Clase, permite solo generar 'Herencia' en un mismo archivo y no desde
    un archivo externo.


    USO DE LA PALABRA 'OPEN'
    ========================

    No es obligatorio. Es utilizada solo para indicar que una Clase esta habilitada para ser 'extendida o heredada'.

*/

//  EJEMPLO 1
//  ---------

    package scala

    //  ----------------------------------- 'final' ------------------------------------

    // CLASE PADRE
    class Persona(val nombre:String){
        final def numero:Int = 50     // Restringimos el acceso al metodo desde una Clase Hija
    }

    class Adulto(val nombre:String){
        override def numero:Int = 100   // <------ Error! No podemos acceder ni sobreescribir metodos 'final'
    }

    final class Animal{
        println("Soy un Animal!")
    }

    class Gato extends Animal   // <----- Error! No podemos heredar de una Clase 'final'

    //  ----------------------------------- 'sealed' -----------------------------------

    sealed class Guitarra(nCuerdas:Int){
        println(s"La guitarra utiliza $nCuerdas")
    }

    class GuitarraElectrica(nCuerdas:Int) extends Guitarra(nCuerdas)

    class GuitarraAcustica extends Guitarra(6)

    //  ------------------------------------ 'open' ------------------------------------

    open class GuitarraHeredable(nCuerdas:Int)


    object test {
        def main(args: Array[String]): Unit = {
            
        }
    }