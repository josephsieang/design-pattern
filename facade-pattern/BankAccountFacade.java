public class BankAccountFacade {
  private int accountNumber;
  private int password;

  private CheckAccountNumber accountNumberChecker;
  private CheckPassword passwordChecker;
  private CheckFund fundsChecker;

  public BankAccountFacade(int accountNumber, int password) {
    this.accountNumber = accountNumber;
    this.password = password;

    new WelcomeToBank();

    this.accountNumberChecker = new CheckAccountNumber();
    this.passwordChecker = new CheckPassword();
    this.fundsChecker = new CheckFund();
  }

  public int getAccountNumber() {
    return this.accountNumber;
  }

  public int getPassword() {
    return this.password;
  }

  public void withdraw(double moneyToWithdraw) {
    if (this.accountNumberChecker.isAccountActive(this.getAccountNumber())
        && this.passwordChecker.isPasswordCorrect(this.getPassword())
        && this.fundsChecker.hasEnoughMoneyToWithdraw(moneyToWithdraw)) {
      this.fundsChecker.withdraw(moneyToWithdraw);
      System.out.println("Transaction done");
    } else {
      System.out.println("Transaction failed");
    }
  }

  public void deposit(double moneyToDeposit) {
    if (this.accountNumberChecker.isAccountActive(this.getAccountNumber())
        && this.passwordChecker.isPasswordCorrect(this.getPassword())) {
      this.fundsChecker.deposit(moneyToDeposit);
      System.out.println("Transaction done");
    } else {
      System.out.println("Transaction failed");
    }
  }
}
