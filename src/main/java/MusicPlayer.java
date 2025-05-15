public class MusicPlayer implements Player {
    private boolean onOff;
    private String[] musicList;
    private String currentSong;
    private int volume;
    private int songIndex;

    public MusicPlayer(String[] musicList) {
        this.musicList = musicList;
        this.volume = 0;
        this.onOff = false;
        this.currentSong = "";
        this.songIndex = 0;
    }

    public void start() {
        if (!onOff && musicList.length > 0) {
            onOff = true;
            currentSong = musicList[0];
            songIndex = 0;
        }
    }

    public void stop() {
        if (onOff) {
            onOff = false;
            currentSong = "";
        }
    }

    public boolean getOnOff() {
        return onOff;
    }

    public void volumeUp() {
        volume++;
    }

    public void volumeDown() {
        volume--;
    }

    public int getVolume() {
        return volume;
    }

    public void next() {
        if (onOff && musicList.length > 0 && songIndex < musicList.length - 1) {
            songIndex++;
            currentSong = musicList[songIndex];
        }
    }

    public void previous() {
        if (onOff && songIndex > 0) {
            songIndex--;
            currentSong = musicList[songIndex];
        }
    }

    public String getCurrentSong() {
        return currentSong;
    }
}
