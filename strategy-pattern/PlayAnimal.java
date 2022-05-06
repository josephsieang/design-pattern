public class PlayAnimal {
  public static void main(String[] args) {
    Animal sparky = new Dog();
    Animal tweety = new Bird();

    System.out.println("Dog: " + sparky.getFlyingAbility());
    System.out.println("Bird: " + tweety.getFlyingAbility());

    sparky.setFlyingAbility(new CanFlys());
    System.out.println("Dog: " + sparky.getFlyingAbility());
  }
}
