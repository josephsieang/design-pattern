public class NoCash implements ATMState {
  ATMMachine atmMachine;

  public NoCash(ATMMachine atmMachine) {
    this.atmMachine = atmMachine;
  }

  @Override
  public void insertCard() {
    System.out.println("We don't have money");

  }

  @Override
  public void ejectCard() {
    System.out.println("Please enter a card but we don't have money");

  }

  @Override
  public void insertPin(int pin) {
    System.out.println("We don't have money");
  }

  @Override
  public void requestCash(int cash) {
    System.out.println("We don't have money");
  }
}
