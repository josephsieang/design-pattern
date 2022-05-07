public class EnemyFactory {
  public Enemy generateEnemy(String enemyType) {
    if (EnemyType.BADMAN.label.equals(enemyType)) {
      return new Badman();
    } else if (EnemyType.SPIDERMAN.label.equals(enemyType)) {
      return new Spiderman();
    } else {
      return null;
    }
  }
}
