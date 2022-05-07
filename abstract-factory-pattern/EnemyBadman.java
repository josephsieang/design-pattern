public class EnemyBadman extends Enemy {
  EnemyFactory enemyFactory;

  public EnemyBadman(EnemyFactory enemyFactory) {
    this.enemyFactory = enemyFactory;
  }

  @Override
  void makeEnemy() {
    this.enemyWeapon = this.enemyFactory.addEnemyWeapon();
    this.enemyEngine = this.enemyFactory.addEnemyEngine();
  }
}
