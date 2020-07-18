package garden;

public class Plant {
  protected final String name;
  protected int waterLevel;

  public Plant(String name) {
    this.name = name;
  }

  public boolean needsWater() {
    if (waterLevel < 5) {
      return true;
    } else {
      return false;
    }
  }

  public void waterPlants (int waterAmount) {
    waterLevel += waterAmount;
  }

  public void getPlantStatus() {
    if (needsWater()) {
      System.out.println("The " + name + " needs water!");
    } else {
      System.out.println("The " + name + " does not need water!");
    }
  }
}
