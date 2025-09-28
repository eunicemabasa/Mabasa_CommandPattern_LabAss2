package smarthome.automation;

public class FanIncreaseSpeedCommand implements Command {
    private Fan fan;

    public FanIncreaseSpeedCommand(Fan fan) {
        this.fan = fan;
    }

    public void execute() {
        fan.increaseSpeed();
    }
    public void undo() {
        fan.decreaseSpeed();
    }
}
