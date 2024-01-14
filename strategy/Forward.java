package strategy;
import java.util.Random;

/**
 * A class representing a forward player in the hockey game.
 */
public class Forward extends Player {

    /**
     * Constructs a new Forward with the given first and last names.
     *
     * @param firstName The first name of the forward.
     * @param lastName  The last name of the forward.
     */
     public Forward(String firstName, String lastName) {
        super(firstName, lastName);
        setDefenceBehavior();
        setOffenceBehavior();
    }


    /**
     * Sets the defensive behavior for the forward.
     * 50% chance of setting to ChasePuckBehavior, 50% chance to BlockBehavior.
     */
    @Override
    public void setDefenceBehavior() {
        Random rand = new Random(); // Initialize rand
        // 50% chance of setting to ChasePuckBehavior, 50% chance to BlockBehavior
        if (rand.nextBoolean()) {
            this.defenceBehavior = new ChasePuckBehavior();
        } else {
            this.defenceBehavior = new BlockBehavior();
        }
    }
     /**
     * Sets the offensive behavior for the forward.
     * 50% chance of setting to PassBehavior, 50% chance to ShootBehavior.
     */
    @Override
    public void setOffenceBehavior() {
        Random rand = new Random(); // Initialize rand
        // 50% chance of setting to PassBehavior, 50% chance to ShootBehavior
        if (rand.nextBoolean()) {
            this.offenceBehavior = new PassBehavior();
        } else {
            this.offenceBehavior = new ShootBehavior();
        }
    }
    /**
     * Returns a string representation of the forward.
     *
     * @return A string containing the forward's full name and position.
     */
    @Override
    public String toString() {
        return super.toString() + " plays the position: Forward";
    }
}



