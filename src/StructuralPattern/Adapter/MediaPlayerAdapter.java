package StructuralPattern.Adapter;

/**
 * @author chenzhang
 * @date 2024/11/30 13:12
 */
public class MediaPlayerAdapter implements MediaPlayer{
    AdvancedMedaPlayer advancedMedaPlayer;

    public MediaPlayerAdapter(String type) {
        if (type.equals("vlc")) {
            advancedMedaPlayer = new VlcPlayer();
        } else if (type.equals("mp4")) {
            advancedMedaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equals("vlc")) {
            advancedMedaPlayer.playVlc(fileName);
        } else if (audioType.equals("mp4")) {
            advancedMedaPlayer.playMp4(fileName);
        }
    }
}
