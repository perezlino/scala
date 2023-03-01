/*  ======================================================
    ===================== WHILE LOOP =====================
    ======================================================
*/

//  Una declaración (devuelve Unit)

    def greet(n: Int): Unit = {
    var i = 0
    while (i < n) {
        i += 1
        println("Hola")
    }
    }

    greet(5)
/*
    Hola
    Hola
    Hola
    Hola
    Hola
*/

//  Puede evitar el while (y el var):

    @tailrec // tail recursion
    def greet(n: Int, curr: Int = 0): Unit = {
        if (curr < n) {
            println("Hola")
            greet(n, curr + 1) // Se utiliza Recursion --> Se llama al metodo greet()
        }
/*
    def greet(5, 0): Unit = {
        if (0 < 5) {
            println("Hola")
            greet(5, 1)  <-------------- Se vuelve a ejecutar el metodo greet() esta vez con 
                                         el parametro 'curr' aumentado en 1
        }
    }
*/
    }

    greet(5)
/*
    Hola
    Hola
    Hola
    Hola
    Hola
*/    

//  También existe un bucle do..while donde el cuerpo siempre es llamado al menos una vez