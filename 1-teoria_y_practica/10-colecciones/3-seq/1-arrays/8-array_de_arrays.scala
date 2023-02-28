/*  ======================================================
    =================== ARRAY DE ARRAYS ==================
    ======================================================
*/

    package scala

    object test {
        def main(args: Array[String]): Unit = {
            var marks1 = Array(5,8,9)
            var marks2 = Array(5,9,7)
            var marks3 = Array(5,9,4)

            var marks = Array(marks1, marks2, marks3)

            for (marka <- marks){
                for (markb <- marka){
                    print(markb + " ")
                }
            println()
            }
/*
            5 8 9 
            5 9 7 
            5 9 4 
*/
        }
    }