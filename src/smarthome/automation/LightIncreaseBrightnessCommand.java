package smarthome.automation;

public class LightIncreaseBrightnessCommand implements Command {
    private Light light;

    public LightIncreaseBrightnessCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.increaseBrightness();
    }

    public void undo() {
        light.decreaseBrightness();
    }
}