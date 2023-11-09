package adapter;

public class Main {
    public static void main(String[] args) {
        AudioPlayer ap = new AudioPlayer();

        ap.play("mp3", "Easy on me");
        ap.play("mp4", "Water under the bridge");
        ap.play("vlc", "Rolling in the deep");
        ap.play("avi", "All night parking");
    }
}
