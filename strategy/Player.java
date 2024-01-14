package strategy;

import java.util.Random;
/**
 * The abstract base class for all players in the hockey game.
 */
public abstract class Player {
    private String firstName;
    private String lastName;
    protected DefenceBehavior defenceBehavior;
    protected OffenceBehavior offenceBehavior;
    protected Random rand;

    /**
     * Constructs a new Player with the given first and last names.
     *
     * @param firstName The first name of the player.
     * @param lastName  The last name of the player.
     */
    public Player(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        rand = new Random();
        setDefenceBehavior();
        setOffenceBehavior();
        
    }
    /**
     * Sets the defensive behavior for the player.
     */
    public abstract void setDefenceBehavior();

    /**
     * Sets the offensive behavior for the player.
     */
    public abstract void setOffenceBehavior();

    /**
     * Plays the game based on possession status.
     *
     * @param possession true if the team has possession, false otherwise.
     * @return A string representing the action performed.
     */
    public String play(boolean possession) {
        if (possession) {
            // If the team has possession, perform offense behavior
            return offenceBehavior.play();
        } else {
            // If the team doesn't have possession, perform defense behavior
            return defenceBehavior.play();
        }
    }
    
     /**
     * Returns a string representation of the player.
     *
     * @return The player's full name.
     */
    public String toString() {
        return  firstName + " " + lastName;
    }


}


