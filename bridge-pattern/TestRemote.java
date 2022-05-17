public class TestRemote {
  public static void main(String[] args) {
    RemoteButton smallTv = new TVRemoteMute(new TVDevice(1, 200));
    RemoteButton bigTv = new TVRemotePause(new TVDevice(100, 150));

    smallTv.buttonFivePressed();
    smallTv.buttonSixPressed();
    smallTv.buttonNinePressed();

    bigTv.buttonFivePressed();
    bigTv.buttonFivePressed();
    bigTv.buttonFivePressed();
    bigTv.buttonSixPressed();
    bigTv.buttonNinePressed();
    bigTv.deviceFeedback();
  }
}
