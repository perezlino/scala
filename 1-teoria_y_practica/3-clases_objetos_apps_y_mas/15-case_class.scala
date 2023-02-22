/*  ======================================================
    ===================== CASE CLASS =====================
    ======================================================
*/

// 	Las Case Class no son más que clases regulares + código extra autogenerado.

//  EJEMPLO 1
//  =========

    package curso

    case class Car(name: String, model: String) {

        val carName = name
        val carModel = model

        def printDetails(): Unit = {
            println(s"El nombre del coche es: ${carName} o ${name} y el modelo del coche es: ${carModel}.")
        }
    }

    object CaseClassDemoA {
        def main(args: Array[String]): Unit = {

            val bmw = Car("BMW", "550")  // 1. No es necesario escribir "new", ya que el método "apply" es
            bmw.printDetails()           //    autogenerado en case class


            /*  bmw.name = "B.M.W"    2. El parámetro del constructor es val por defecto. por lo tanto metodo
                bmw.printDetails()       modificador (SETTER) no se genera automáticamente, por lo que no se
                                         puede cambiar el nombre. Sin embargo, si cambias el parámetro del
                                         constructor a var, el método modificador se generará automáticamente
                                         y podrás modificar el valor de la variable  */


            bmw match {                         // 3. Case class autogenera el metodo unapply,
                case Car(a,b) => println(a,b)   //    utilizado por el pattern matching
            }


            // 4. Autogenera el metodo copy()
            val mercedes = bmw.copy(name = "mercedes")
            mercedes.printDetails()

            // 5. Autoimplementa los metodos 'equals' y 'hashcode'
            println(bmw == mercedes)

            //6. Autoimplementa el metodo 'toString'
            println(bmw)
        }
/*
        El nombre del coche es: BMW o BMW y el modelo del coche es: 550.
        (BMW,550)
        El nombre del coche es: mercedes o mercedes y el modelo del coche es: 550.
        false
        Car(BMW,550)
*/
    }