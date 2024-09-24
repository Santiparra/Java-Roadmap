public class Factory_Method {
  // Product
interface Notification {
  void notifyUser();
}

// ConcreteProduct 1
class EmailNotification implements Notification {
  @Override
  public void notifyUser() {
      System.out.println("Enviando notificación por email...");
  }
}

// ConcreteProduct 2
class SMSNotification implements Notification {
  @Override
  public void notifyUser() {
      System.out.println("Enviando notificación por SMS...");
  }
}

// ConcreteProduct 3
class PushNotification implements Notification {
  @Override
  public void notifyUser() {
      System.out.println("Enviando notificación push...");
  }
}

// Creator (clase base)
abstract class NotificationFactory {
  public abstract Notification createNotification();
  
  public void sendNotification() {
      Notification notification = createNotification();
      notification.notifyUser();
  }
}

// ConcreteCreator 1
class EmailNotificationFactory extends NotificationFactory {
  @Override
  public Notification createNotification() {
      return new EmailNotification();
  }
}

// ConcreteCreator 2
class SMSNotificationFactory extends NotificationFactory {
  @Override
  public Notification createNotification() {
      return new SMSNotification();
  }
}

// ConcreteCreator 3
class PushNotificationFactory extends NotificationFactory {
  @Override
  public Notification createNotification() {
      return new PushNotification();
  }
}

public class Main {
  public static void main(String[] args) {
      NotificationFactory factory = new EmailNotificationFactory();
      factory.sendNotification(); // "Enviando notificación por email..."

      factory = new SMSNotificationFactory();
      factory.sendNotification(); // "Enviando notificación por SMS..."

      factory = new PushNotificationFactory();
      factory.sendNotification(); // "Enviando notificación push..."
  }
}

}
