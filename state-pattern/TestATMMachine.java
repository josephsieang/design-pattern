public class TestATMMachine {
  public static void main(String[] args) {
    ATMMachine machine = new ATMMachine();

    machine.insertCard();
    machine.ejectCard();
    machine.insertCard();
    machine.insertPin(1234);
    machine.requestCash(2000);
    machine.insertCard();
    machine.insertPin(1234);
    machine.requestCash(2000);
  }
}
