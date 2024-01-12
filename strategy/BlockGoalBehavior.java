package strategy;

import java.util.Random;

public class BlockGoalBehavior implements DefenceBehavior, OffenceBehavior {
    
    public String play()
    {
        String[] actions = {"hand blocks the puck", "catches the puck", "blocks puck with knee pads", "blocks puck with stick"};
        double[] probabilities = {0.25, 0.25, 0.25, 0.25};  // Equal probability for each action
        double randomValue = new Random().nextDouble();
        double cumulativeProbability = 0.0;

        for (int i = 0; i < actions.length; i++) {
            cumulativeProbability += probabilities[i];
            if (randomValue <= cumulativeProbability) {
                return actions[i];
            }
        }

        // Default return (should not happen if probabilities sum to 1)
        return actions[actions.length - 1];
    }
    
      
}
