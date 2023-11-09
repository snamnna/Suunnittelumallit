package adapter;

public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {

        // Tänne tehty yksi mahdollisuus lisää soittaa eri muodossa olevaa kappaletta
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing the mp3 file named " + fileName);
        }

        else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }

        else {
            System.out.println("Format is not supported in this media player, please try again with different format.");
        }
    }

}
