package decorator;

import java.util.ArrayList;

public class Sword extends PlayerDecorator {

    public Sword(Player player) {
        super(player); // Call the constructor of the base class

        // Read decorative lines specific to Sword from sword.txt
        ArrayList<String> swordDecor = FileReader.getLines("decorator/txt/sword.txt");

        // Add the decorative lines to the player's lines
        integrateDecor(swordDecor);
    }
    
}

