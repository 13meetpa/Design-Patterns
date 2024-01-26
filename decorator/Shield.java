package decorator;

import java.util.ArrayList;

public class Shield extends PlayerDecorator {

    public Shield(Player player) {
        super(player); // Call the constructor of the base class

        // Read decorative lines specific to Shield from shield.txt
        ArrayList<String> shieldDecor = FileReader.getLines("decorator/txt/shield.txt");

        // Add the decorative lines to the player's lines
        integrateDecor(shieldDecor);
    }
    
}
