/*  ======================================================
    ================= JERARQUIA DE TIPOS =================
    ======================================================


                            _________________
                           |                 |
                           |       Any       |
                           |_________________|
                                    ᐱ
                                    |
                    ________________|______________________________
                   |                                               |
            _______|_______                                 _______|_______
           |               |                               |               |
           |    AnyVal     |                               |    AnyRef     |
           |_______________|                               |_______________|
                   ᐱ                                               ᐱ 
                   |                         ______________________|_______________________
                   |                        |                      |                       |
            Double    Unit          Scala collections  (Other Scala collections)   All Java classes   
            Float     StringOps             |                      |                       |     
            Long      Char                  |______________________|_______________________|
            Int       Boolean                                      |     
            Short                                                  | 
            Byte                                                 Null    



                            _________________
                           |                 | // Apunta a todo
                           |     Nothing     | // Es el ultimo eslabon del diagrama
                           |_________________| // Completa el sistema de tipos...
                                               // Es el tipo de menor nivel jerarquico