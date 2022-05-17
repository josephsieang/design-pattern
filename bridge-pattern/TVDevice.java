public class TVDevice extends EntertainmentDevice {

  public TVDevice(int channel, int maxChannel) {
    this.curChannel = channel;
    this.maxChannel = maxChannel;
  }

  @Override
  public void buttonFivePressed() {
    this.curChannel--;
    System.out.println("Channel down");
  }

  @Override
  public void buttonSixPressed() {
    this.curChannel++;
    System.out.println("Channel Up");
  }

}
