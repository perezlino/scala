/*  ======================================================
    ==================== FINAL KEYWORD ===================
    ======================================================

    USOS DE LA PALABRA FINAL
    ========================

    - En VARIABLES: La palabra 'final' evita cambiar el valor que almacena la variable

    - En METODOS: La palabra 'final' evita que se modifique la definicion de un metodo desde una subclase. 
                  Cuando trabajamos con el concepto de 'Herencia', la palabra 'final' evita que los metodos
                  en la Clase hija modifiquen el comportamiento definido de un metodo en la Clase padre

    - En CLASES: La palabra 'final' evita que se cree una subclase. Cuando trabajamos con el concepto de 
                 'Herencia', la palabra 'final' evita que creemos Clases hijas de la Clase que hemos
                 marcado como 'final'.

*/

//  EJEMPLO 1
//  =========

//  NO permitira sobreescribir (modificar) un metodo 'final' de la Clase padre desde la Clase hija. 
//  NOS DEVUELVE ERROR.

    class Authority {
        final def theWord: String =
        "Esta es la última palabra!"
    }

    class Argumentative extends Authority {
        override def theWord: String =
        "No, no lo es!"
    }
    // Error: overriding method theWord in class Authority of type => String;
    // method theWord cannot override final member
    // override def theWord: String =
    //


//  EJEMPLO 2
//  =========

// No permitira extender una Clase 'final'

    final class Infinity

    class Beyond extends Infinity

    // Error: illegal inheritance from final class Infinity
    // class Beyond extends Infinity