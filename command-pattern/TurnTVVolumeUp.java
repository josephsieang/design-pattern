public class TurnTVVolumeUp implements Command {
  ElectronicDevice device;

  public TurnTVVolumeUp(ElectronicDevice device) {
    this.device = device;
  }

  @Override
  public void execute() {
    this.device.volumeUp();
  }
}
