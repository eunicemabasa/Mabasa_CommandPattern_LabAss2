package smarthome.automation;

public class MusicPlayerIncreaseVolumeCommand implements Command {
    private MusicPlayer musicPlayer;

    public MusicPlayerIncreaseVolumeCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public void execute() {
        musicPlayer.increaseVolume();
    }
    public void undo() {
        musicPlayer.decreaseVolume();
    }
}
