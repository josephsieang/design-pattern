abstract class EntertainmentDevice {
  public int curChannel;
  public int maxChannel;
  public int volumeSetting = 0;

  public abstract void buttonFivePressed();

  public abstract void buttonSixPressed();

  public void deviceFeedback() {
    if (this.curChannel > this.maxChannel || this.curChannel < 0) {
      this.curChannel = 0;
    }

    System.out.println("Channel: " + this.curChannel);
  }

  public void buttonSevenPressed() {
    this.volumeSetting++;

    System.out.println("Volume at: " + this.volumeSetting);
  }

  public void buttonEightPressed() {
    this.volumeSetting--;

    System.out.println("Volume at: " + this.volumeSetting);
  }
}
