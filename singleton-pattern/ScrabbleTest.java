import java.util.LinkedList;

public class ScrabbleTest {
  public static void main(String[] args) {
    Singleton newInstance = Singleton.getInstance();
    System.out.println("Instance Id 1: " + System.identityHashCode(newInstance));
    System.out.println(newInstance.getLetterList());

    LinkedList<String> playerOneTiles = newInstance.getTiles(7);
    System.out.println("Player 1: " + playerOneTiles);
    System.out.println(newInstance.getLetterList());

    Singleton newInstanceTwo = Singleton.getInstance();
    System.out.println("Instance Id 2: " + System.identityHashCode(newInstanceTwo));
    System.out.println(newInstanceTwo.getLetterList());

    LinkedList<String> playerTwoTiles = newInstance.getTiles(7);
    System.out.println("Player 2: " + playerTwoTiles);
    System.out.println(newInstance.getLetterList());
  }
}
