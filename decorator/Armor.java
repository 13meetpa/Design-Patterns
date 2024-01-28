package decorator;

import java.util.ArrayList;
/**
 * Armor class represents a decorator for a player object that adds armor decoration.
 * Armor enhances the appearance and attribues of the player.
 * It inherits from the PlayerDecorator class.
 */
public class Armor extends PlayerDecorator {
    
    /**
     * Constructs an Armor object that decorates the given player with armor.
     * Reads armor decoration details from the specified file and integrates them into the player's appearance.
     * @param player the player object to be decorated with armor
     */
    public Armor(Player player) {
        super(player); 
        ArrayList<String> armorDecor = FileReader.getLines("decorator/txt/armor.txt");
        integrateDecor(armorDecor);
 
    }
    
}
