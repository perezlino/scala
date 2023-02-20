/*  ======================================================
    =============== EJECUTAR SCRIPTS SCALA ===============
    ======================================================

    - También puedes ejecutar scripts Scala (o cargarlos en el repl)

    - Crea un archivo con código Scala, por ejemplo script.sc o script.scala con el siguiente codigo:
     __________________________________________________________________________________
    |    var x = 0                                                                     | 
    |                                                                                  | 
    |    do {                                                                          | 
    |    println(s"El cuadrado de $x es ${x * x}")                                     | 
    |    x += 1                                                                        |     
    |    } while (x < 10)                                                              |         
    |__________________________________________________________________________________|

    - Para revisar el archivo, utiliza more script.scala

    - Para ejecutarlo como un script, usa scala script.scala

    - Para cargarlo, inicia la consola scala o sbt, luego :load squares.sc. nota que usamos .sc ya que de otra 
      manera sbt tratará de compilarlo (lo cual no funcionará por razones que veremos más adelante)

    - Ctrl-C interrumpirá la ejecución de un script si las cosas van mal
     __________________________________________________________________________________
    |                                                                                  | 
    |    PS C:\github\scala> more script.scala                                         | 
    |    var x = 0                                                                     | 
    |                                                                                  | 
    |    do {                                                                          | 
    |    println(s"El cuadrado de $x es ${x * x}")                                     | 
    |    x += 1                                                                        | 
    |    } while (x < 10)                                                              |     
    |                                                                                  | 
    |    PS C:\github\scala> scala script.scala                                        |     
    |    El cuadrado de 0 es 0                                                         | 
    |    El cuadrado de 1 es 1                                                         |  
    |    El cuadrado de 2 es 4                                                         |     
    |    El cuadrado de 3 es 9                                                         | 
    |    El cuadrado de 4 es 16                                                        |  
    |    El cuadrado de 5 es 25                                                        | 
    |    El cuadrado de 6 es 36                                                        | 
    |    El cuadrado de 7 es 49                                                        | 
    |    El cuadrado de 8 es 64                                                        | 
    |    El cuadrado de 9 es 81                                                        | 
    |    PS C:\github\scala>                                                           |     
    |__________________________________________________________________________________|

*/