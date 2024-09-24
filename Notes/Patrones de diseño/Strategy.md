# Strategy

El patrón Strategy es un patrón de diseño de comportamiento que permite definir una familia de algoritmos, encapsular cada uno de ellos y hacerlos intercambiables. Este 
patrón permite que el algoritmo varíe independientemente de los clientes que lo utilicen. Es especialmente útil cuando se necesita seleccionar un algoritmo en tiempo de 
ejecución o cuando hay múltiples implementaciones de una operación.
Concepto

La idea principal detrás del patrón Strategy es:

  - Definir una interfaz común para un grupo de algoritmos.
  - Encapsular cada algoritmo en una clase separada que implemente esa interfaz.
  - Permitir que el contexto (o cliente) use diferentes estrategias de forma intercambiable.

Este enfoque ayuda a evitar condicionales complejos y promueve el principio de abierto/cerrado, donde las clases deben estar abiertas para la extensión pero cerradas para 
la modificación.
