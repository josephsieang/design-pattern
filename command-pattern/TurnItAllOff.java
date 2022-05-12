import java.util.List;

public class TurnItAllOff implements Command {
  private List<ElectronicDevice> devices;

  public TurnItAllOff(List<ElectronicDevice> devices) {
    this.devices = devices;
  }

  @Override
  public void execute() {
    for (ElectronicDevice device : this.devices) {
      device.off();
    }
  }
}
