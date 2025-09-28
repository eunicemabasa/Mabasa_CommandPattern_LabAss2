package smarthome.automation;

public class Light {
    private int brightness = 0;

    public void turnOn(){
        brightness = 100;
        System.out.println("Light is turned on at brightness: " + brightness);
    }
    public void turnOff(){
        brightness = 0;
        System.out.println("Light is turned off.");
    }
    public void increaseBrightness(){
        if (brightness < 100){
            brightness += 10;
        }
        System.out.println("Light brightness increased to: " + brightness);
    }
    public void decreaseBrightness(){
        if (brightness > 0){
            brightness -= 10;
        }
        System.out.println("Light brightness decreased to: " + brightness);
    }
}
