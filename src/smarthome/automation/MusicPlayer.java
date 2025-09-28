package smarthome.automation;

public class MusicPlayer {
    private int volume = 50;
    private String playlist = "Default Playlist";

    public void turnOn(){
        System.out.println("Music Player is turned on, playing: " + playlist + "at volume:" + volume);
    }
    public void turnOff(){
        System.out.println("Music Player is turned off.");
    }
    public void increaseVolume(){
        if (volume < 100){
            volume +=10;
        }
        System.out.println("Volume increased to: " + volume);
    }
    public void playPlaylist(String newPlaylist){
        playlist = newPlaylist;
        System.out.println("Playlist new playlist: " + playlist);
    }

    public void decreaseVolume() {
    }
}
