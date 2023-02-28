/*  ======================================================
    ============== ABRIR Y LEER UN ARCHIVO ===============
    ======================================================
*/

//  Source no se utiliza a menudo en código de producción, pero es útil para demos y aprender Scala

    import scala.io.Source

    for (line <- Source.fromFile("somefile.txt").getLines()) {
        println(line)
    }