package strategy;

import java.util.Random;

public class BlockBehavior implements DefenceBehavior  {
    public String play()
    {
        String[] actions = {"blocks player from passing", "blocks player from shooting", "checks player with puck"};
        Random random = new Random();
        int index = random.nextInt(actions.length);
        return actions[index];
    }
}
