public class Tv {

    // What attributes do I need to
    private int channel;
    private int volume;
    private boolean on;

    final static int maxVol = 100;
    final static int minVol = 0;
    final static int minChan = 1;

    // Constructor - define the default values of a new Tv
    Tv() {
        channel = minChan;
        volume = 10;
        on = false;
    }

    // Set power
    void powerOn() {
        on = true;
    }

    void powerOff() {
        on = false;
    }

    void power() {
        on = !on;
    }

    // Set the Tv Channel
    void setChannel(int channel) {
        if (channel > minChan) {
            this.channel = channel;
        }
    }

    void channelUp() {
        channel++;
    }

    void channelDown() {
        if (channel > minChan) {
            channel--;
        }
    }

    // Set the volume
    void volMute() {
        volume = minVol;
    }

    void volUp() {
        if (volume < maxVol) {
            volume++;
        }
    }

    void volDown() {
        if (volume > minVol) {
            volume--;
        }
    }

    void setVolume(int volume) {
        if (volume <= maxVol && volume >= minVol) {
            this.volume = volume;
        }
    }

    // Get methods
    int getVolume() {
        return volume;
    }

    int getChannel() {
        return channel;
    }

    // String output
    public String toString() {
        return String.format("Channel: " + channel + "%nVolume: " + volume + "%nOn: " + on);
     }
}