package decorator;

import java.util.ArrayList;
/**
 * Shield class represents a decorator for a player object that adds shield decoration.
 * Shield enhances the appearance and attributes of the player.
 * It inherits from the PlayerDecorator class.
 */
public class Shield extends PlayerDecorator {

    /**
     * Constructs a Shield object that decorates the given player with a shield.
     * Reads shield decoration details from the specified file and integrates them into the player's appearance.
     * @param player the player object to be decorated with a shield
     */
    public Shield(Player player) {
        super(player); 
        ArrayList<String> shieldDecor = FileReader.getLines("decorator/txt/shield.txt");
        integrateDecor(shieldDecor);
    }
    
}
