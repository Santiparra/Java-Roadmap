# Builder

El patrón Builder es un patrón de diseño creacional que se utiliza para construir objetos complejos paso a paso. A diferencia de otros patrones creacionales, como Factory Method o Abstract Factory, el Builder se enfoca en la creación de objetos que pueden tener muchas configuraciones o propiedades opcionales.

El patrón Builder separa la construcción de un objeto de su representación final, lo que te permite crear distintos tipos de representaciones utilizando el mismo proceso de construcción. Es especialmente útil cuando un objeto tiene una gran cantidad de parámetros o requiere una configuración específica que haría que el constructor tradicional fuera difícil de manejar (constructor telescópico).
Concepto

La idea principal detrás del patrón Builder es:

  1. Descomponer la construcción de un objeto complejo en pasos individuales. Cada paso construye una parte del objeto y, al final, el objeto se construye por completo.
  2. Ofrecer una interfaz fluida (fluent interface) que permite configurar un objeto de manera progresiva y flexible, facilitando la lectura del código.
  3. Mantener el código cliente separado de los detalles de la construcción, proporcionando un código más limpio y mantenible.
  