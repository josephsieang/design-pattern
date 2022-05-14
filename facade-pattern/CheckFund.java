public class CheckFund {
  private double funds = 1000;

  public double getCashInAccounts() {
    return this.funds;
  }

  public boolean hasEnoughMoneyToWithdraw(double moneyToWithdraw) {
    boolean hasEnoughMoney = this.getCashInAccounts() > moneyToWithdraw;
    if (!hasEnoughMoney) {
      System.out.println("The balance is not enough");
    }
    return hasEnoughMoney;
  }

  public void withdraw(double moneyToWithdraw) {
    this.funds -= moneyToWithdraw;
    System.out.println("Withdraw done. The balance is " + this.getCashInAccounts());
  }

  public void deposit(double moneyToDeposit) {
    this.funds += moneyToDeposit;
    System.out.println("Deposit done. The balance is " + this.getCashInAccounts());
  }
}
