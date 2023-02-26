/*  ======================================================
    ================== DEFINIR UNA TUPLA =================
    ======================================================
*/

//  Algunas características de las Tuplas:

//  -	Immutables
//  -	Número fijo de elementos (1 a 22)
//  -	Pueden existir distintos tipos de elementos dentro de una tupla

    val tuple1 = (1, "String Data", 2.3)  // val tuple1: (Int, String, Double) = (1,String Data,2.3)
    tuple1.getClass // val res0: Class[_ <: (Int, String, Double)] = class scala.Tuple3

    val tuple1 = (1, "String Data", 2.3, 5, 5.6)  
    // val tuple1: (Int, String, Double, Int, Double) = (1,String Data,2.3,5,5.6)
    
    tuple1.getClass // val res1: Class[_ <: (Int, String, Double, Int, Double)] = class scala.Tuple5


    // También puedes crear una tupla como se indica a continuación:

    // Si se especifican 5 elementos, utiliza 'new Tuple5':
    val tuple1 = new Tuple5(1, "String Data", 2.3, 5, 5.6)
    // val tuple1: (Int, String, Double, Int, Double) = (1,String Data,2.3,5,5.6)

    // Si se especifican 2 elementos, utiliza 'new Tuple2':
    val tuple1 = new Tuple2(1, "String Data")
    // val tuple1: (Int, String) = (1,String Data)

//  --------------------------------------------------------------------------------------------------

//  La tupla no se utiliza mucho. En lugar de Tuple la mayoría de la gente utiliza 'case class'.

//  Opción 1: Usar una tupla. No hay legibilidad del código. La siguiente persona no sabe si "xyz" es 
//            nombre o apellido.

    val student1 = (1, "xyz", "abc")
    // val student1: (Int, String, String) = (1,xyz,abc)

//  Opción 2: Usar una case class. Buena legibilidad del código.

    case class Student(rollNo:Int, firstName:String, lastName:String)

    val student1 = Student(1,"xyz","abc")
    // val student1: Student = Student(1,xyz,abc)