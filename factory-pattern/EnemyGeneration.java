import java.util.Scanner;

public class EnemyGeneration {
  public static void main(String[] args) {
    EnemyFactory enemyFactory = new EnemyFactory();
    Enemy enemy = null;

    try (Scanner userInput = new Scanner(System.in)) {
      System.out.println("What type of enemy? S: Spiderman, B: Badman");

      if (userInput.hasNextLine()) {
        String typeOfEnemy = userInput.nextLine();
        enemy = enemyFactory.generateEnemy(typeOfEnemy);
      }
    }

    printEnemyInfo(enemy);
  }

  private static void printEnemyInfo(Enemy enemy) {
    if (enemy == null) {
      System.out.println("Enter wrongly. Please try again.");
    } else {
      enemy.displayEnemy();
      enemy.followHero();
      enemy.enemyAttack();
    }
  }
}
