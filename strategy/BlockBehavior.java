package strategy;

import java.util.Random;
/**
 * A defensive behavior representing blocking actions in the hockey game.
 * Implements the DefenceBehavior interface.
 */
public class BlockBehavior implements DefenceBehavior  {
     /**
     * Performs a defensive play action, such as blocking the opponent.
     *
     * @return A string representing the defensive play action.
     */
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
