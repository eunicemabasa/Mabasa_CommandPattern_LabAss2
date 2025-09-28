package smarthome.automation;

public class MusicPlayerOffCommand implements Command {
    private MusicPlayer musicPlayer;

    public MusicPlayerOffCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public void execute() {
        musicPlayer.turnOff();
    }
    public void undo() {
        musicPlayer.turnOn();
    }
}