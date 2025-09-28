package smarthome.automation;

public interface Command {
    void execute();
    void undo();
}
