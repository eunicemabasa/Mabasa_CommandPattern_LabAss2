package smarthome.automation;

public class DoorLockLockCommand implements Command {
    private DoorLock doorLock;

    public DoorLockLockCommand(DoorLock doorLock) {
        this.doorLock = doorLock;
    }

    public void execute() {
        doorLock.lock();
    }
    public void undo() {
        doorLock.unlock();
    }
}