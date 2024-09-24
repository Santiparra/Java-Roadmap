# JAVA

1. ¿Qué es Java?

Creado en oposición a el ecosistema de C.
Es un lenguaje orientado a objetos.
Es portable, se escribe una vez y se corre donde sea.
Popular lenguaje de servidores.
Creado por James Gosling en el 92.

2. Características 

Simple, orientado a objetos y familiar.
Robusto y seguro (Gracias al JVM).
Neutral a arquitecturas y portable.
Alto rendimiento.
Interpretado, dinámico (comportamiento) pero con tipado estático y threaded.

3. ¿Que es el JVM?

Java virtual machine.
Es el entorno virtual en el cual se ejecutan los programas de java. 
Se encarga de ejecutar el bytecode compilado y lo ejecuta.
JVM tienen especificaciones estándares sobre como comportarse y como funcionar.
Es importante para hacer que java sea agnóstica a la plataformas y arquitecturas.

4. ¿Que es el JRE?

Java Runtime Environment.
Set de software que en su conjunto nos permiten ejecutar java en nuestras maquinas.
Una especie de orquestrador que gestiona las actividades entre dicho software.

5. ¿Que es el JDK?

Java Development Kit.
Set de herramientas para desarrollar en Java.
Esta incluido en el JRE.
Sigue también especificaciones de el lenguaje Java.
Incluye el compilador.

6. ¿Que es Java byte Code?

Un set de instrucciones para la JVM.
Producto de el proceso de compilación de código de Java.
No se puede ejecutar de manera nativa en la maquina.
Es consistente a traves de diferentes arquitecturas.


7. ¿Diferencias entre path y Classpath?

Son variables del sistema.
Path es una variable especifico del sistema operativo que gestiona que binarios están disponibles para ejecución. Ejemplo: El comando Java.
Classpath indica donde están nuestras clases compiladas y Jars, puede apuntar en multiples direcciones. 


8. ¿Diferencias entre sourcepath y classpath?

Sourcepath es donde residen nuestras clases para ser compiladas. Ejemplo: SRC directorio. 
Classpath es donde van las dependencias: Librerías y Jars, se requieren para la compilación y el entorno de ejecución las usa para cargar el bytecode.