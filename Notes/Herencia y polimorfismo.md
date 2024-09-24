# Herencia y polimorfismo

1. ¿Que es la sobre escritura de métodos?

- Cuando una subclase cambia el comportamiento de un método heredado.
- Usa la misma firma pero cambia la implementación.
- Funciona en cualquier parte de la cadena hereditaria.
- Se resuelve en tiempo de ejecución, esto permite el polimorfismo.

2. ¿Cual es la super Clase de todas las clases?

- El la super clase Object implícitamente.
- Es la raíz de la jerarquía hereditaria.
- Nos brinda implementaciones de métodos bastantes útiles.

3. ¿Cual es la diferencia entre == y el método equals()?
 
- == compara directamente los valores por equalidad en primitivos.
- equals compara al valor subyacente al cual referencian 2 objetos, se hereda de Object super clase.

4. ¿Cual es la diferencia entre overload y override?

- Overloading, multiples métodos con el mismo nombre en una clase pero con diferentes argumentos.
- Override, es cuando una clase hija cambia la implementación de un método heredado. 
- Métodos Overriden pueden ser overloaded.

5. ¿Se pueden sobrescribir los métodos estáticos en Java?

- No

