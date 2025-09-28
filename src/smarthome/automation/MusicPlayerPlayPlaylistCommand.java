package smarthome.automation;

public class MusicPlayerPlayPlaylistCommand implements Command {
    private MusicPlayer musicPlayer;
    private String playlist;

    public MusicPlayerPlayPlaylistCommand(MusicPlayer musicPlayer, String playlist) {
        this.musicPlayer = musicPlayer;
        this.playlist = playlist;
    }

    public void execute() {
        musicPlayer.playPlaylist(playlist);
    }
    public void undo() {
        String previousPlaylist = "";
        musicPlayer.playPlaylist(previousPlaylist);
    }
}
