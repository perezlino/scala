/*  ======================================================
    =========== METODOS SIN TIPOS DE RETORNOS ============
    ======================================================


    - Java (y algunos otros lenguajes) tienen una palabra clave void, que denota "sin tipo de retorno"

    - En Scala, cada método y variable tiene un tipo, no hay void.

    - El equivalente aproximado es Unit, del que sólo hay una instancia: ()         */

    def sayHi(name: String): Unit =  // def sayHi(name: String): Unit 
        println(s"hello $name")

    sayHi("Scala class")  // hello Scala class

//  - Los métodos que resultan en Unit deben tener efectos secundarios (side effects) para ser útiles 
//    (IO es uno de esos efectos secundarios)

//  - Scala todavía tiene sintaxis procedimental, que tiene el mismo efecto, pero está obsoleta (deprecated).

    def sayHello(name: String) {
        println(s"hello $name")
    }

//  - Recibirá una advertencia, e IntelliJ intentará corregirle, utilice siempre :Unit = en lugar de la sintaxis 
//    procedimental