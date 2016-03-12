import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class AudioPlayer {
    
    public String fileName;

    public void play() {
        try {
            File file = new File(this.fileName);
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(file));
            clip.start();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public AudioPlayer(String fileName) {
        this.fileName = fileName;
    }
}
