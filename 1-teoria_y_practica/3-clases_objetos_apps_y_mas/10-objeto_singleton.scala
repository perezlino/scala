/*  ======================================================
    ================== OBJETO SINGLETON ==================
    ======================================================
*/

//  No se puede crear un objeto instanciándolo desde otro objeto.

//  Si necesito acceder al valor de un atributo del Objeto, lo puedo llamar directamente.


//  EJEMPLO 1
//  =========

    package curso

    object DemoObjectA { //1ª Nota: En lugar de clase, esto es objeto

        val x = 2
        val y = 5.5

        def addValue() =  x + y

        println(s"x = ${x} , y = ${y}")
    }

    object SingletonDemoA {
        def main(args: Array[String]): Unit = {

        //  val demoObjectA1 = new DemoObjectA //2ª Nota: Si lo descomentas, dará error, dado que no se
        //                                                puede crear un Objeto a partir de otro Objeto

            println(DemoObjectA.x, DemoObjectA.y) //3ª Nota: Acceder a la variable como 'nombreObjeto.nombreVariable'
            

            val a = DemoObjectA.addValue() //4ª Nota: Accede al método/función como 'nombreObjeto.metodo'
            println(a)
        }
/*
        x = 2 , y = 5.5   // Se manda a llamar el 'println' del Objeto 'DemoObject' 
        (2,5.5)
        7.5
*/
    }


//  EJEMPLO 2
//  =========

    package curso

    object Asignatura {

        def aprobado {println("Aprobado")}
        def suspendido {println("Suspendido")}
    }

    object Singleton_Objects{
        def main(args: Array[String]): Unit = {

            Asignatura.aprobado     // Aprobado
            Asignatura.suspendido   // Suspendido
        }
    }


//  EJEMPLO 3
//  =========

    package scala

    object Singleton {
        val numero = 50
        def metodo(x:Int) = x + 1
    }


    object test {
        def main(args: Array[String]): Unit = {

            val singleton = Singleton
            println(singleton)  // scala.Singleton$@7f63425a

            val otroSingleton = Singleton
            println(otroSingleton)  // scala.Singleton$@7f63425a

            val igualdadReferencial = singleton == otroSingleton
            println(igualdadReferencial)   // true

            val num = Singleton.numero
            println(num)   // 50

            val method = Singleton.metodo(2)
            println(method)   // 3

        }
    }