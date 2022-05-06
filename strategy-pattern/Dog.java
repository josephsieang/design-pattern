public class Dog extends Animal {
  public Dog() {
    super();

    setFlyingAbility(new CannotFlys());
  }
}
