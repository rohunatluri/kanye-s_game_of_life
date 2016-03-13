import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class AudioPlayer {

    private String fileName;

    public void play() {
        try {
            File file = new File(this.fileName);
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(file));
            clip.start();
        } catch (Exception e) {
            //System.err.println(e.getMessage());
        }
    }

    public AudioPlayer(String fileName) {
        this.fileName = fileName;
    }


    // public String fileName;
    // private Clip clip;
    // private File file;

    // public void play() {
    //     try {
    //         this.clip.open(AudioSystem.getAudioInputStream(file));
    //         this.clip.start();
    //     } catch (Exception e) {
    //         //System.err.println(e.getMessage());
    //     }
    // }

    // public AudioPlayer(String fileName) {
    //     this.fileName = fileName;
    //     try {
    //         this.file = new File(this.fileName);
    //         this.clip = AudioSystem.getClip();
    //     } catch (Exception e) {
    //         System.out.println(e.getMessage());
    //     }
    // }
}