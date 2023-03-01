/*  ======================================================
    =================== DOMAIN MODELS ====================
    ======================================================

                                             __________________________________________              
                                            |                <<abstract>>              |                 
                                            |                RollingStock              |             
                                            |------------------------------------------|              
                                            | + name: String (abstract)                |                    
                                            |------------------------------------------|                    
                                            |__________________________________________|           
                                                                 ᐱ
                                                                 |          
                                                                 |
                                                                 |
                                     ____________________________|____________________________                    
                                    |                                                         |              
                                    | <<extends>>                                 <<extends>> |   
                 ___________________|______________________               ____________________|_______________________
                |                <<abstract>>              |             |                <<abstract>>                |      
                |                   Car                    |             |                   Engine                   |  
                |------------------------------------------|             |--------------------------------------------|   
                | + carries: String (abstract)             | ---------🔷   + maxCars: Int (abstract)                   
                |------------------------------------------|             | + cars: mutable.ListBuffer[Car] (abstract) | 
                | + pulled(): String                       |             |--------------------------------------------| 
                |__________________________________________|             | + pull(): String                           |              
                                    ᐱ                                      + add(car:Car): Unit                        
                                    |                                    |____________________________________________|
                                    |                                                           ᐱ         
                                    |                                                           |
                                    |                                                           |
                    ________________|________________                           ________________|________________     
                   |                                 |                         |                                 |        
       <<extends>> |                     <<extends>> |             <<extends>> |                     <<extends>> |       
        ___________|___________           ___________|___________   ___________|___________           ___________|___________                     |
       |     PassengerCar      |         |        CargoCar       | |      SteamEngine      |         |     DieselEngine      |
       |-----------------------|         |-----------------------| |-----------------------|         |-----------------------|
       |+ name = "Passenger car"         |+ name = "Cargo car"   | |+ name = "Steam engine"|         |+ name = "Diesel engine"   
       |+ carries = "people"   |         |+ carries = "cargo"    | |+ maxCars = 3          |         |+ maxCars = 6          |
       |_______________________|         |_______________________| |_______________________|         |_______________________| 
*/

//  DESARROLLO
//  ==========

    package scala

    import scala.collection.mutable.ListBuffer

    // La Clase abstracta 'RollingStock' debe tener un atributo abstracto, 'name', de tipo String
    abstract class RollingStock {
        val name: String
    }

    // La Clase abstracta 'Car' debería ser subclase de 'RollingStock' y añadir un atributo 'carries' de tipo String
    // y un método (con implementación) llamado 'pulled' que devuelva una cadena formada por
    // name + " carrying " + carries
    abstract class Car extends RollingStock {
        val carries: String
        def pulled: String = name + " carrying " + carries
        override def toString: String = pulled
    }

    // La Clase concreta 'PassengerCar' debería ser una subclase de 'Car', definir el atributo 'name' como "Passenger car" y
    // el atributo 'carries' a "people".
    class PassengerCar extends Car {
        val name = "Passenger car"
        val carries = "people"
    }

    // La Clase concreta 'CargoCar' debería ser una subclase de 'Car', definir el atributo de name como "Cargo car" y
    // el atributo 'carries' a "cargo".
    class CargoCar extends Car {
        val name = "Cargo car"
        val carries = "cargo"
    }

    // Ahora crea una Clase abstracta 'Engine' que sea subclase de 'RollingStock' y tenga lo siguiente:
    // - Un atributo 'cars' con un mutable.ListBuffer de 'Car'
    // - Un método 'pull' que devuelva una cadena consistente en name + "pulls" + la lista de 'cars' en el
    //   ListBuffer utilizando el método 'pull' para obtener la cadena descriptiva de cada coche. Los detalles de los 
    //   coches deben
    // - Estar unidos con " and ", y no debe haber un " and " al final después del último coche
    // - Un campo abstracto 'maxCars' de tipo Int (que especifica el número máximo de cars que pueden
    //   ser añadidos al engine), y finalmente
    // - Un método 'add' que toma un Car, y lo añade al ListBuffer *salvo* que exceda el
    //   número máximo de Cars permitido en el atributo 'maxCars'. Si hay demasiados coches, lanza un IllegalStateException 
    //   con un mensaje adecuado
    abstract class Engine extends RollingStock {
        protected val cars = ListBuffer.empty[Car]

        def pull: String = name + " pulls " + cars.mkString(" and ")

        val maxCars: Int

        def add(car: Car) {
            if (cars.length >= maxCars)
                throw new IllegalStateException("Too many cars for this type of engine")
            cars += car
        }

        override def toString: String = pull
    }

    // Crea una Clase concreta 'SteamEngine' que sea subclase de 'Engine', define el atributo 'name' como "Steam engine"
    // y el atributo 'maxCars' a 3.
    class SteamEngine extends Engine {
        val name = "Steam engine"
        val maxCars = 3
    }

    // Crea una Clase concreta DieselEngine que sea una subclase de Engine, define el atributo name como "Diesel engine"
    // y el atributo maxCars a 6
    class DieselEngine extends Engine {
        val name = "Diesel engine"
        val maxCars = 6
    }    

    object test {
        def main(args: Array[String]): Unit = {   

            val steamEngine = new SteamEngine

            steamEngine.add(new PassengerCar)
            steamEngine.add(new PassengerCar)
            
            println(steamEngine.pull)
            // Steam engine pulls Passenger car carrying people and Passenger car carrying people

            val dieselEngine = new DieselEngine
            dieselEngine.add(new CargoCar)
            dieselEngine.add(new PassengerCar)
            dieselEngine.add(new CargoCar)
            dieselEngine.add(new PassengerCar)
            dieselEngine.add(new CargoCar)

            println(dieselEngine.pull)
            // Diesel engine pulls Cargo car carrying cargo and Passenger car carrying people and
            // Cargo car carrying cargo and Passenger car carrying people and Cargo car carrying cargo            
  }
}