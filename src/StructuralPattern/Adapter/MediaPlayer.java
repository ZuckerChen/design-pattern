package StructuralPattern.Adapter;

/**
 * @author chenzhang
 * @date 2024/11/30 13:10
 */
public interface MediaPlayer {
    void play(String audioType, String fileName);
}

class AudioPlayer implements MediaPlayer {
    MediaPlayer mediaPlayer;

    public void play(String audioType, String fileName) {
        if(audioType.equals("mp3")){
            System.out.println("Playing mp3 file. Name: " + fileName);
        }
        else if(audioType.equals("vlc") || audioType.equals("mp4")){
            mediaPlayer = new MediaPlayerAdapter(audioType);
            mediaPlayer.play(audioType, fileName);
        }
        else{
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}

