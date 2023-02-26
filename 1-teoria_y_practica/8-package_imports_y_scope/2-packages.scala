/*  ======================================================
    ====================== PACKAGES ======================
    ======================================================
*/

//  Los paquetes son una forma de organizar clases y objetos en diferentes unidades lógicas de acceso.

//  La forma estándar en que se usan los paquetes en Scala es la misma que en Java, una declaración de 
//  paquete al comienzo de un archivo fuente (y todo en ese archivo fuente está entonces en ese paquete):

    package demo.food.domain.api

    trait Dessert

    case class IceCream(flavor: String) extends Dessert

    case class Jello(color: String) extends Dessert

//  Packages importados por defecto:

 	java.lang._
 	scala._
 	scala.Predef
