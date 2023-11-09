package adapter;

public class MediaAdapter implements MediaPlayer {

    AdvancesdMediaPlayer advancedPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedPlayer = new VLCPlayer();
        }

        else if (audioType.equalsIgnoreCase("mp4")) {
            advancedPlayer = new MP4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedPlayer.playVLC(fileName);
        }

        else if (audioType.equalsIgnoreCase("mp4")) {
            advancedPlayer.playMP4(fileName);
        }
    }

}
