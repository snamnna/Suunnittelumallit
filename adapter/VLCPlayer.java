package adapter;

public class VLCPlayer implements AdvancesdMediaPlayer {

    @Override
    public void playVLC(String fileName) {
        System.out.println("Now playing VLC file named " + fileName);
    }

    @Override
    public void playMP4(String fileName) {
        // Tällä metodilla ei tehdä mitään, koska vanha VLC player ei tue mp4 tiedostoja
    }

}
