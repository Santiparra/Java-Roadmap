# DRY

DRY significa "Don't Repeat Yourself" (No te repitas), y es un principio fundamental en la ingeniería de software que busca evitar la duplicación de código. La idea es que cada fragmento de conocimiento (funcionalidad, lógica, datos) debe tener una única representación en el código.

### ¿Por qué es importante DRY?

Cuando repites el mismo código en varios lugares, introduces los siguientes problemas:

  1. Dificultad de mantenimiento: Si necesitas cambiar la funcionalidad o corregir un error, deberás hacerlo en todos los lugares donde esa lógica se repite, lo cual es más costoso en términos de tiempo y propenso a errores.

  2. Inconsistencias: Si accidentalmente olvidas actualizar algún lugar o si haces cambios en una parte del código y no en otra, puedes crear incoherencias en el comportamiento de tu sistema.

  3. Aumento de la complejidad: El código se vuelve más difícil de entender y seguir cuando está disperso y duplicado.
