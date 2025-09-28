package smarthome.automation;

public class DoorLockUnlockCommand implements Command {
    private DoorLock doorLock;

    public DoorLockUnlockCommand(DoorLock doorLock) {
        this.doorLock = doorLock;
    }

    public void execute() {
        doorLock.unlock();
    }
    public void undo() {
        doorLock.lock();
    }
}
