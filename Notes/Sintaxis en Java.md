1. ¿Que es public static void main?

- Son modificadores de acceso que aplican al método main.
- El orden de los modificadores de acceso no importa, solo deben ir antes del método.
- Es el punto de inicio de la aplicación.
- Public: el método es accesible fuera de la clase que lo invoca.
- Static: método o prop a nivel de clase, no se necesita instancia.
- Void: el método no retorna nada.
- Main: Nombre por convención para iniciar el punto inicial de ejecución del programa.

2. ¿Se puede ejecutar código antes que main?

- Sí, se puede usando otros métodos estáticos (static).
- Static se ejecuta cuando se carga la clase.

3. ¿Diferencias entre Break y Continue? 

- Ambos se usan en el flujo del loop.
- Break rompe el loop, sin importar la iteración. EJ: buscar en un array. Se puede usar en switchs.
- Continue salta a la siguiente iteración. EJ: procesar un array pero saltarse un elemento.

4. ¿Diferencias entre float y Double?

- Ambos son primitivos, números decimales pero con diferente precision y uso de memoria.
- Float usa 32 bit y double usa 64 bit.
- Double es mas preciso y por eso es default.
- Se pueden convertir uno a otro con ganancias o perdidas de precision.

5. ¿Porque usar break en switches?

- Encontramos el caso que necesitamos y no necesitamos que el resto de casos se ejecuten.
- Separar bloques de ejecución.

6. ¿Cuales son los tipos primitivos en Java?

- byte - 8 bit numero firmado + o -
- char - 16 bit unicode
- short - 16 bit numero firmado + o -
- int - 32 bit numero firmado + o -
- long - 64 bit numero no necesariamente firmado

- float - 32 bit numero decimal
- double - 34 bit numero decimal

- boolean: tamaño indefinido(1 bit)


7. Comportamiento default de variables locales

- Las variables locales no tienen valores default.
- Se requiere inicializar.
- No es automático.

8. ¿Se puede castear de double a byte? Mas a menos.

- Sí se pueden castear números a tipos con menor precision.
- Se requiere casteo explicito.
- Tiene chances de perdidas de data (lossy conversion). 

9. ¿Se puede castear de byte a double? Menos a mas.

- Sí se puede, pero no es necesario, se castea automáticamente.
- Se le llama casteo implícito, al asignar la nueva variable se cambia automático.
- No se pierde data (lossless conversion).

10. ¿Como salir de una loop nesteada?

- Ponemos una label el el itinerante superior.
- usamos un Break con labels.
- EJ:
search:
  for i........
    for j .......
      break search;