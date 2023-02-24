/*  ======================================================
    ============= OVERRIDING toString METHOD =============
    ======================================================
*/

//  EJEMPLO 1.A
//  ===========

//  Programa Scala sin 'Override toString method'

    package scala

    class Language(LangArticle: Int, LangName: String) {

        // Definiendo el metodo 'getLangArticle'
        def getLangArticle() : Int = {
            return LangArticle;
        }

        // Definiendo el metodo 'getLangName'
        def getLangName() : String = {
            return LangName;
        }

    }

    // Creando el Objeto
    object test {

        // Metodo 'main'
        def main(args: Array[String]) {

            var language = new Language(50, "Scala");
            println(language)
            println(language.getLangArticle())
            println(language.getLangName())
        }
/*
        scala.Language@7f63425a <================== 
        50
        Scala
*/
    }


//  EJEMPLO 1.B
//  ===========

//  La salida es, nombre de la Clase, luego el signo 'at', y al final el hashCode del objeto. Todas las Clases en 
//  Scala heredan de la Clase Object, directa o indirectamente . La Clase Object tiene algunos métodos básicos 
//  como clone(), toString(), equals(), .. etc. El método toString() por defecto en Object imprime "nombre de la 
//  Clase @ código hash". Podemos anular el método toString() en nuestra Clase para imprimir una salida adecuada. 
//  A continuación, se muestra el ejemplo para anular el método toString.

    package scala

    class Language(LangArticle: Int, LangName: String) {

        def getLangArticle() : Int = {
            return LangArticle;
        }

        def getLangName() : String = {
            return LangName;
        }

        // Overriding toString method
        override def toString() : String = {
            return "[Total Articulo : " + LangArticle +
            ", Nombre Lenguaje = " + LangName+"]";
        }
    }

    object test {
        def main(args: Array[String]) {

            var language = new Language(50, "Scala");
            println(language)
        }
/*
        [Total Articulo : 50, Nombre Lenguaje = Scala]
*/
    }