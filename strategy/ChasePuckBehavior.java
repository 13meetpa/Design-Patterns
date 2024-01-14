package strategy;
/**
 * A defensive behavior representing chasing the puck in the hockey game.
 * Implements the DefenceBehavior interface.
 */
public class ChasePuckBehavior implements DefenceBehavior {
    /**
     * Performs a defensive play action by chasing the puck.
     *
     * @return A string representing the defensive play action.
     */
    public String play()
    {
        return "Chases the puck";
    }
}
