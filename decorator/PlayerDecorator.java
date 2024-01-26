package decorator;

import java.util.ArrayList;

public abstract class PlayerDecorator extends Player {

    private Player player;

    public PlayerDecorator(Player player) {
       
        super(new ArrayList<>(),player.getName());
        // super( player.lines,player.getName());
        
        this.player = player;
        

    }
    
    protected void integrateDecor(ArrayList<String> decor) {
        // Initialize lines with empty strings if it's empty
         if (lines.isEmpty()) {
       for (int i = 0; i < decor.size(); i++) {
          lines.add("");
        }
     }
    
    for (int i = 0; i < decor.size(); i++) {
        String line = ""; // Initialize an empty string for the merged line
        for (int j = 0; j < decor.get(i).length(); j++) {
            if (decor.get(i).charAt(j) != ' ') { // If the character in decor is not a space
                if (lines.get(i).length() > j) { // If the current line has characters left
                    // Append the character from decor
                    line += decor.get(i).charAt(j);
                } else { // If the current line is shorter than the decor line
                    // Append the character from decor as the line is too short
                    line += decor.get(i).charAt(j);
                }
            } else { // If the character in decor is a space
                if (lines.get(i).length() > j) { // If the current line has characters left
                    // Append the character from the current line
                    line += lines.get(i).charAt(j);
                } else { // If the current line is shorter than the decor line
                    // Append a space as the line is too short
                    line += ' ';
                }
            }
        }
        // Set the merged line back to the lines list
        lines.set(i, line);
    }
    // for (int i = 0; i < decor.size(); i++) {
    //     String line = "";
    //     for (int j = 0; j < decor.get(i).length(); j++) {
    //         if (decor.get(i).charAt(j) != ' ') {
    //             line += decor.get(i).charAt(j);
    //         } else if (lines.get(i).length() > j) {
    //             line += lines.get(i).charAt(j);
    //         }
    //     }
    //     lines.set(i, line);
    // }
}
    
    }

