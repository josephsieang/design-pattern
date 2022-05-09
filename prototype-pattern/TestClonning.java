public class TestClonning {
  public static void main(String[] args) {
    CloneFactory animalMaker = new CloneFactory();
    Sheep sally = new Sheep();
    Sheep clonedSheep = (Sheep) animalMaker.getClone(sally);

    System.out.println("Sally hashcode: " + System.identityHashCode(sally));
    System.out.println("Clone hashcode: " + System.identityHashCode(clonedSheep));
  }
}
