public class Observer {
  import java.util.ArrayList;
import java.util.List;

// Subject Interface
interface TemperatureSubject {
    void registerObserver(TemperatureObserver observer);
    void removeObserver(TemperatureObserver observer);
    void notifyObservers();
}

// ConcreteSubject
class TemperatureSensor implements TemperatureSubject {
    private List<TemperatureObserver> observers = new ArrayList<>();
    private int temperature;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public void registerObserver(TemperatureObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(TemperatureObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (TemperatureObserver observer : observers) {
            observer.update(temperature);
        }
    }
}

// Observer Interface
interface TemperatureObserver {
    void update(int temperature);
}

// ConcreteObserver
class TemperatureDisplay implements TemperatureObserver {
    private String displayName;

    public TemperatureDisplay(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public void update(int temperature) {
        System.out.println(displayName + " actualiza la temperatura: " + temperature + "°C");
    }
}

// Client
public class Client {
    public static void main(String[] args) {
        TemperatureSensor sensor = new TemperatureSensor();
        
        TemperatureDisplay display1 = new TemperatureDisplay("Display 1");
        TemperatureDisplay display2 = new TemperatureDisplay("Display 2");
        
        sensor.registerObserver(display1);
        sensor.registerObserver(display2);
        
        // Cambiar la temperatura
        sensor.setTemperature(25);
        sensor.setTemperature(30);
        
        // Desuscribirse de un observador
        sensor.removeObserver(display1);
        
        // Cambiar la temperatura nuevamente
        sensor.setTemperature(22);
    }
}

}
