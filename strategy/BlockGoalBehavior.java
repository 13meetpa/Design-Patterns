package strategy;

import java.util.Random;
/**
 * A behavior representing blocking actions related to goalkeeping in the hockey game.
 * Implements both DefenceBehavior and OffenceBehavior interfaces.
 */
public class BlockGoalBehavior implements DefenceBehavior, OffenceBehavior {
    /**
     * Performs a defensive or offensive play action related to goalkeeping.
     *
     * @return A string representing the defensive or offensive play action.
     */
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
