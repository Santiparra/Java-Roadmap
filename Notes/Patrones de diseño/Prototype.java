public class Prototype {
  // Prototype Interface
interface Vehicle extends Cloneable {
  Vehicle clone();
}

// ConcretePrototype
class Car implements Vehicle {
  private String make;
  private String model;
  private String color;

  public Car(String make, String model, String color) {
      this.make = make;
      this.model = model;
      this.color = color;
  }

  // Getter y Setter para demostración
  public String getMake() {
      return make;
  }

  public void setMake(String make) {
      this.make = make;
  }

  public String getModel() {
      return model;
  }

  public void setModel(String model) {
      this.model = model;
  }

  public String getColor() {
      return color;
  }

  public void setColor(String color) {
      this.color = color;
  }

  @Override
  public Vehicle clone() {
      try {
          // Clonación superficial (shallow copy)
          return (Car) super.clone();
      } catch (CloneNotSupportedException e) {
          e.printStackTrace();
          return null;
      }
  }

  @Override
  public String toString() {
      return "Car [make=" + make + ", model=" + model + ", color=" + color + "]";
  }
}

// Client
public class Client {
  public static void main(String[] args) {
      // Crear un coche original
      Car originalCar = new Car("Toyota", "Corolla", "Azul");
      System.out.println("Coche original: " + originalCar);

      // Clonar el coche original
      Car clonedCar = (Car) originalCar.clone();
      System.out.println("Coche clonado: " + clonedCar);

      // Modificar el coche clonado
      clonedCar.setColor("Rojo");
      System.out.println("Coche clonado modificado: " + clonedCar);
      
      // El coche original permanece intacto
      System.out.println("Coche original tras la clonación: " + originalCar);
  }
}

}
