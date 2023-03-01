/*  ======================================================
    ================= INTRODUCCION A OOP =================
    ======================================================
*/

//  EJEMPLO 1
//  ---------

    package scala

    class Persona(val nombre:String, val edad:Int) {  // Constructor

        val nombreMayusc = nombre.toUpperCase()

        // 'this.nombre' utiliza el argumento entregado en la Clase
        // '$nombre' utiliza el argumento entregado en este metodo
        def saludo(nombre: String): String = {
            s"${this.nombre} dice: Hola $nombre"
        }

        // OVERLOADING
        def saludo():String = {
            s"Hola a todos, mi nombre es $nombre"
        }

        // Constructores auxiliares
        def this(){
            this("Pedro",30)
        }

        def this(nombre:String){
            this(nombre,27)
        }
    }

    object test {
        def main(args: Array[String]): Unit = {

            val persona = new Persona("Alfonso",36)
            val persona2 = new Persona("Javiera")
            val persona3 = new Persona()

            val personaNombre = persona.nombre
            println(personaNombre) // Alfonso

            val persona2Nombre = persona2.nombre
            println(persona2Nombre) // Javiera

            val persona3Nombre = persona3.nombre
            println(persona3Nombre) // Pedro

            val personaEdad = persona.edad
            println(personaEdad) // 36

            val persona2Edad = persona2.edad
            println(persona2Edad) // 27

            val persona3Edad = persona3.edad
            println(persona3Edad) // 30

            val alfonsoSaludo = persona.saludo("Javiera")
            println(alfonsoSaludo) // Alfonso dice: Hola Javiera

            val alfonsoSaluda = persona.saludo()
            println(alfonsoSaluda) // Hola a todos, mi nombre es Alfonso

            val alfonsoMayusc = persona.nombreMayusc
            println(alfonsoMayusc) // ALFONSO        

        }
    }


//  EJEMPLO 2
//  ---------

    package scala

    class Escritor(val nombre:String, val apellido:String, val anoNacimiento:Int) { // Constructor

        def nombreCompleto: String = s"$nombre $apellido"
        }
        //'autor:Escritor' se le entrega como argumento un Objeto instanciado de la Clase 'Escritor'
        class Novela(val titulo:String, val anoLanzamiento:Int, autor:Escritor){

        // 'autor.anoNacimiento' --> ObjetoClaseEscritor.anoNacimiento  --> Ej: charlesDickens.anoNacimiento = 1812
        def autorEdad():Int = anoLanzamiento - autor.anoNacimiento

        // 'this.autor' utiliza el argumento entregado en la Clase
        // 'autor' utiliza el argumento entregado en este metodo
        def escritoPor(autor:Escritor):Boolean = this.autor == autor

        def copia(nuevoAno:Int):Novela = new Novela(titulo,nuevoAno,autor)
    }

    object test {
        def main(args: Array[String]): Unit = {

            val charlesDickens = new Escritor("Charles","Dickens",1812)
            val charlesDickensImpostor = new Escritor("Charles","Dickens",2021)
            val novela = new Novela("Great Expectations",1861,charlesDickens)
            val nuevaEdicion = novela.copia(1871)

            println(charlesDickens.nombreCompleto)
            // Charles Dickens

            println(novela.autorEdad)
            // 49

            // Recordar que '==' compara 'Referencias', es decir, si ambos apuntan a la misma referencia.
            // charlesDickens == charlesDickens
            println(novela.escritoPor(charlesDickens))
            // true

            // charlesDickens == charlesDickensImpostor
            println(novela.escritoPor(charlesDickensImpostor))
            // false

            println(nuevaEdicion.autorEdad)
            // 59

            println(nuevaEdicion.titulo)
            // Great Expectations
        }
    }