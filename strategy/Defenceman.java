package strategy;
/**
* A class representing a defenceman player in the hockey game.
 */
         
public class Defenceman extends Player {
    /**
     * Constructs a new Defenceman with the given first and last names.
     *
     * @param firstName The first name of the defenceman.
     * @param lastName  The last name of the defenceman.
     */
    public Defenceman(String firstName, String lastName) {
        super(firstName, lastName);
        setDefenceBehavior();
        setOffenceBehavior();
    }

     /**
     * Sets the defensive behavior for the defenceman.
     * 50% chance of setting to ChasePuckBehavior, 50% chance to BlockBehavior.
     */
    @Override
    public void setDefenceBehavior() {
        // 50% chance of setting to ChasePuckBehavior, 50% chance to BlockBehavior
        if (rand.nextBoolean()) {
            this.defenceBehavior = new ChasePuckBehavior();
        } else {
            this.defenceBehavior = new BlockBehavior();
        }
    }

    /**
     * Sets the offensive behavior for the defenceman.
     * 90% chance of setting to PassBehavior, 10% chance to SlapShotBehavior.
     */
    @Override
    public void setOffenceBehavior() {
        // 90% chance of setting to PassBehavior, 10% chance to SlapShotBehavior
        if (rand.nextDouble() < 0.9) {
            this.offenceBehavior = new PassBehavior();
        } else {
            this.offenceBehavior = new SlapShotBehavior();
        }
    }
     /**
     * Returns a string representation of the defenceman.
     *
     * @return A string containing the defenceman's full name and position.
     */
    @Override
    public String toString() {
        return super.toString() + " plays the position: Defenceman";
    }

}
