# Gestión de memoria

1. ¿Cuales son las diferentes areas de memora?

Distinción entre Stack y Heap:

Heap: 
  - Espacio para objetos en la memoria.
  - Es Global. Donde viven y se referencian las instancias de nuestros objetos, métodos, etc...
  - Es el mas grande.

Stack:
  - Contiene Data a nivel del thread.
  - Variables locales y referencias a objetos (apuntan al heap).
  - Llama a los frames para cada ejecución de los métodos.

Area de Código (Meta):
  - Gestiona Bytecode y información sobre el jit (just in time compilation).

Area Nativa:
  - Registros.
  - Stacks de implementación en C.

2. ¿Cual es la diferencia entre permgen y metaspace?
 
- Permgen esta deprecado (v8) para usar ahora metaspace.
- Ambos son areas de memoria en el JVM.
- PermGen tenia un máximo configurable.
- Metaspace se expande hasta quedarse sin memoria aunque se puede asignar un máximo.
- Metaspace Activa el recolector de basura del JVM (limpia clases, bytecode no usado).
- Metaspace es dinámico y por eso se dice que Java es dinámico en comportamiento.

3. ¿Que es recolección de basura?

- El proceso de quitar objetos huérfanos en el heap.
- Es automático PERO tiene una API para dispararlo programaticamente (no recomendado).
- Tiene un enfoque basado en generaciones.

4. ¿Que es la compilación JIT?

- Just in time compilation.
- La JVM selectivamente convierte instrucciones en bytecode a código nativo cuando la JVM percibe que va a tener impacto en el rendimiento.
- Convierte a instrucciones para la arquitectura del cpu nativo.
- Infiere sobre uso, rendimiento y características, todo en tiempo de ejecución.

5. ¿Como y porque configurar el heap?

- Se configura mediante flags(-Xms y -Xmx).
- Sobre todo en bases de códigos muy grandes.
- XMS: designación de memoria inicial (bloque).
- XMX: designación maxima de memoria.
- Cuando se llega al máximo: se dispara el recolector de basura, se lanzan errores de "sin memoria". 

6. ¿Como y porque configurar el stack?

- Se configura con el flag -Xss.
- El tamaño crece de manera dinámica y flexible, con el flag solo fijamos el tamaño inicial.
- Cuando se queda sin memoria: Stack overflow.
- No es muy importante pero puede ser un indicador de invocación circular.

7. ¿Que es un classloader?

- Es parte del JRE.
- Se encarga de cargar las clases en el runtime.
- Flujo: JVM solicita una clase > class loader lo ubica y lo carga.

8. ¿Que tipos de classloaders existen?

- A nivel de aplicación / sistema: clases en el path class.
- A nivel del JDK, carga las clases core del JDK.
- Boostrap class loader. Carga las clases propias de Java y las otras classloaders.
- Classloader personalizadas.