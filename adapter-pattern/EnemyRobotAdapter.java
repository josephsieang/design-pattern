public class EnemyRobotAdapter implements EnemyAttacker {
  private EnemyRobot robot;

  public EnemyRobotAdapter(EnemyRobot robot) {
    this.robot = robot;
  }

  @Override
  public void fireWeapon() {
    this.robot.smashWithHands();
  }

  @Override
  public void driveForward() {
    this.robot.walksForward();
  }

  @Override
  public void assignDriver(String name) {
    this.robot.smilesToHuman(name);
  }
}
