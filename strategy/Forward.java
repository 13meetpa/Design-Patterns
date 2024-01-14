package strategy;
import java.util.Random;
public class Forward extends Player {

     public Forward(String firstName, String lastName) {
        super(firstName, lastName);
        setDefenceBehavior();
        setOffenceBehavior();
    }

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

    @Override
    public String toString() {
        return super.toString() + " plays the position: Forward";
    }
}



