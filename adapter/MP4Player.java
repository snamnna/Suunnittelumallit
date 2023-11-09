package adapter;

public class MP4Player implements AdvancesdMediaPlayer {

    @Override
    public void playVLC(String fileName) {
        // Tässä ei tehdä mitään, sillä uudella MP4 playerilla ei voida soittaa vanhoja
        // VLC tiedostoja
    }

    @Override
    public void playMP4(String fileName) {
        System.out.println("Playing MP4 file named " + fileName);
    }

}
