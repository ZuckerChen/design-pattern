package StructuralPattern.Adapter;


/**
 * @author chenzhang
 * @date 2024/11/30 13:18
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 解决不同接口之间的兼容性
         *
         * 目标接口（Target）：定义客户需要的接口。
         * 适配者类（Adaptee）：定义一个已经存在的接口，这个接口需要适配。
         * 适配器类（Adapter）：实现目标接口，并通过组合或继承的方式调用适配者类中的方法，从而实现目标接口。
         */
        AudioPlayer player = new AudioPlayer();
        player.play("mp3", "beyond the horizon.mp3");
        player.play("mp4", "alone.mp4");
        player.play("vlc", "far far away.vlc");
        player.play("avi", "mind me.avi");
    }
}
