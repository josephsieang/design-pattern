public class ATMMachine {
  ATMState hasCard;
  ATMState noCard;
  ATMState hasCorrectPin;
  ATMState outOfMoney;

  ATMState atmState;

  int cashInAtm = 2000;
  boolean isPinCorrect = false;

  public ATMMachine() {
    this.hasCard = new HasCard(this);
    this.noCard = new NoCard(this);
    this.hasCorrectPin = new HasPin(this);
    this.outOfMoney = new NoCash(this);

    this.atmState = this.noCard;

    if (this.cashInAtm < 0) {
      this.atmState = this.outOfMoney;
    }
  }

  void setAtmState(ATMState atmState) {
    this.atmState = atmState;
  }

  public void setCashInAtm(int cash) {
    this.cashInAtm = cash;
  }

  public void insertCard() {
    this.atmState.insertCard();
  }

  public void ejectCard() {
    this.atmState.ejectCard();
  }

  public void requestCash(int cash) {
    this.atmState.requestCash(cash);
  }

  public void insertPin(int pin) {
    this.atmState.insertPin(pin);
  }

  public ATMState getYesCardState() {
    return this.hasCard;
  }

  public ATMState getNoCardState() {
    return this.noCard;
  }

  public ATMState getHasPin() {
    return this.hasCorrectPin;
  }

  public ATMState getNoCashState() {
    return this.outOfMoney;
  }
}