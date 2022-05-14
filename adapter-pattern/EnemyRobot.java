import java.util.Random;

public class EnemyRobot {
  Random generator = new Random();

  public void smashWithHands() {
    int damage = generator.nextInt(10);
    System.out.println("Robot does damages with" + damage);
  }

  public void walksForward() {
    int movements = generator.nextInt(20);
    System.out.println("Robot walks " + movements + " steps");
  }

  public void smilesToHuman(String name) {
    System.out.println("Robot is smiling to " + name);
  }
}
