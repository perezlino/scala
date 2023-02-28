/*  ======================================================
    ================== UTILIZAR COLLECT ==================
    ======================================================
*/

//  'collect' es como un filter y un map combinados en uno, toma una PartialFunction y reduce (narrow) 
//  el tipo de lista resultante si es posible.

    trait Fruit
    case class Apple(name: String) extends Fruit
    case class Orange(name: String) extends Fruit

    val fruits = List(Apple("Fiji"), Orange("Jaffa"), Apple("Cox's"))
    // val fruits: List[Product with Fruit with java.io.Serializable] = List(Apple(Fiji), Orange(Jaffa), Apple(Cox's))


    fruits.collect {
        case a: Apple => a
    } 
/*
    val res0: List[Apple] = List(Apple(Fiji), Apple(Cox's))
*/