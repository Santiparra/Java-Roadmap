# Observer

El patrón Observer es un patrón de diseño de comportamiento que permite definir una relación de dependencia uno-a-muchos entre objetos, de modo que cuando un objeto cambia 
su estado, todos sus dependientes son notificados y actualizados automáticamente. Este patrón es útil para implementar sistemas donde se necesita que un cambio en un 
objeto desencadene actualizaciones en otros objetos sin que estos estén acoplados directamente.
Concepto

La idea principal detrás del patrón Observer es:

  - Definir un sujeto (o tema) que mantiene una lista de observadores (o suscriptores).
  - Permitir que los observadores se suscriban y se desuscriban de las notificaciones del sujeto.
  - Cuando el sujeto cambia su estado, notifica a todos los observadores para que realicen las actualizaciones necesarias.