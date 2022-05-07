public class EnemySpidermanFactory implements EnemyFactory {
  @Override
  public EnemyWeapon addEnemyWeapon() {
    return new EnemySpidermanWeapon();
  }

  @Override
  public EnemyEngine addEnemyEngine() {
    return new EnemySpidermanEngine();
  }
}
