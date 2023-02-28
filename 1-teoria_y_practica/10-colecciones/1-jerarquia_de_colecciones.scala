/*  ======================================================
    ============== JERARQUIA DE COLECCIONES ==============
    ======================================================

                                                 __________________
                                                |                  |  
                                                |     Iterable     | <------ Acceder a un elemento uno por uno
                                                |__________________|

                             __________________     __________________     __________________   
                            |                  |   |                  |   |                  |   
                            |       Seq        |   |       Set        |   |        Map       | <--- Par Key-Value  
                            |__________________|   |__________________|   |__________________|                               
                  'Seq': Elementos ordenados    'Set': Elementos unicos / Sin duplicados    
                     ______________   _____________     ____________          ____________  
                    |              | |             |   |            |        |            |  
                    |  IndexedSeq  | |  LinearSeq  |   |  SortedSet |        |  SortedMap |
                    |______________| |_____________|   |____________|        |____________| 


    LinearSeq vs IndexedSeq
    -----------------------

    'Seq' se divide a su vez en dos grandes categorías: LinearSeq e IndexedSeq

    'LinearSeq' está optimizado para el acceso lineal hacia delante, head-first.
        - La implementación por defecto en Scala es 'List'

    'IndexedSeq' está optimizado para el acceso aleatorio
        - La implementación por defecto en Scala es 'Vector'

    Tanto 'List' como 'Vector' son inmutables. Estos dos forman la más común elección
        - Si sabes que puedes trabajar exclusivamente en el head (p.ej. recursión) usa Lista
        - Para cualquier otra cosa, normalmente se utiliza 'Vector'

    Por puro rendimiento, especialmente con primitivas, a veces se utiliza 'Array'
        - Pero recuerda, 'Array' es mutable y no tiene thread safety.
        - Realice un análisis y pruebe un problema de rendimiento antes de utilizar 'Array'.    
*/