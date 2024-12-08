package BehavioralPattern.TempletMethod;

/**
 * @author chenzhang
 * @date 2024/12/8 13:42
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();
    public final void play()
    {
        initialize();
        startPlay();
        endPlay();
    }
}
