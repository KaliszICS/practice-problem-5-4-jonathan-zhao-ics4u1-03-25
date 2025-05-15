public class RadioPlayer implements Player {
    private boolean onOff;
    private double[] stationList;
    private int volume;
    private double station;
    private int stationIndex;

    public RadioPlayer(double[] stationList) {
        this.stationList = stationList;
        this.volume = 0;
        this.onOff = false;
        this.station = 0;
        this.stationIndex = 0;
    }

    public void start() {
        if (!onOff && stationList.length > 0) {
            onOff = true;
            station = stationList[0];
            stationIndex = 0;
        }
    }

    public void stop() {
        if (onOff) {
            onOff = false;
            station = 0;
        }
    }

    public boolean getOnOff() {
        return onOff;
    }

    public void volumeUp() {
        volume += 2;
    }

    public void volumeDown() {
        volume -= 2;
    }

    public int getVolume() {
        return volume;
    }

    public void next() {
        if (onOff && stationIndex < stationList.length - 1) {
            stationIndex++;
            station = stationList[stationIndex];
        }
    }

    public void previous() {
        if (onOff && stationIndex > 0) {
            stationIndex--;
            station = stationList[stationIndex];
        }
    }

    public double getStation() {
        return station;
    }
}
