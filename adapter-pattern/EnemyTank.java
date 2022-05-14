import java.util.Random;

public class EnemyTank implements EnemyAttacker {
  Random generator = new Random();

  @Override
  public void fireWeapon() {
    int damage = generator.nextInt(10);
    System.out.println("Tank does damages with" + damage);
  }

  @Override
  public void driveForward() {
    int movements = generator.nextInt(20);
    System.out.println("Tank moves " + movements + " steps");
  }

  @Override
  public void assignDriver(String name) {
    System.out.println("Tank driver is " + name);
  }
}
