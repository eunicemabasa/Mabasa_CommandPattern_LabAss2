package smarthome.automation;

public class MusicPlayerOnCommand implements Command {
    private MusicPlayer musicPlayer;

    public MusicPlayerOnCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public void execute() {
        musicPlayer.turnOn();
    }
    public void undo() {
        musicPlayer.turnOff();
    }
}