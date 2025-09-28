package smarthome.automation;

public class FanDecreaseSpeedCommand implements Command {
    private Fan fan;

    public FanDecreaseSpeedCommand(Fan fan) {
        this.fan = fan;
    }

    public void execute() {
        fan.decreaseSpeed();
    }
    public void undo() {
        fan.increaseSpeed();
    }
}