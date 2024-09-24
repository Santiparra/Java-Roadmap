public class Abstract_Factory {
  // AbstractProduct 1
interface Button {
  void paint();
}

// AbstractProduct 2
interface TextBox {
  void render();
}

// ConcreteProduct 1 for Windows
class WindowsButton implements Button {
  @Override
  public void paint() {
      System.out.println("Pintando un botón estilo Windows");
  }
}

// ConcreteProduct 2 for Windows
class WindowsTextBox implements TextBox {
  @Override
  public void render() {
      System.out.println("Renderizando un cuadro de texto estilo Windows");
  }
}

// ConcreteProduct 1 for Mac
class MacButton implements Button {
  @Override
  public void paint() {
      System.out.println("Pintando un botón estilo Mac");
  }
}

// ConcreteProduct 2 for Mac
class MacTextBox implements TextBox {
  @Override
  public void render() {
      System.out.println("Renderizando un cuadro de texto estilo Mac");
  }
}

// AbstractFactory
interface GUIFactory {
  Button createButton();
  TextBox createTextBox();
}

// ConcreteFactory for Windows
class WindowsFactory implements GUIFactory {
  @Override
  public Button createButton() {
      return new WindowsButton();
  }

  @Override
  public TextBox createTextBox() {
      return new WindowsTextBox();
  }
}

// ConcreteFactory for Mac
class MacFactory implements GUIFactory {
  @Override
  public Button createButton() {
      return new MacButton();
  }

  @Override
  public TextBox createTextBox() {
      return new MacTextBox();
  }
}

// Client
public class Application {
  private Button button;
  private TextBox textBox;

  public Application(GUIFactory factory) {
      this.button = factory.createButton();
      this.textBox = factory.createTextBox();
  }

  public void paint() {
      button.paint();
      textBox.render();
  }

  public static void main(String[] args) {
      GUIFactory factory;

      // Supongamos que estamos en un sistema Windows
      factory = new WindowsFactory();
      Application app = new Application(factory);
      app.paint();

      // Cambiamos a MacOS
      factory = new MacFactory();
      app = new Application(factory);
      app.paint();
  }
}

}
