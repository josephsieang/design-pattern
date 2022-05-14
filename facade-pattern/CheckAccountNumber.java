public class CheckAccountNumber {
  private int accountNumber = 654321;

  public int getAccountNumber() {
    return this.accountNumber;
  }

  public boolean isAccountActive(int accountToCheck) {
    if (this.getAccountNumber() == accountToCheck) {
      return true;
    }
    return false;
  }
}
