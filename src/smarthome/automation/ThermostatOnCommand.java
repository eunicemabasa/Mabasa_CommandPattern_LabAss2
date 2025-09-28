package smarthome.automation;

public class ThermostatOnCommand implements Command {
    private Thermostat thermostat;

    public ThermostatOnCommand(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    public void execute() {
        thermostat.turnOn();
    }
    public void undo() {
        thermostat.turnOff();
    }
}
