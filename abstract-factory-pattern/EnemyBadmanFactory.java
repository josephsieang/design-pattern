public class EnemyBadmanFactory implements EnemyFactory {
  @Override
  public EnemyWeapon addEnemyWeapon() {
    return new EnemyBadmanWeapon();
  }

  @Override
  public EnemyEngine addEnemyEngine() {
    return new EnemyBadmanEngine();
  }
}
