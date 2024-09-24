public class Singleton {
  private static Singleton instance;

  private Singleton() {
      // Constructor privado para evitar instanciación externa
  }

  public static synchronized Singleton getInstance() {
      if (instance == null) {
          instance = new Singleton(); // Creación de la instancia
      }
      return instance;
  }
}
