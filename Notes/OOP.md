# Programación orientada a objetos

1. ¿Cuales son los modificadores de acceso de Java?

- Private: Accesible solo dentro de las clases. 
- Package private(default): accesible dentro del paquete.
- Protected: Cualquier clase dentro del paquete o clase que extiende.
- Public: Accesible a todos.

2. ¿Cuales son los diferentes scopes para las variables?

- Bloques de código desde donde se pueden acceder.
- Scope de clase.
- Scope de métodos.
- Scope de bloque (loop, ifs).

3. ¿Que es el modificador static?
 
- No esta asociado a ninguna instancia.
- Se ejecuta al ejecutar la clase.
- Se usan a nivel Global.

4. ¿Los valores se pasan por valor o por referencia?

- Todo se pasa por valor.
- Primitivos, valor directo.
- Objetos, es por valor pero depende puede ser el valor directo o una referencia al mismo.

5. ¿Cual es el valor de variables instanciadas? 

- En variables locales no hay default, el compilador se queja.
- En objetos x ej no tienen que ser inicializadas.
- Cada tipo tiene su valor default de tipo cero. 
- En objetos el default es null.

6. ¿Como funciona el constructor? 

- Es un método que inicializa los valores en un objeto.
- Cuando se instancia un objeto primero se llama al constructor para preparar la instancia.
- No tiene return, se lo nombra por convención igual que la clase.
- Se lo invoca con el operador New al disparar la creación de un nuevo objeto.
- Existen por default, si no se le pasan props no pasa nada.

7. ¿Como funciona una sobrecarga de constructor?

- Se pueden aplicar multiples constructores.
- Al invocar New se busca el constructor acorde a los argumentos.
- Al crear un constructor con args si queremos instanciar sin props necesitamos un constructor sin args.

8. ¿Que es el patron de copia de constructor? 

- Es un patron especifico usado para crear una copia de un objeto.
- Un constructor que toma como argumento una instancia de la misma clase.
- Copia las propiedades una a una, eligiendo cuales queremos.

9. ¿Que es this y para que se usa?

- Es una referencia al objeto sobre el cual el método esta siendo ejecutado.
- Solo se puede usar en métodos instanciados, nunca en métodos static.
- Para mapear propiedades por ejemplo y diferenciarlos de argumentos.
- Se puede usar para encadenar constructores.

10. ¿Que es encadenar constructores?

- Cuando llamamos un constructor dentro de otro para delegar parte de la inicializacion.

11. ¿Que son las Wrapper clases? 

- Son clases que corresponden a cada tipo primitivo y los envuelven.
- Se introdujo junto a Collections.

12. ¿Que es autoboxing y unboxing?

- Conversion de primitivos a clases y viceversa.
- Es un mecanismo de asignación automatizado.

13. ¿Que es el patron Singleton y como se aplica en Java?

- Se usa para forzar una única instancia de una clase en ejecución a la vez por entorno.
- Implementación en Java:
    - Se requiere un constructor privado.
    - Se necesita una instancia estática creada manualmente. 
    - Esto se hace mediante un método estático que devuelve la instancia.
- Muy util cuando cada "instancia es cara", ej: conexiones a Dbs, servicios, etc.
- Ciclo de vida controlado.

- Ejemplo: 
  public class Foo {
    private static final Foo instance = new Foo();

    private Foo() {}

    public static Foo getInstance() {
      return instance
    }
  }

14. ¿Que es la palabra Final y cuando se usa?  

- Marca algo como inmutable, en su estado final que no se puede cambiar.
- En variables primitivas las marca como constantes.
- En objetos marca la referencia como constante pero la instancia no es final.
- En una clase se marca como no extendible, no se puede heredar de ella.
- En el caso de de los métodos los marca como no sobre-escribibles, puede ser heredado. 

15. ¿Que es encapsulacion?

- Es el proceso de restringir el acceso a los detalles de implementación en una clase forzando abstracciones.
- Se manifiesta usando el modificador de acceso private.
- Tiene el beneficio de poder refactorizar procesos internos sin romper el resto.

16. ¿Que es abstracción?

- Es un principio de diseño que separa una interfaz de una implementación a modo que el consumidor solo se preocupe por la interfaz.
- Ej: un aparato electrónico con botones (el botón es la interfaz), la implementación es el circuito interno.
- Se manifiesta con interfaces y en ocasiones con clases abstractas (no siempre, la clase abstracta es algo conveniente).
- Puede ser forzada mediante encapsulaciones.

17. ¿Que son las interfaces marcadas?

- Marca o taggea una clase y sus instancias.
- No tienen métodos implementados.
- Ej: una interfaz serializable.
- Similar a GO, si implementa x entonces cumple la interfaz x.
