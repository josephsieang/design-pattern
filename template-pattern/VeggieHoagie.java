public class VeggieHoagie extends Hoagie {
  String[] veggies = { "Lettuce", "Tomatoes", "Onions", "Sweet Peppers" };

  boolean customerWantsMeat() {
    return false;
  }

  boolean customerWantsCheese() {
    return false;
  }

  @Override
  void addMeat() {
  }

  @Override
  void addCheese() {
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
