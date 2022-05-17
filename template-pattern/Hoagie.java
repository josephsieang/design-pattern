public abstract class Hoagie {
  final void makeSandwich() {
    this.cutBun();

    if (this.customerWantsMeat()) {
      this.addMeat();
    }

    if (this.customerWantsCheese()) {
      this.addCheese();
    }

    if (this.customerWantsVegetables()) {
      this.addVegetables();
    }

    wrapTheHoagie();
  }

  public void cutBun() {
    System.out.println("The hoagie is cut");
  }

  abstract void addMeat();

  abstract void addCheese();

  abstract void addVegetables();

  boolean customerWantsMeat() {
    return true;
  }

  boolean customerWantsCheese() {
    return true;
  }

  boolean customerWantsVegetables() {
    return true;
  }

  public void wrapTheHoagie() {
    System.out.println("The hoagie is wrapped");
  }
}
