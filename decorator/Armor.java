package decorator;

import java.util.ArrayList;

public class Armor extends PlayerDecorator {
    
    public Armor(Player player) {
        super(player); // Call the constructor of the base class

        // Read decorative lines specific to Armor from armor.txt
        ArrayList<String> armorDecor = FileReader.getLines("decorator/txt/armor.txt");

        // Add the decorative lines to the player's lines
        integrateDecor(armorDecor);
 
    }
    
}
