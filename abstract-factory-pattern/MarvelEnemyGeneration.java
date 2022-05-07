public class MarvelEnemyGeneration extends EnemyGeneration {
  @Override
  protected Enemy makeEnemy(String typeOfEnemy) {
    Enemy enemy = null;

    if (typeOfEnemy.equals(EnemyType.BADMAN.label)) {
      EnemyFactory factory = new EnemyBadmanFactory();
      enemy = new EnemyBadman(factory);
      enemy.setName("Badman");
    } else if (typeOfEnemy.equals(EnemyType.SPIDERMAN.label)) {
      EnemyFactory factory = new EnemySpidermanFactory();
      enemy = new EnemySpiderman(factory);
      enemy.setName("Spiderman");
    }

    return enemy;
  }
}
