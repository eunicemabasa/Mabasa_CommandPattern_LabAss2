package smarthome.automation;

public class DoorLock {
    private boolean locked = true;

    public void lock() {
        locked = true;
        System.out.println("Door is locked.");
    }

    public void unlock() {
        locked = false;
        System.out.println("Door is unlocked.");
    }
}
