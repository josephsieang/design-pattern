public abstract class Enemy {
  private String enemyName;

  public EnemyWeapon enemyWeapon;
  public EnemyEngine enemyEngine;

  public String getName() {
    return this.enemyName;
  }

  public void setName(String enemyName) {
    this.enemyName = enemyName;
  }

  abstract void makeEnemy();

  public void showEnemyInfo() {
    System.out.println(this.enemyName + " is making " + this.enemyWeapon + " with engine speed " + this.enemyEngine);
  }
}
