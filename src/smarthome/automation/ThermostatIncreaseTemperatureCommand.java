package smarthome.automation;

public class ThermostatIncreaseTemperatureCommand implements Command {
    private Thermostat thermostat;

    public ThermostatIncreaseTemperatureCommand(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    public void execute() {
        thermostat.increaseTemperature();
    }
    public void undo() {
        thermostat.decreaseTemperature();
    }
}