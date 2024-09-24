# Concurrencia

La concurrencia se refiere a la capacidad de un sistema para ejecutar múltiples tareas al mismo tiempo, lo que permite que las operaciones se realicen de manera simultánea o de manera intercalada, mejorando la eficiencia y el rendimiento del software. En la programación, esto se traduce en la capacidad de un programa para manejar múltiples tareas (hilos) al mismo tiempo, lo que es especialmente útil en sistemas que requieren una alta disponibilidad o un procesamiento intensivo.

### Conceptos Clave de Concurrencia

  - Hilos (Threads): Un hilo es la unidad más pequeña de ejecución que puede ser programada por el sistema operativo. Los hilos permiten que un programa realice múltiples 
  tareas al mismo tiempo. En Java, cada hilo es una instancia de la clase Thread o puede ser creado implementando la interfaz Runnable.

  - Sincronización: Es el mecanismo que se utiliza para controlar el acceso a recursos compartidos. La sincronización es necesaria para evitar condiciones de carrera (race 
  conditions) donde dos o más hilos intentan acceder y modificar el mismo recurso al mismo tiempo. Java proporciona palabras clave como synchronized y clases como 
  ReentrantLock para manejar la sincronización.

  - Condiciones de Carrera: Ocurren cuando dos o más hilos acceden a un recurso compartido y al menos uno de ellos lo modifica. Esto puede dar lugar a comportamientos 
  inesperados y errores en el programa.

  - Deadlock (Interbloqueo): Es una situación en la que dos o más hilos quedan bloqueados eternamente esperando entre sí. Esto ocurre cuando cada hilo sostiene un recurso 
  que el otro hilo necesita para continuar.

  - Executor Framework: En Java, el framework java.util.concurrent proporciona una manera más eficiente y flexible de gestionar la ejecución de tareas concurrentes a 
  través de un conjunto de interfaces y clases, como Executor, ExecutorService, y ScheduledExecutorService.
  