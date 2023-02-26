/*  ======================================================
    =============== TYPED PATTERN MATCHES ================
    ======================================================
*/

    case class Address(street: String, city: String, postCode: Option[String])
    case class Person(name: String, phone: Option[String], address: Option[Address])

    val harry = Person("Harry", None, Some(Address("123 Little Whinging way", "Purley", Some("PN22 6RT"))))

    def describeType(x: Any) = x match {
        case i: Int if i > 0 => s"Int ${i * i}"
        case d: Double => s"Double $d"
        case s: String => s"String ${s.reverse}"
        case p: Person => s"Person, name = ${p.name}"
        case _ => "Some other type"
    }

    describeType(3)         // val res0: String = Int 9
    describeType(3.4)       // val res1: String = Double 3.4
    describeType("Hello")   // val res2: String = String olleH
    describeType(harry)     // val res3: String = Person, name = Harry
    describeType(true)      // val res4: String = Some other type