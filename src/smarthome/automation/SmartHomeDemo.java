package smarthome.automation;

public class SmartHomeDemo {
    public static void main(String[] args) {
        Light light = new Light();
        Thermostat thermostat = new Thermostat();
        MusicPlayer musicPlayer = new MusicPlayer();
        Fan fan = new Fan();
        DoorLock doorLock = new DoorLock();

        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        Command lightIncrease = new LightIncreaseBrightnessCommand(light);
        Command lightDecrease = new LightDecreaseBrightnessCommand(light);

        Command thermostatOn = new ThermostatOnCommand(thermostat);
        Command thermostatOff = new ThermostatOffCommand(thermostat);
        Command thermostatIncrease = new ThermostatIncreaseTemperatureCommand(thermostat);
        Command thermostatDecrease = new ThermostatDecreaseTemperatureCommand(thermostat);

        Command musicOn = new MusicPlayerOnCommand(musicPlayer);
        Command musicOff = new MusicPlayerOffCommand(musicPlayer);
        Command musicIncrease = new MusicPlayerIncreaseVolumeCommand(musicPlayer);
        Command musicDecrease = new MusicPlayerDecreaseVolumeCommand(musicPlayer);
        Command musicPlayPlaylist = new MusicPlayerPlayPlaylistCommand(musicPlayer, "Relaxing Music");

        Command fanOn = new FanOnCommand(fan);
        Command fanOff = new FanOffCommand(fan);
        Command fanIncrease = new FanIncreaseSpeedCommand(fan);
        Command fanDecrease = new FanDecreaseSpeedCommand(fan);

        Command doorLockCommand = new DoorLockLockCommand(doorLock);
        Command doorUnlockCommand = new DoorLockUnlockCommand(doorLock);

        RemoteControl remote = new RemoteControl(5);

        remote.setCommand(0, lightOn, lightOff);
        remote.setIncreaseDecreaseCommands(0, lightIncrease, lightDecrease);

        remote.setCommand(1, thermostatOn, thermostatOff);
        remote.setIncreaseDecreaseCommands(1, thermostatIncrease, thermostatDecrease);

        remote.setCommand(2, musicOn, musicOff);
        remote.setIncreaseDecreaseCommands(2, musicIncrease, musicDecrease);

        remote.setCommand(3, fanOn, fanOff);
        remote.setIncreaseDecreaseCommands(3, fanIncrease, fanDecrease);

        remote.setCommand(4, doorUnlockCommand, doorLockCommand);

        System.out.println("Turning on lights:");
        remote.onButtonPressed(0);

        System.out.println("\nIncreasing light brightness:");
        remote.increaseButtonPressed(0);

        System.out.println("\nTurning on thermostat:");
        remote.onButtonPressed(1);

        System.out.println("\nDecreasing temperature:");
        remote.decreaseButtonPressed(1);

        System.out.println("\nTurning on music player:");
        remote.onButtonPressed(2);

        System.out.println("\nPlaying a specific playlist:");
        musicPlayPlaylist.execute();

        System.out.println("\nIncreasing volume:");
        remote.increaseButtonPressed(2);

        System.out.println("\nTurning on fan:");
        remote.onButtonPressed(3);

        System.out.println("\nIncreasing fan speed:");
        remote.increaseButtonPressed(3);

        System.out.println("\nUnlocking door:");
        remote.onButtonPressed(4);

        System.out.println("\nLocking door:");
        remote.offButtonPressed(4);

        System.out.println("\nTurning off lights:");
        remote.offButtonPressed(0);

        System.out.println("\nTurning off thermostat:");
        remote.offButtonPressed(1);

        System.out.println("\nTurning off music player:");
        remote.offButtonPressed(2);

        System.out.println("\nTurning off fan:");
        remote.offButtonPressed(3);
    }
}