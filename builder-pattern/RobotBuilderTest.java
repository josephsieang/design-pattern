public class RobotBuilderTest {
  public static void main(String[] args) {
    RobotBuilder oldStyleRobotPlan = new OldRobotBuilder();
    RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobotPlan);

    robotEngineer.makeRobot();

    Robot firstRobot = robotEngineer.getRobot();

    System.out.println("Robot built");
    System.out.println("Robot head type: " + firstRobot.getRobotHead());
    System.out.println("Robot Torso type: " + firstRobot.getRobotTorso());
    System.out.println("Robot Arm type: " + firstRobot.getRobotArms());
    System.out.println("Robot Leg type: " + firstRobot.getRobotLegs());
  }
}
