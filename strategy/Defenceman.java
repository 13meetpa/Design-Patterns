package strategy;

public class Defenceman extends Player {
    
    public Defenceman(String firstName, String lastName) {
        super(firstName, lastName);
        setDefenceBehavior();
        setOffenceBehavior();
    }

    
    public void setDefenceBehavior() {
        // 50% chance of setting to ChasePuckBehavior, 50% chance to BlockBehavior
        if (rand.nextBoolean()) {
            this.defenceBehavior = new ChasePuckBehavior();
        } else {
            this.defenceBehavior = new BlockBehavior();
        }
    }

   
    public void setOffenceBehavior() {
        // 90% chance of setting to PassBehavior, 10% chance to SlapShotBehavior
        if (rand.nextDouble() < 0.9) {
            this.offenceBehavior = new PassBehavior();
        } else {
            this.offenceBehavior = new SlapShotBehavior();
        }
    }

    //@Override
    public String toString() {
        return super.toString() + " plays the position: Defenceman";
    }

}
