public class ItalianHoagie extends Hoagie {
  String[] meats = { "Salami", "Pepperoni", "Capicola Ham" };
  String[] cheeses = { "Provolone" };
  String[] veggies = { "Lettuce", "Tomatoes", "Onions", "Sweet Peppers" };

  @Override
  void addMeat() {
    System.out.println("Add meat");

    for (String meat : meats) {
      System.out.print(meat + " ");
    }

    System.out.println();
  }

  @Override
  void addCheese() {
    System.out.println("Add cheese");

    for (String cheese : cheeses) {
      System.out.print(cheese + " ");
    }

    System.out.println();
  }

  @Override
  void addVegetables() {
    System.out.println("Add vegetables");

    for (String veggie : veggies) {
      System.out.print(veggie + " ");
    }

    System.out.println();
  }
}
