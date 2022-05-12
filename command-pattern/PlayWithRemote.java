import java.util.ArrayList;
import java.util.List;

public class PlayWithRemote {
  public static void main(String[] args) {
    ElectronicDevice televison = TVRemote.getDevice();

    TurnTVOn onCommand = new TurnTVOn(televison);
    DeviceButton onPressed = new DeviceButton(onCommand);
    onPressed.press();

    TurnTVOff offCommand = new TurnTVOff(televison);
    DeviceButton offPressed = new DeviceButton(offCommand);
    offPressed.press();

    TurnTVVolumeUp volumeUpCommand = new TurnTVVolumeUp(televison);
    DeviceButton volumeUpPressed = new DeviceButton(volumeUpCommand);
    volumeUpPressed.press();
    volumeUpPressed.press();
    volumeUpPressed.press();

    Radio radio = RadioControl.getDevice();

    List<ElectronicDevice> devices = new ArrayList<ElectronicDevice>();
    devices.add(radio);
    devices.add(televison);

    TurnItAllOff turnOffDevices = new TurnItAllOff(devices);
    DeviceButton turnThemOff = new DeviceButton(turnOffDevices);
    turnThemOff.press();
  }
}
