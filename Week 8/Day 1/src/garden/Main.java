package garden;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    Garden garden = new Garden();

    garden.addPlant(new Plant("yellow"));
    garden.addPlant(new Plant("blue"));
  }
}
