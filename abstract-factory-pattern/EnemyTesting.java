// Ref: https://www.newthinktank.com/wp-content/uploads/2012/09/Abstract-Factory-Small.png
public class EnemyTesting {
  public static void main(String[] args) {
    EnemyGeneration enemyGeneration = new MarvelEnemyGeneration();

    Enemy spiderman = enemyGeneration.orderEnemy(EnemyType.SPIDERMAN.label);
    spiderman.showEnemyInfo();

    Enemy badman = enemyGeneration.orderEnemy(EnemyType.BADMAN.label);
    badman.showEnemyInfo();
  }
}
