package StructuralPattern.Adapter;

/**
 * @author chenzhang
 * @date 2024/11/30 13:11
 */
public interface AdvancedMedaPlayer {
    void playVlc(String fileName);
    void playMp4(String fileName);
}
class VlcPlayer implements AdvancedMedaPlayer {
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    public void playMp4(String fileName) {
        //do nothing
    }
}
class Mp4Player implements AdvancedMedaPlayer {
    public void playVlc(String fileName) {
        //do nothing
    }

    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
