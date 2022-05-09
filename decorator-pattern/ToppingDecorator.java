abstract class ToppingDecorator implements Pizza {
  protected Pizza tempPizza;

  public ToppingDecorator(Pizza newPizza) {
    this.tempPizza = newPizza;
  }

  public String getDescription() {
    return this.tempPizza.getDescription();
  }

  public double getCost() {
    return this.tempPizza.getCost();
  }

}
