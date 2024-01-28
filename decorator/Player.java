package decorator;

import java.util.ArrayList;
/**
 * Player class represents the base component in the player decoration system.
 * It defines the basic properties and behaviors of a player.
 */
public abstract class  Player {

    protected String name;
    protected ArrayList<String> lines;
    /**
     * Constructs a Player object with the specified lines of appearance details and name.
     * @param lines an ArrayList containing appearance details of the player
     * @param name the name of the player
     */
    public Player(ArrayList<String> lines, String name) {

        this.lines = lines;
        this.name = name;

    }

    /**
     * Retrieves the name of the player
     * @return the name of the player
     */
    public String getName() {
        return name;
    }
    /**
     * Provides a string representation of the player's appearance.
     * @return a string representing the player's appearance
     */
    public String toString() {
        StringBuilder playerRepresentation = new StringBuilder();
        playerRepresentation.append(name).append("\n");
        for (String line : lines) {
            playerRepresentation.append(line).append("\n");
        }

        return playerRepresentation.toString();

    }
        
    
}