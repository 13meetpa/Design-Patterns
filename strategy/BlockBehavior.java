package strategy;

import java.util.Random;

public class BlockBehavior implements DefenceBehavior  {
    public String play()
    {
        Random random = new Random();
        int actionIndex = random.nextInt(3);

        if (actionIndex == 0) {
            return "blocks player from passing";
        } else if (actionIndex == 1) {
            return "blocks player from shooting";
        } else {
            return "checks player with puck";
        }
    }
}
