package strategy;

import java.util.Random;

public class BlockGoalBehavior implements DefenceBehavior, OffenceBehavior {
    
    public String play()
    {
        Random random = new Random();
        double randomValue = random.nextDouble();

        if (randomValue < 0.25) {
            return "hand blocks the puck";
        } else if (randomValue < 0.5) {
            return "catches the puck";
        } else if (randomValue < 0.75) {
            return "blocks puck with knee pads";
        } else {
            return "blocks puck with stick";
        }
    }
    
      
}
