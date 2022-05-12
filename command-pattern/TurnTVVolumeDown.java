public class TurnTVVolumeDown implements Command {
  ElectronicDevice device;

  public TurnTVVolumeDown(ElectronicDevice device) {
    this.device = device;
  }

  @Override
  public void execute() {
    this.device.volumeDown();
  }
}
