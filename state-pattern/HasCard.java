public class HasCard implements ATMState {
  ATMMachine atmMachine;

  public HasCard(ATMMachine atmMachine) {
    this.atmMachine = atmMachine;
  }

  @Override
  public void insertCard() {
    System.out.println("You cannot insert more than one card");
  }

  @Override
  public void ejectCard() {
    System.out.println("Card ejected");
    this.atmMachine.setAtmState(atmMachine.getNoCardState());
  }

  @Override
  public void insertPin(int pin) {
    if (pin == 1234) {
      System.out.println("Correct pin entered");
      this.atmMachine.isPinCorrect = true;
      this.atmMachine.setAtmState(this.atmMachine.getHasPin());
    } else {
      System.out.println("Wrong pin entered");
      this.atmMachine.isPinCorrect = false;
      System.out.println("Card ejected");
      this.atmMachine.setAtmState(this.atmMachine.getNoCardState());
    }

  }

  @Override
  public void requestCash(int cash) {
    System.out.println("Insert pin first");
  }

}
