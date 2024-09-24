public class Builder {
  // Product
class House {
  private String foundation;
  private String structure;
  private String roof;
  private boolean hasGarage;
  private boolean hasSwimmingPool;

  // Métodos setters
  public void setFoundation(String foundation) {
      this.foundation = foundation;
  }

  public void setStructure(String structure) {
      this.structure = structure;
  }

  public void setRoof(String roof) {
      this.roof = roof;
  }

  public void setGarage(boolean hasGarage) {
      this.hasGarage = hasGarage;
  }

  public void setSwimmingPool(boolean hasSwimmingPool) {
      this.hasSwimmingPool = hasSwimmingPool;
  }

  @Override
  public String toString() {
      return "House [foundation=" + foundation + ", structure=" + structure +
              ", roof=" + roof + ", hasGarage=" + hasGarage + ", hasSwimmingPool=" + hasSwimmingPool + "]";
  }
}

// Builder
interface HouseBuilder {
  void buildFoundation();
  void buildStructure();
  void buildRoof();
  void buildGarage();
  void buildSwimmingPool();
  House getHouse();
}

// ConcreteBuilder
class ModernHouseBuilder implements HouseBuilder {
  private House house;

  public ModernHouseBuilder() {
      this.house = new House();
  }

  @Override
  public void buildFoundation() {
      house.setFoundation("Foundation for modern house");
  }

  @Override
  public void buildStructure() {
      house.setStructure("Concrete and steel structure");
  }

  @Override
  public void buildRoof() {
      house.setRoof("Flat roof with solar panels");
  }

  @Override
  public void buildGarage() {
      house.setGarage(true); // La casa moderna tiene garaje.
  }

  @Override
  public void buildSwimmingPool() {
      house.setSwimmingPool(true); // La casa moderna tiene piscina.
  }

  @Override
  public House getHouse() {
      return this.house;
  }
}

// ConcreteBuilder
class TraditionalHouseBuilder implements HouseBuilder {
  private House house;

  public TraditionalHouseBuilder() {
      this.house = new House();
  }

  @Override
  public void buildFoundation() {
      house.setFoundation("Foundation for traditional house");
  }

  @Override
  public void buildStructure() {
      house.setStructure("Wood and brick structure");
  }

  @Override
  public void buildRoof() {
      house.setRoof("Gable roof with shingles");
  }

  @Override
  public void buildGarage() {
      house.setGarage(false); // La casa tradicional no tiene garaje.
  }

  @Override
  public void buildSwimmingPool() {
      house.setSwimmingPool(false); // La casa tradicional no tiene piscina.
  }

  @Override
  public House getHouse() {
      return this.house;
  }
}

// Director
class ConstructionEngineer {
  private HouseBuilder houseBuilder;

  public ConstructionEngineer(HouseBuilder houseBuilder) {
      this.houseBuilder = houseBuilder;
  }

  public House constructHouse() {
      houseBuilder.buildFoundation();
      houseBuilder.buildStructure();
      houseBuilder.buildRoof();
      houseBuilder.buildGarage();
      houseBuilder.buildSwimmingPool();
      return houseBuilder.getHouse();
  }
}

// Client
public class Client {
  public static void main(String[] args) {
      // Crear una casa moderna
      HouseBuilder modernHouseBuilder = new ModernHouseBuilder();
      ConstructionEngineer engineer = new ConstructionEngineer(modernHouseBuilder);
      House modernHouse = engineer.constructHouse();
      System.out.println(modernHouse);

      // Crear una casa tradicional
      HouseBuilder traditionalHouseBuilder = new TraditionalHouseBuilder();
      engineer = new ConstructionEngineer(traditionalHouseBuilder);
      House traditionalHouse = engineer.constructHouse();
      System.out.println(traditionalHouse);
  }
}

}
