/*  ======================================================
    =================== DOMAIN MODELS ====================
    ======================================================


//  Son definiciones de clases de modelado de abstracción de datos puros para un dominio.

//  En Scala pueden, y a menudo lo hacen, tener múltiples clases en el mismo archivo.

//  Idiomáticamente sólo contienen valores de estado y comportamiento "puro" directamente relacionado con 
//  el modelo abstracto.

//  Por ejemplo, hagamos un modelo de dominio para Cars y Parking Garages:

    __________________________________________               __________________________________________ 
   |                <<abstract>>              |             |                <<abstract>>              |      
   |                   Vehicle                |             |               VehicleStorage             |  
   |------------------------------------------|             |------------------------------------------|   
   | + name: String (abstract)                | ---------🔷   + name: String (abstract)                
   | + description: Vector[String] (abstract) |             | + vehicles: Vector[Vehicle] (abstract)   | 
   |------------------------------------------|             |------------------------------------------| 
   | + fullDescription(): String              |             | + vehicleCount(): Int                    |  
   |__________________________________________|             |__________________________________________|
                        ᐱ                                                       ᐱ
                        | <<extends>>                                            | <<extends>> 
                        |                                                        |
    __________________________________________              __________________________________________
   |                   Car                    |            |            ParkingStructure              |
   |------------------------------------------|            |------------------------------------------|  
   | + name: String                           |            | + name: String                           |  
   | + description: Vector[String]            |            | + vehicles: Vector[Vehicle]              | 
   |__________________________________________|            |------------------------------------------| 
                                                           | + describeGarage(): String               |                       
                                                           |__________________________________________|

*/

//  CARS Y VEHICLES
//  ===============

    package scala

    abstract class Vehicle {

        def name: String
        def description: Vector[String]

        override def toString: String = s"Vehiculo($name)"

        def fullDescription: String = {
            (name +: description).mkString("\n")
        }
    }

    case class Car(name: String, description: Vector[String] = Vector.empty) extends Vehicle

    object test {
        def main(args: Array[String]): Unit = {

            val mustang = Car("Ford Mustang", Vector(
            "1965 Mustang", "Metallic Blue", "302 ci V8"
            ))

            val datsun = Car("Datsun 280Z", Vector(
            "1982 Datsun 280Z", "Candy Apple Red", "2.8 Liter I6"
            ))
            
            println(mustang)  // Vehiculo(Ford Mustang)
            println(mustang.fullDescription)    // Ford Mustang
                                                // 1965 Mustang
                                                // Metallic Blue
                                                // 302 ci V8
                                                // }
/*
        

*/
    }


//  PARKING STRUCTURE
//  =================

    package scala

    abstract class Vehicle {

        def name: String
        def description: Vector[String]

        override def toString: String = s"Vehiculo($name)"

        def fullDescription: String = {
            (name +: description).mkString("\n")
        }
    }

    case class Car(name: String, description: Vector[String] = Vector.empty) extends Vehicle

    // ------------------ Desde aqui agregamos las nuevas clases ------------------    

    abstract class VehicleStorage {

        def name: String
        def vehicles: Vector[Vehicle]  // <------ El tipo de retorno del metodo 'vehicles' es Vector[Vehicle]
                                        //         Esto quiere decir, que solo devolvera un Vector con elementos
                                        //         que sean 'Objetos' instanciados en la Clase 'Vehicle'. Asi,
                                        //         como en el caso que Vector[String] solo devuelve Un Vector con
                                        //         elementos 'string', en este caso, devolvera un Vector solo con
                                        //         objetos instanciados en la Clase 'Vehicle'.

        def vehicleCount: Int = vehicles.size  // <------ Cantidad de elementos devueltos por el metodo 'vehicles'

        override def toString: String =
            s"$name con $vehicleCount vehiculos"
    }

    case class ParkingStructure(name: String, vehicles: Vector[Vehicle]) extends VehicleStorage {

        def describeGarage: String = {
            val vehicleString = vehicles.mkString(", ")
            s"$name contiene $vehicleString"
        }

        override def toString = describeGarage
    }

    object test {
        def main(args: Array[String]): Unit = {

            val mustang = Car("Ford Mustang", Vector(
            "1965 Mustang", "Metallic Blue", "302 ci V8"
            ))

            val datsun = Car("Datsun 280Z", Vector(
            "1982 Datsun 280Z", "Candy Apple Red", "2.8 Liter I6"
            ))

            val lot = ParkingStructure("Parking garage", Vector(mustang, datsun))

            println(mustang)  // Vehiculo(Ford Mustang)
            println(mustang.fullDescription)    // Ford Mustang
                                                // 1965 Mustang
                                                // Metallic Blue
                                                // 302 ci V8
                                                // }

            println(lot.vehicleCount)   // 2
            println(lot.describeGarage) // Parking garage contiene Vehiculo(Ford Mustang), Vehiculo(Datsun 280Z)

        }
    }