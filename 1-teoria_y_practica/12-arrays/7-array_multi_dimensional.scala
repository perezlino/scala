/*  ======================================================
    ============= ARRAY MULTI DIMENSIONAL ================
    ======================================================
*/

    package scala

    import Array._

    object test {
        def main(args: Array[String]): Unit = {

            var matrixEg = ofDim[Int](5,5)

            for (fila <- 0 to 4) {
                for (columna <- 0 to 4) {
                    // matrixEg(fila)(columna) = columna + 3
                    if (fila == columna) {
                    matrixEg(fila)(columna) = 1
                    }
                    else
                    {
                    matrixEg(fila)(columna) = 0
                    }
                }
                println(" ")
            }

            for (fila <- 0 to 4) {
                for (columna <- 0 to 4) {
                    print(matrixEg(fila)(columna) )
                }
                println(" ")
            }
/*
            10000
            01000
            00100
            00010
            00001 
*/
        }
    }