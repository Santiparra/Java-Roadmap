# Singleton

### ¿Que es el patron Singleton y como se aplica en Java?

- Se usa para forzar una única instancia de una clase en ejecución a la vez por entorno.
- Implementación en Java:
    - Se requiere un constructor privado.
    - Se necesita una instancia estática creada manualmente. 
    - Esto se hace mediante un método estático que devuelve la instancia.
- Muy util cuando cada "instancia es cara" o de recursos compartidos, ej: conexiones a Dbs, servicios, etc.
- Ciclo de vida controlado.

- Ejemplo: 
  public class Foo {
    private static final Foo instance = new Foo();

    private Foo() {}

    public static Foo getInstance() {
      return instance
    }
  }