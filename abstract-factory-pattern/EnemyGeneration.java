public abstract class EnemyGeneration {
  protected abstract Enemy makeEnemy(String typeOfEnemy);

  public Enemy orderEnemy(String typeOfEnemy) {
    Enemy enemy = makeEnemy(typeOfEnemy);

    enemy.makeEnemy();

    return enemy;
  }
}
