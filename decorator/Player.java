package decorator;

import java.util.ArrayList;

public abstract class  Player {

    protected String name;
    protected ArrayList<String> lines;

    public Player(ArrayList<String> lines, String name) {

        this.lines = lines;
        this.name = name;

    }


    public String getName() {
        return name;
    }

    public String toString() {
        StringBuilder playerRepresentation = new StringBuilder();

        // Add player name
        playerRepresentation.append(name).append("\n");

        // Add player lines
        // playerRepresentation.append("Lines:\n");
        for (String line : lines) {
            playerRepresentation.append(line).append("\n");
        }

        return playerRepresentation.toString();

    }
        
    
}