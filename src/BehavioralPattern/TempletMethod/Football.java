package BehavioralPattern.TempletMethod;

/**
 * @author chenzhang
 * @date 2024/12/8 13:43
 */
public class Football extends Game{

    @Override
    void initialize()
    {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay()
    {
        System.out.println("Football Game Started. Enjoy the game!");
    }

    @Override
    void endPlay()
    {
        System.out.println("Football Game Finished!");
    }
}
