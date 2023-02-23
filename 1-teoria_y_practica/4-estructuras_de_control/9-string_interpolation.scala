/*  ======================================================
    =============== STRING INTERPOLATION =================
    ======================================================
*/

//  La interpolación f sigue la notación 'printf'

//  'raw' no escapa literales en la cadena

    val x = 10                      // val x: Int = 10

    val y = 2.12                    // val y: Double = 2.12

    val name = "Fred"               // val name: String = Fred

    s"$name $x $y"                  // val res0: String = Fred 10 2.12

    s"$name is ${x * y}"            // val res1: String = Fred is 21.200000000000003

    f"$name is ${x * y}%08.4f"      // val res2: String = Fred is 021,2000

    //s"$names"
    s"${name}s"                     // val res3: String = Freds

    "\t\n"                          // val res4: String = " "
    raw"\t\n"                       // val res5: String = \t\n

    """\t\n"""                      // val res6: String = \t\n