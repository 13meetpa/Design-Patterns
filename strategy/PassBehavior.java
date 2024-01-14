package strategy;
/**
 * An offensive behavior representing passing the ball or puck in the hockey game.
 * Implements the OffenceBehavior interface.
 */
public class PassBehavior implements OffenceBehavior  {
    /**
     * Performs an offensive play action by passing the ball or puck to a forward.
     *
     * @return A string representing the offensive play action.
     */
    public String play()
    {
        return "Passes to a forward";
    }
}
