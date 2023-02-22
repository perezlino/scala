/*  ======================================================
    ================ CONSTRUCTOR AUXILIAR ================
    ======================================================
*/

//  Existe un constructor primario, mientras que pueden existir múltiples constructores auxiliares.

//  EJEMPLO 1
//  =========

    package curso

    class demoClass3(val a:Int, val b:Double, val c:String){

        val x = a
        var y = b
        val z = c

        println(s"El constructor primario dice: x = ${x} , y = ${y} y z = ${z}")

        def addNumber() = {
            x + y
        }

        def this(){
            this(99, 88.88, "Hola Scala")
            println("Entre en el constructor auxiliar con 0 parametros")
        }

        def this(a:Int){
            this(a, 88.88, "Hola Scala")
            println("Entre en el constructor auxiliar con 1 parametro")
        }

        def this(a:Int, b:Double){
            this(a, b, "Hola Scala")
            println("Entre en el constructor auxiliar con 2 parametro")
        }

        def this(c:String){
            this(6,66.66,c)
            println("Entre en el constructor auxiliar con 1 parametro que era c:String")
        }
    }

    object constructorDemo3 {
        def main(args: Array[String]): Unit = {

            val demoObject1 = new demoClass3(5,7.2,"Hola Mundo!") 
            // El constructor primario dice: x = 5 , y = 7.2 y z = Hola Mundo!

            val demoObject2 = new demoClass3()
            // El constructor primario dice: x = 99 , y = 88.88 y z = Hola Scala
            // Entre en el constructor auxiliar con 0 parametros            
            
            val demoObject3 = new demoClass3(7)
            // El constructor primario dice: x = 7 , y = 88.88 y z = Hola Scala
            // Entre en el constructor auxiliar con 1 parametro            

            val demoObject4 = new demoClass3(7,2.2)
            // El constructor primario dice: x = 7 , y = 2.2 y z = Hola Scala
            // Entre en el constructor auxiliar con 2 parametro            

            val demoObject5 = new demoClass3("Hola Java!")
            // El constructor primario dice: x = 6 , y = 66.66 y z = Hola Java!
            // Entre en el constructor auxiliar con 1 parametro que era c:String            

            val demoObject6 = new demoClass3(a = 5, b = 7.2, c = "Hola Mundo!")
            // El constructor primario dice: x = 5 , y = 7.2 y z = Hola Mundo!

        }
    }


//  EJEMPLO 2
//  =========

    package curso

    class Producto (var cod_producto:Int, var nombre:String){

        println("Se inicia el constructor")
        
        private var pvp:Int = 0

        def this(cod_producto:Int, nombre:String, pvp:Int){
            this(cod_producto,nombre)
            this.pvp = 50
        }

        def imprimir: Unit = {
            println(s"El codigo es $cod_producto y se llama $nombre y cuesta $pvp")
        }
        
        println("Sigo en el constructor")
    }

    object ConstructorAuxiliar1 {
        def main(args: Array[String]): Unit = {

            var producto1 = new Producto(10, "Tornillos")
            producto1.imprimir
            producto1.nombre = "Tuercas"  // Dado que el parametro de la Clase 'Producto es 'var nombre:String'
                                          // me permite modificarlo
            producto1.imprimir
            
            var producto2 = new Producto(100, "Martillos", 90)
            producto2.imprimir
        }
/*
        Se inicia el constructor
        Sigo en el constructor
        El codigo es 10 y se llama Tornillos y cuesta 0
        El codigo es 10 y se llama Tuercas y cuesta 0
        Se inicia el constructor
        Sigo en el constructor
        El codigo es 100 y se llama Martillos y cuesta 50
*/
    }


//  EJEMPLO 3
//  =========

    package curso

    class Empleado {

        println("Se inicia el constructor")

        private var nombre: String =_
        private var pais: String =_
        private var edad: Int = 0

        def imprimir: Unit = {
            println(s"El empleado se llama $nombre, vive en $pais y tiene $edad años")
        }

        def this (nombre:String) {
            this()
            this.nombre = nombre
        }

        def this (nombre:String, pais:String) {
            this(nombre)
            this.pais = pais
        }

        def this (nombre:String, pais:String, edad:Int) {
            this(nombre, pais)
            this.pais = pais
            this.edad = edad
        }
    }

    object ConstructoresAuxiliares {

        def main(args: Array[String]): Unit = {

            var empleado1 = new Empleado()
            empleado1.imprimir
            // Se inicia el constructor
            // El empleado se llama null, vive en null y tiene 0 años        

            var empleado2 = new Empleado("Rosa")
            empleado2.imprimir
            // Se inicia el constructor
            // El empleado se llama Rosa, vive en null y tiene 0 años        

            var empleado3 = new Empleado("Alfonso", "Chile")
            empleado3.imprimir
            // Se inicia el constructor
            // El empleado se llama Alfonso, vive en Chile y tiene 0 años        

            var empleado4 = new Empleado("Pedro","Colombia",40)
            empleado4.imprimir
            // Se inicia el constructor
            // El empleado se llama Pedro, vive en Colombia y tiene 40 años        
        }
    }