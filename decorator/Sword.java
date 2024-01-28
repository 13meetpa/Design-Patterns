package decorator;

import java.util.ArrayList;
/**
 * Sword class represents a decorator for a player object that adds sword decoration.
 * Sword enhances the appearance and attributes of the player.
 * It inherits from the PlayerDecorator class.
 */

public class Sword extends PlayerDecorator {
    /**
     * Constructs a Sword object that decorates the given player with a sword.
     * Reads sword decoration details from the specified file and integrates them into the player's appearance.
     * @param player the player object to be decorated with a sword
     */
    public Sword(Player player) {
        super(player); 
        ArrayList<String> swordDecor = FileReader.getLines("decorator/txt/sword.txt");
        integrateDecor(swordDecor);
    }
    
}

