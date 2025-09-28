package smarthome.automation;

public class LightDecreaseBrightnessCommand implements Command {
    private Light light;

    public LightDecreaseBrightnessCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.decreaseBrightness();
    }
    public void undo() {
        light.increaseBrightness();
    }
}

