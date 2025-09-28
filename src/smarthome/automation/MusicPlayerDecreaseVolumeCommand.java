package smarthome.automation;

public class MusicPlayerDecreaseVolumeCommand implements Command {
    private MusicPlayer musicPlayer;

    public MusicPlayerDecreaseVolumeCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public void execute() {
        musicPlayer.decreaseVolume();
    }
    public void undo() {
        musicPlayer.increaseVolume();
    }
}