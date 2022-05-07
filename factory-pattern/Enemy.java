public abstract class Enemy {
  private String name;
  private double damage;

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getDamage() {
    return this.damage;
  }

  public void setDamage(double damage) {
    this.damage = damage;
  }

  public void followHero() {
    System.out.println(this.getName() + " is following the hero");
  }

  public void displayEnemy() {
    System.out.println(this.getName() + " is on the screen");
  }

  public void enemyAttack() {
    System.out.println(this.getName() + " is attacking and does " + this.getDamage() + " damage");
  }
}
