/*  ======================================================
    ===================== CASE CLASS =====================
    ======================================================
*/

//  Cuando se define una clase case se obtienen un montón de cosas, incluyendo pattern matching

    case class Address(street: String, city: String, postCode: Option[String])
    case class Person(name: String, phone: Option[String], address: Option[Address])

//  Factory methods para facilitar la construcción

    val harry = Person("Harry", None, Some(Address("123 Little Whinging way", "Purley", Some("PN22 6RT"))))
    val sally = Person("Sally", Some("321-222-3344"), None)

//  Autoimplementa el metodo 'toString'

    harry   // val res0: Person = Person(Harry,None,Some(Address(123 Little Whinging way,Purley,Some(PN22 6RT))))
    sally   // val res1: Person = Person(Sally,Some(321-222-3344),None)

//  También obtienes... 'equals' y 'hashCode' que funcionan

    sally == harry  // val res2: Boolean = false
    sally == sally  // val res3: Boolean = true
    sally == Person("Sally", Some("321-222-3344"), None)  // val res4: Boolean = true
    sally == Person("Sally", Some("321-234-3344"), None)  // val res5: Boolean = false

    sally.hashCode                                          // val res6: Int = 2049363132
    Person("Sally", Some("321-222-3344"), None).hashCode    // val res7: Int = 2049363132
    harry.hashCode                                          // val res8: Int = 156089945

//  Public parametric fields (Es decir, llamar a los parametros de la Clase de manera directa)

    harry.name                  // val res9: String = Harry
    harry.address.map(_.city)   // val res10: Option[String] = Some(Purley)
    harry.phone                 // val res11: Option[String] = None
    sally.phone                 // val res12: Option[String] = Some(321-222-3344)

// Autoimplementa el metodo 'copy'

    val sally2 = sally.copy(address = harry.address, phone = Some("321-333-2211"))
    // val sally2: Person = Person(Sally,Some(321-333-2211),Some(Address(123 Little Whinging way,Purley,Some(PN22 6RT))))

    val harry2 = harry.copy(phone = sally2.phone)
    // val harry2: Person = Person(Harry,Some(321-333-2211),Some(Address(123 Little Whinging way,Purley,Some(PN22 6RT))))

// Pattern match compuesto

    def postCodeForHarry(person: Person) = person match {
        case Person("Harry", _, Some(Address(street, city, Some(postcode)))) =>
            println("Harry found with postcode")
            println(s"City $city")
            println(s"Street $street")
            postcode
        case _ =>
            println("Match not made")
            ""
    }

    postCodeForHarry(harry)
/*
    Harry found with postcode
    City Purley
    Street 123 Little Whinging way
    val res13: String = PN22 6RT
*/
    postCodeForHarry(harry2)
/*
    Harry found with postcode
    City Purley
    Street 123 Little Whinging way
    val res14: String = PN22 6RT
*/
    postCodeForHarry(sally)
/*
    Match not made
    val res15: String = ""
*/
    postCodeForHarry(sally2)
/*
    Match not made
    val res16: String = ""
*/