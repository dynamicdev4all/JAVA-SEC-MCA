import javafx.application.Application;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class SongPlayer extends Application {
    String args[];
    boolean isPlaying = false;

    @Override
    public void start(Stage arg0) {
        try {
            String musicUrl = "https://audio-ssl.itunes.apple.com/itunes-assets/AudioPreview211/v4/3c/ac/99/3cac99b7-b3d0-7770-ec46-df6246d71f19/mzaf_4346138457410138458.plus.aac.p.m4a";
            Media media = new Media(musicUrl);
            MediaPlayer player = new MediaPlayer(media);
            if (isPlaying == false) {
                player.play();
                isPlaying = true;
            } else if (isPlaying == true) {
                player.pause();
                isPlaying = false;
            }
            // player.pause();
            System.out.println("The song is playing");
        } catch (Exception e) {
            System.out.println("Song is not Playing " + e);
        }

    }

    void callStart() {
        launch(args);
    }

}
