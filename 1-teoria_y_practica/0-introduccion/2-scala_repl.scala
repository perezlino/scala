/*  ======================================================
    ===================== SCALA REPL =====================
    ======================================================

    - Si ya hemos descargado Scala, podemos iniciarlo escribiendo "scala" en la línea de comandos:
     __________________________________________________________________________________
    |                                                                                  | 
    |   PS C:\github\scala> scala                                                      | 
    |   Welcome to Scala 2.12.15 (Java HotSpot(TM) 64-Bit Server VM, Java 18.0.1.1).   |    
    |   Type in expressions for evaluation. Or try :help.                              | 
    |                                                                                  |         
    |   scala>                                                                         | 
    |__________________________________________________________________________________|

    - Para salir, se utiliza Ctrl + D o :quit

    - REPL: Read, Evaluate, Print, Loop

    - Podemos escribir :help ----------> Y nos devuelve una lista de comandos de ayuda
     ___________________________________________________________________________________________________
    |                                                                                                   |     
    |   scala> :help                                                                                    | 
    |   All commands can be abbreviated, e.g., :he instead of :help.                                    | 
    |   :completions <string>    output completions for the given string                                | 
    |   :edit <id>|<line>        edit history                                                           | 
    |   :help [command]          print this summary or command-specific help                            | 
    |   :history [num]           show the history (optional num is commands to show)                    | 
    |   :h? <string>             search the history                                                     |     
    |   :imports [name name ...] show import history, identifying sources of names                      |  
    |   :implicits [-v]          show the implicits in scope                                            | 
    |   :javap <path|class>      disassemble a file or class name                                       | 
    |   :line <id>|<line>        place line(s) at the end of history                                    | 
    |   :load <path>             interpret lines in a file                                              | 
    |   :paste [-raw] [path]     enter paste mode or paste a file                                       | 
    |   :power                   enable power user mode                                                 | 
    |   :quit                    exit the interpreter                                                   | 
    |   :replay [options]        reset the repl and replay all previous commands                        | 
    |   :require <path>          add a jar to the classpath                                             |         
    |   :reset [options]         reset the repl to its initial state, forgetting all session entries    |
    |   :save <path>             save replayable session to a file                                      |    
    |   :sh <command line>       run a shell command (result is implicitly => List[String])             |
    |   :settings <options>      update compiler options, if possible; see reset                        |
    |   :silent                  disable/enable automatic printing of results                           |
    |   :type [-v] <expr>        display the type of an expression without evaluating it                |    
    |   :kind [-v] <type>        display the kind of a type. see also :help kind                        |    
    |   :warnings                show the suppressed warnings from the most recent line which had any   |       
    |                                                                                                   |   
    |   scala>                                                                                          |    
    |___________________________________________________________________________________________________|


    - El REPL intenta evaluar cualquier cosa que escribas. El compilador infiere el tipo.
     ___________________________________________________________________________________________________
    |                                                                                                   |
    |   scala> 1                                                                                        |
    |   res0: Int = 1                                                                                   |
    |                                                                                                   |
    |   scala> 2                                                                                        |        
    |   res1: Int = 2                                                                                   |
    |                                                                                                   |
    |   scala> res0 + res1                                                                              |
    |   res2: Int = 3                                                                                   |    
    |                                                                                                   |
    |   scala> 4 + 5                                                                                    |    
    |   res3: Int = 9                                                                                   |    
    |                                                                                                   |
    |   scala> 6 + res3                                                                                 |
    |   res4: Int = 15                                                                                  |
    |                                                                                                   |    
    |   scala> 7 + 8.5                                                                                  |
    |   res5: Double = 15.5                                                                             |
    |                                                                                                   |
    |   scala>                                                                                          |
    |___________________________________________________________________________________________________|


    - Intenta evaluar cada línea a medida que la escribe
     ___________________________________________________________________________________________________
    |                                                                                                   |
    |   scala> val x = 1 + 2                                                                            |
    |   x: Int = 3                                                                                      |
    |                                                                                                   |
    |   scala>                                                                                          |
    |___________________________________________________________________________________________________|


    - Si no puede evaluar la línea actual, te da una continuación
     ___________________________________________________________________________________________________
    |                                                                                                   |
    |   scala> val x =                                                                                  |
    |       | 1 + 2                                                                                     |
    |   x: Int = 3                                                                                      |
    |                                                                                                   |
    |   scala>                                                                                          |
    |___________________________________________________________________________________________________|    


    - Si te quedas atascado en las líneas de continuación, pulsa ENTER dos veces seguidas
     ___________________________________________________________________________________________________
    |                                                                                                   |
    |   scala> val x =                                                                                  |        
    |       |                                                                                           |
    |       |                                                                                           |    
    |   You typed two blank lines.  Starting a new command.                                             |    
    |                                                                                                   |
    |   scala>                                                                                          |
    |___________________________________________________________________________________________________|     


*/