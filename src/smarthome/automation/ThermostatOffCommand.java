package smarthome.automation;

public class ThermostatOffCommand implements Command {
    private Thermostat thermostat;

    public ThermostatOffCommand(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    public void execute() {
        thermostat.turnOff();
    }
    public void undo() {
        thermostat.turnOn();
    }
}
