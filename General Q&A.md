## Preguntas Técnicas Generales
  
  ### Java:
    
    1. ¿Cuáles son las principales características de Java?
      Java es un lenguaje orientado a objetos, con tipado fuerte, manejo automático de memoria (Garbage Collection), multiplataforma (Java Virtual Machine), y soporte para concurrencia.

    2. Explica la diferencia entre == y equals() en Java.
      == vs equals(): == compara referencias (si dos objetos apuntan a la misma instancia), mientras que equals() compara el contenido de los objetos, dependiendo de la 
      implementación (por defecto, utiliza ==).

    3. ¿Qué son las excepciones checked y unchecked?
      Las excepciones checked son aquellas que deben ser manejadas o declaradas, mientras que las unchecked no están obligadas a ser manejadas y derivan de 
      RuntimeException.

  ### Estructuras de Datos:
    
    1. ¿Qué es una lista enlazada y en qué se diferencia de un array?
      Consiste en nodos que contienen datos y una referencia al siguiente nodo. Se diferencia de un array en que no tiene tamaño fijo y permite inserciones y eliminaciones 
      más eficientes.

    2. ¿Cuándo usarías un HashMap en lugar de un TreeMap?
      HashMap vs TreeMap: HashMap ofrece acceso O(1) promedio, no garantiza orden; TreeMap ofrece O(log n) y mantiene un orden natural de las claves.

  ### Algoritmos:
  
    1. ¿Cómo implementarías un algoritmo de búsqueda o clasificación?
      El algoritmo de búsqueda binaria busca en una lista ordenada dividiendo el espacio de búsqueda a la mitad, O(log n) en complejidad temporal.
  
    2. Explica la complejidad temporal y espacial de un algoritmo de búsqueda binaria.
      La complejidad temporal de la búsqueda binaria es O(log n) y la espacial es O(1).

## Desarrollo Backend y APIs

  ### RESTful APIs:
  
    1. ¿Qué es REST y cuáles son sus principios?
      Es un estilo arquitectónico que usa HTTP y principios como statelessness, representación de recursos, y uso de métodos HTTP (GET, POST, PUT, DELETE).

    2. ¿Cómo manejarías la autenticación y autorización en una API?
      Pueden implementarse mediante OAuth, JWT o API keys, asegurando que solo usuarios autenticados y autorizados accedan a los recursos.

    3. ¿Qué es HATEOAS y cómo se aplica en una API RESTful?
      Es un principio de REST donde las respuestas de la API incluyen enlaces a otras acciones relacionadas, permitiendo a los clientes navegar dinámicamente por la API.

  ### Microservicios:
  
    1. ¿Qué son los microservicios y cuáles son sus ventajas sobre una arquitectura monolítica?
      Los microservicios son un estilo arquitectónico donde las aplicaciones se dividen en servicios pequeños e independientes, cada uno responsable de una funcionalidad 
      específica.

    2. ¿Cómo gestionarías la comunicación entre microservicios?
      Se gestionan a través de API REST, colas de mensajes (como RabbitMQ) o eventos (como Kafka).

## Patrones de Diseño

  ### Singleton, Factory, Builder:
  
    1. ¿Puedes explicar el patrón Singleton y cuándo usarlo?
      Garantiza una única instancia de una clase. Implementación típica incluye un constructor privado y un método estático para obtener la instancia.

    2. ¿Cuál es la diferencia entre el patrón Factory Method y el patrón Abstract Factory?


    3. ¿Cómo implementarías el patrón Builder en un proyecto real?


## Concurrencia y Multithreading

  ### Conceptos de Concurrencia:
  
    1. ¿Qué es la concurrencia y cuál es su importancia en el desarrollo de software?


    2. ¿Cómo se manejan los hilos en Java y qué es synchronized?


    3. Explica el concepto de condiciones de carrera y cómo evitarlo.


## Base de Datos y Persistencia

  ### SQL vs. NoSQL:
  
    1. ¿Cuál es la diferencia entre bases de datos SQL y NoSQL?


    2. ¿Cómo diseñarías una base de datos relacional para una aplicación específica?



  ### ORM:

    1. ¿Qué es un ORM y cuáles son sus beneficios?


    2. ¿Qué herramientas ORM has utilizado y cuál es tu preferida?


