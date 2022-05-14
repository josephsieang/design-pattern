public class TestAdapter {
  public static void main(String[] args) {
    EnemyTank enemyTank = new EnemyTank();
    enemyTank.fireWeapon();
    enemyTank.driveForward();
    enemyTank.assignDriver("Mark");

    EnemyRobot robot = new EnemyRobot();
    robot.smashWithHands();
    robot.walksForward();
    robot.smilesToHuman("James");

    EnemyRobotAdapter robotAdapter = new EnemyRobotAdapter(robot);
    robotAdapter.fireWeapon();
    robotAdapter.driveForward();
    robotAdapter.assignDriver("Jessie");
  }
}
