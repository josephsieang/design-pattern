public class HasPin implements ATMState {
  ATMMachine atmMachine;

  public HasPin(ATMMachine atmMachine) {
    this.atmMachine = atmMachine;
  }

  @Override
  public void insertCard() {
    System.out.println("You can't insert more than a card");
  }

  @Override
  public void ejectCard() {
    System.out.println("Card ejected");
    this.atmMachine.setAtmState(this.atmMachine.getNoCardState());
  }

  @Override
  public void insertPin(int pin) {
    System.out.println("Already entered pin");
  }

  @Override
  public void requestCash(int cash) {
    if (cash > this.atmMachine.cashInAtm) {
      System.out.println("Don't have enough cash");
    } else {
      System.out.println(cash + " is provided by the atm");
      this.atmMachine.setCashInAtm(this.atmMachine.cashInAtm - cash);

      if (this.atmMachine.cashInAtm <= 0) {
        this.atmMachine.setAtmState(this.atmMachine.getNoCashState());
      }
    }
    this.ejectCard();
  }

}
