public class Bird extends Animal {
  public Bird() {
    super();

    setFlyingAbility(new CanFlys());
  }
}
