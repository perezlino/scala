/*  ======================================================
    = INVOCACION DE METODOS/CONSTRUCTORES DE SUPERCLASE ==
    ======================================================
*/

//  Se debe sobreescribir (override) los vals de la superclase con el mismo nombre

//  Los parámetros del constructor se pasan a través de extends

//  Las llamadas super en los métodos llaman a la superclase

//  EJEMPLO 1
//  =========

    package scala

    abstract class Vehicle(val name: String, val age: Int) {
        override def toString: String =
            s"$name, $age años de edad"
    }

    class Car(
            override val name: String, // <-----------  Se debe sobreescribir el parametro de la Clase Padre
        //  name:String                // <-----------  Tambien llamandolas de esta forma funciona. Seguirán 
                                       //               siendo 'públicos' debido a la definición de la superclase.
                                       //               Recordar que, si no anteponemos 'val' o 'var' en un 
                                       //               parametro, no podemos acceder a el de manera directa desde
                                       //               una instancia. Pero no se puede hacerlos 'vals' en la Clase 
                                       //               'Car' sin un 'override'.
            val make: String,
            val model: String,
            override val age: Int      // <-----------  Se debe sobreescribir el parametro de la Clase Padre
        //  age:Int    
            ) extends Vehicle(name, age) {

        override def toString: String =
            s"Un $make $model, llamado ${super.toString}" // <-------- Con 'super.toString' llamamos al metodo 'toString'
    }                                                     //           de la Clase padre.

    object test {
        def main(args: Array[String]): Unit = {

            val mustang = new Car("Alfonso", "Ford", "Mustang", 50)
            println(mustang)
        }
/*
        Un Ford Mustang, llamado Alfonso, 50 años de edad
*/
    }