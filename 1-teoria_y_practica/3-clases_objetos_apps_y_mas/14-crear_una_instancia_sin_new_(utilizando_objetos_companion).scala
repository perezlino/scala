/*  ==================================================================
    == CREAR UNA INSTANCIA SIN 'NEW' (UTILIZANDO OBJETOS COMPANION) ==
    ==================================================================
*/

//  El ‘new’ lo hace en el Companion object, dentro del método apply.

//  EJEMPLO 1
//  =========

    package curso

    class Alumno {

        var nombre:String =_
    }

    object Alumno {

        // Metodo apply
        def apply(nombre:String): Alumno = {
            var alumno1 = new Alumno
            alumno1.nombre = nombre
            alumno1                 // El 'return' en Scala es la ultima linea de codigo
        }
    }

    object instanciaSinNew {
        def main(args: Array[String]): Unit = {

            // Llevan por nombre 'Factory methods'
            // Definir Objeto 'Alumno' sin 'new'
            var alumno = Alumno("Alfonso")
            println(alumno.nombre)              // Alfonso
        }
    }


//  EJEMPLO 2
//  =========

    package curso

    class Alumno(nombre:String, apellido:String) {

        override def toString: String = "Nombre:" + nombre + " " + apellido
    }

    object Alumno {

        // Metodo apply con constructor de dos argumentos
        def apply(nombre:String, apellido:String): Alumno = new Alumno(nombre, apellido)

        // Metodo apply con constructor de un argumento
        def apply(nombre:String): Alumno = new Alumno(nombre, "Perez")

    }

    object instanciaSinNew {
        def main(args: Array[String]): Unit = {

            // Llevan por nombre 'Factory methods'
            // Definir Objeto 'Alumno' sin 'new'
            var alumno = Alumno("Alfonso")
            println(alumno)                             // Nombre:Alfonso Perez

            var alumno2 = Alumno("Tomas", "Lino")
            println(alumno2)                            // Nombre:Tomas Lino

        }
    }


//  EJEMPLO 3
//  =========

//  - Podemos acceder al comportamiento privado de la clase
//  - Podemos hacer privado el constructor y utilizar sólo los factory methods:

    package curso

    class Alumno private (nombre:String, apellido:String) {     // Notar donde va ubicado 'private'

        override def toString: String = "Nombre:" + nombre + " " + apellido
    }

    object Alumno {

        // Metodo apply con constructor de dos argumentos
        def apply(nombre:String, apellido:String): Alumno = new Alumno(nombre, apellido)

        // Metodo apply con constructor de un argumento
        def apply(nombre:String): Alumno = new Alumno(nombre, "Perez")

    }

    object instanciaSinNew {
        def main(args: Array[String]): Unit = {

            // Llevan por nombre 'Factory methods'
            // Definir Objeto 'Alumno' sin 'new'
            var alumno = Alumno("Alfonso")
            println(alumno)                             // Nombre:Alfonso Perez

            var alumno2 = Alumno("Tomas", "Lino")
            println(alumno2)                            // Nombre:Tomas Lino

          //var alumno3 = new Alumno("Javiera", "Mora") // La Clase 'Alumno' al ser 'privado' no nos permite
                                                        // crear un Objeto utilizando 'new'. Si borramos 'new'
                                                        // podemos crear el Objeto.

        }
    }    