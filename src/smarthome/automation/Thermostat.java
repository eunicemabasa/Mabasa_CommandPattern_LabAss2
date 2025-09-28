package smarthome.automation;

public class Thermostat {
    private int temperature = 72;

    public void turnOn(){
        System.out.println("Thermostat is turned on at: " + temperature + "°F");
    }
    public void turnOff(){
        System.out.println("Thermostat is turned off.");
    }
    public void increaseTemperature(){
        temperature += 1;
        System.out.println("Temperature increased to: " + temperature + "°F");
    }
    public void decreaseTemperature(){
        temperature -= 1;
        System.out.println("Temperature decrease to: " + temperature + "°F");
    }
}
