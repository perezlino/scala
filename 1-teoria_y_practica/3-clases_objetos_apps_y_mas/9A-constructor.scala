/*  ======================================================
    ==================== CONSTRUCTOR =====================
    ======================================================
*/

//  Al crear un objeto, este por debajo, llama a un constructor. El constructor ejecutará todo lo que hay 
//  dentro de la clase.

    class DemoConParametros(nombre: String) {

        println(s"Construyendo para $nombre")
        // resto de la clase...
    }

//  Los parámetros en la definición de la clase se convierten en los principales parámetros del constructor

//  El código en la clase (no en defs) se convierte en el código del constructor primario, se ejecuta cuando 
//  se construye una nueva instancia

//  No se puede acceder a los parámetros del constructor desde fuera (private)

    val demo = new DemoConParámetros("Jill")
    demo.name
//  Error:(33, 83) el valor name no es un miembro de DemoConParametros