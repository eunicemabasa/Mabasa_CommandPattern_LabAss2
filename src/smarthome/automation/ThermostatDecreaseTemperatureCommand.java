package smarthome.automation;

public class ThermostatDecreaseTemperatureCommand implements Command {
    private Thermostat thermostat;

    public ThermostatDecreaseTemperatureCommand(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    public void execute() {
        thermostat.decreaseTemperature();
    }
    public void undo() {
        thermostat.increaseTemperature();
    }
}
