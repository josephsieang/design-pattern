// Ref: https://www.baeldung.com/java-enum-values
public enum EnemyType {
  SPIDERMAN("S"),
  BADMAN("B");

  public String label;

  private EnemyType(String label) {
    this.label = label;
  }
}
