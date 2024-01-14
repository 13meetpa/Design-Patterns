package strategy;
/**
 * An offensive behavior representing shooting at the goal in the hockey game.
 * Implements the OffenceBehavior interface.
 */
public class ShootBehavior implements  OffenceBehavior {
    /**
     * Performs an offensive play action by shooting at the goal.
     *
     * @return A string representing the offensive play action.
     */
    public String play()
    {
        return "Shoots at the goal";
    }
}
