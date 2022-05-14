public class CheckPassword {
  private int password = 123456;

  public int getPassword() {
    return this.password;
  }

  public boolean isPasswordCorrect(int password) {
    if (this.getPassword() == password) {
      return true;
    }
    return false;
  }
}
