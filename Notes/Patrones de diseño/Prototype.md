# Prototype

El patrón Prototype es un patrón de diseño creacional que permite crear nuevos objetos copiando una instancia existente, conocida como prototipo. Este patrón es útil 
cuando la creación de un nuevo objeto desde cero puede ser costosa en términos de rendimiento, y se puede lograr más eficiencia clonando una instancia ya configurada.

El Prototype es especialmente útil cuando los objetos a crear son complejos o costosos de inicializar, y quieres generar múltiples instancias similares, pero con ligeras 
variaciones.

## Concepto

El patrón Prototype se basa en la idea de que, en lugar de crear objetos desde cero utilizando un constructor, puedes duplicar o clonar objetos ya existentes. Esto implica 
que los objetos a clonar deben proporcionar un método para copiarse a sí mismos.

El prototipo no solo permite la clonación superficial, sino que también se puede implementar clonación profunda, en donde no solo se duplican las referencias, sino que 
también se crean copias independientes de los objetos referenciados.


### Java 

¿Que es el patron de copia de constructor? 

- Es un patron especifico usado para crear una copia de un objeto.
- Un constructor que toma como argumento una instancia de la misma clase.
- Copia las propiedades una a una, eligiendo cuales queremos.