# Abstract Factory

El patrón Abstract Factory proporciona una interfaz para crear una familia de objetos relacionados o dependientes sin especificar sus clases concretas. En lugar de definir 
métodos individuales para crear objetos, se define una "fábrica abstracta" con métodos que devuelven objetos de tipos abstractos o interfaces, y las fábricas concretas se 
encargan de la implementación de esos métodos.

1. Lo primero que sugiere el patrón Abstract Factory es que declaremos de forma explícita interfaces para cada producto diferente de la familia de productos (por ejemplo, 
silla, sofá o mesilla). Después podemos hacer que todas las variantes de los productos sigan esas interfaces. Por ejemplo, todas las variantes de silla pueden implementar 
la interfaz Silla, así como todas las variantes de mesilla pueden implementar la interfaz Mesilla, y así sucesivamente.

2. El siguiente paso consiste en declarar la Fábrica abstracta: una interfaz con una lista de métodos de creación para todos los productos que son parte de la familia de 
productos (por ejemplo, crearSilla, crearSofá y crearMesilla). Estos métodos deben devolver productos abstractos representados por las interfaces que extrajimos 
previamente: Silla, Sofá, Mesilla, etc.

3. Ahora bien, ¿qué hay de las variantes de los productos? Para cada variante de una familia de productos, creamos una clase de fábrica independiente basada en la interfaz 
FábricaAbstracta. Una fábrica es una clase que devuelve productos de un tipo particular. Por ejemplo, la FábricadeMueblesModernos sólo puede crear objetos de SillaModerna, 
SofáModerno y MesillaModerna.
El código cliente tiene que funcionar con fábricas y productos a través de sus respectivas interfaces abstractas. Esto nos permite cambiar el tipo de fábrica que pasamos 
al código cliente, así como la variante del producto que recibe el código cliente, sin descomponer el propio código cliente.

### Estructura del Abstract Factory

  - AbstractFactory (Fábrica Abstracta): Define los métodos para crear cada uno de los productos abstractos de la familia.

  - ConcreteFactory (Fábrica Concreta): Implementa los métodos definidos en la AbstractFactory para crear productos concretos.

  - AbstractProduct (Producto Abstracto): Define la interfaz o clase abstracta de los productos que serán creados.

  - ConcreteProduct (Producto Concreto): Implementa la interfaz del producto abstracto con una implementación concreta.

  - Client (Cliente): Utiliza los objetos creados por la fábrica concreta, pero interactúa con ellos a través de las interfaces abstractas de los productos.