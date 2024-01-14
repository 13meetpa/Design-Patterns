package strategy;
/**
 * An offensive behavior representing taking a slap shot from the blue line in the hockey game.
 * Implements the OffenceBehavior interface.
 */
public class SlapShotBehavior implements OffenceBehavior {

    /**
     * Performs an offensive play action by shooting the puck from the blue line.
     *
     * @return A string representing the offensive play action.
     */
    public String play()
    {
        return "Shoots the puck from the blue line";
    }
    
}
