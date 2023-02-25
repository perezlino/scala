/*  ======================================================
    ================== BOTTOM CLASSES ====================
    ======================================================

    'null' es un concepto familiar en muchos otros lenguajes

    Puede asignarse a cualquier tipo de referencia en esos lenguajes para denotar la ausencia de 
    una referencia.

    "Es como si hubiera un tipo Null que es una subclase de todos los otros tipos, con una única 
    instancia null" -- Parafraseado de la Java Language Spec

    En Scala este es literalmente el caso, 'Null' es un tipo, es una subclase de todo el conjunto de 
    'AnyRefs', y hay una única instancia 'null' de ese tipo.

    También hay un tipo 'Nothing' que es el subtipo de todo en el sistema de tipos de Scala. No hay 
    instancia de 'Nothing', ni puede haberla. Existe únicamente para completar el sistema de tipos.