package strategy;

import java.util.Random;

public abstract class Player {
    private String firstName;
    private String lastName;
    protected DefenceBehavior defenceBehavior;
    protected OffenceBehavior offenceBehavior;
    protected Random rand;

    public Player(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        rand = new Random();
        setDefenceBehavior();
        setOffenceBehavior();
        
    }
    public abstract void setDefenceBehavior();

    public abstract void setOffenceBehavior();

    public String play(boolean possession) {
        if (possession) {
            // If the team has possession, perform offense behavior
            return offenceBehavior.play();
        } else {
            // If the team doesn't have possession, perform defense behavior
            return defenceBehavior.play();
        }
    }
    
    public String toString() {
        return  firstName + " " + lastName;
    }


}


