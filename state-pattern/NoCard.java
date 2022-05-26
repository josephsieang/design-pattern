public class NoCard implements ATMState {
  ATMMachine atmMachine;

  public NoCard(ATMMachine atmMachine) {
    this.atmMachine = atmMachine;
  }

  @Override
  public void insertCard() {
    System.out.println("Please enter a pin");
    this.atmMachine.setAtmState(this.atmMachine.getYesCardState());
  }

  @Override
  public void ejectCard() {
    System.out.println("Please enter a card first");
  }

  @Override
  public void insertPin(int pin) {
    System.out.println("Please enter a card first");
  }

  @Override
  public void requestCash(int cash) {
    System.out.println("Please enter a card first");
  }

}
