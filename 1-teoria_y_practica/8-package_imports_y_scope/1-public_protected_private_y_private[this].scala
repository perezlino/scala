/*  ======================================================
    ===== PUBLIC, PROTECTED, PRIVATE Y PRIVATE THIS ======
    ======================================================
*/

//  Scala tiene tres ámbitos de visibilidad, 'private', 'protected' y 'public'.

//  No hay palabra clave 'public': las clases, traits, objetos, vals y defs no marcados como 'private' o 'protected' 
//  son 'public' por defecto.

//  'private' significa sólo disponible para la clase actual, objeto companion, o clases internas/objetos en la 
//  clase actual.

//  'protected' significa acceso privado más disponibilidad para cualquier subclase de la clase actual.

//  'public' significa que cualquiera puede ver y acceder al elemento. Este es el valor por defecto cuando no se 
//  especifica otra visibilidad.

//  El paquete protegido por defecto de Java no es el predeterminado en Scala, y el acceso al paquete se maneja 
//  a través de un mecanismo ortogonal.

//  Scala también tiene una visibilidad 'private[this]' que significa privada sólo para esta instancia específica, 
//  companions, clases anidadas e incluso otras instancias de la misma clase no pueden acceder a un 'private[this]'.

//  'private[this]' es la visibilidad por defecto para los parámetros del constructor que no son campos paramétricos 
//  (es decir, no están en una clase case o marcados con un val).