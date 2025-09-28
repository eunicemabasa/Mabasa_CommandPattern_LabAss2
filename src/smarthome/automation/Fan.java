package smarthome.automation;

public class Fan {
    private int speed = 0;

    public void turnOn() {
        speed = 1;
        System.out.println("Fan is turned on at speed: " + speed);
    }

    public void turnOff() {
        speed = 0;
        System.out.println("Fan is turned off.");
    }

    public void increaseSpeed() {
        if (speed < 3) {
            speed += 1;
        }
        System.out.println("Fan speed increased to: " + speed);
    }

    public void decreaseSpeed() {
        if (speed > 0) {
            speed -= 1;
        }
        System.out.println("Fan speed decreased to: " + speed);
    }
}