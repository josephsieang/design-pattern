public class EnemySpiderman extends Enemy {
  EnemyFactory enemyFactory;

  public EnemySpiderman(EnemyFactory enemyFactory) {
    this.enemyFactory = enemyFactory;
  }

  @Override
  void makeEnemy() {
    this.enemyWeapon = this.enemyFactory.addEnemyWeapon();
    this.enemyEngine = this.enemyFactory.addEnemyEngine();
  }
}
