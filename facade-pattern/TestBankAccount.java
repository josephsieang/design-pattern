public class TestBankAccount {
  public static void main(String[] args) {
    BankAccountFacade accessBank = new BankAccountFacade(654321, 123456);

    accessBank.withdraw(500);
    accessBank.withdraw(250);
    accessBank.deposit(100);
  }
}
