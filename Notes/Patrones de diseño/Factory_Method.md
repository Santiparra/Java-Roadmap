# Factory Method

El Factory Method es un patrón de diseño creacional que se utiliza para delegar la responsabilidad de crear objetos a las subclases, en lugar de hacerlo directamente en la clase principal. La idea clave es proporcionar una forma de crear objetos que permita a las subclases modificar el tipo de objetos que se crean sin alterar el código que usa esos objetos.

El patrón Factory Method sugiere que, en lugar de llamar al operador new para construir objetos directamente, se invoque a un método fábrica especial. No te preocupes: los objetos se siguen creando a través del operador new, pero se invocan desde el método fábrica. Los objetos devueltos por el método fábrica a menudo se denominan productos.

