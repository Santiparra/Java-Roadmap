# Principios SOLID

Estos principios ayudan a escribir código más limpio, entendible y flexible, que se puede modificar y escalar sin causar problemas en otras partes del sistema.

1. S - Single Responsibility Principle (Principio de Responsabilidad Única): 
Cada clase o módulo debe tener una única razón para cambiar, es decir, debe estar encargada de una sola funcionalidad o responsabilidad. 
Esto facilita el mantenimiento y la comprensión del código, porque sabes exactamente qué parte del sistema se encarga de qué.

2. O - Open/Closed Principle (Principio Abierto/Cerrado): 
El código debe estar abierto para su extensión, pero cerrado para su modificación. 
Esto significa que cuando necesites agregar nuevas funcionalidades, no deberías modificar el código existente, sino extenderlo (por ejemplo, mediante la herencia o composición).

3. L - Liskov Substitution Principle (Principio de Sustitución de Liskov): 
Los objetos de una subclase deben poder reemplazar a los objetos de la clase base sin alterar el comportamiento del programa. 
En otras palabras, una clase hija debe poder sustituir a su clase padre sin que el programa falle. Esto garantiza que las jerarquías de herencia se utilicen correctamente.

4. I - Interface Segregation Principle (Principio de Segregación de Interfaces): 
Las interfaces deben ser específicas y ajustadas a las necesidades de los clientes. Es preferible tener varias interfaces pequeñas y específicas en lugar de una única interfaz grande y general que obligue a las clases a implementar métodos que no necesitan.

5. D - Dependency Inversion Principle (Principio de Inversión de Dependencias): 
Las dependencias en un sistema deben estar orientadas a abstracciones y no a implementaciones concretas. Las clases de alto nivel no deberían depender de clases de bajo nivel, sino de interfaces o abstracciones que puedan ser implementadas por diferentes clases. Esto promueve un acoplamiento bajo y mejora la flexibilidad del código.

