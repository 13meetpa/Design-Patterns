package strategy;
/**
 * A class representing a goalie player in the hockey game.
 */
public class Goalie extends Player {


    /**
     * Constructs a new Goalie with the given first and last names.
     *
     * @param firstName The first name of the goalie.
     * @param lastName  The last name of the goalie.
     */
    public Goalie(String firstName, String lastName)
    {
        super(firstName, lastName);
        setDefenceBehavior();
        setOffenceBehavior();
    }
    /**
     * Sets the defensive behavior for the goalie to BlockGoalBehavior.
     */
    public void setDefenceBehavior() {
        this.defenceBehavior = new BlockGoalBehavior();
    }
    /**
     * Sets the offensive behavior for the goalie to BlockGoalBehavior.
     */
    public void setOffenceBehavior() {
        this.offenceBehavior = new BlockGoalBehavior();
    }
    /**
     * Returns a string representation of the goalie.
     *
     * @return A string containing the goalie's full name and position.
     */
    public String toString()
    {
        return super.toString() + " plays the position: Goalie";
    }

}