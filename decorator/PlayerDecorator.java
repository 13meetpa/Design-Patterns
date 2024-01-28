package decorator;

import java.util.ArrayList;
/**
 * PlayerDecorator class represents an abstract decorator for player objects.
 * It extends the Player class and provides methods to integrate decoration details.
 */
public abstract class PlayerDecorator extends Player {

    /**
     * Constructs a PlayerDecorator object for the given player.
     * @param player the player object to be decorated
     */
    public PlayerDecorator(Player player) {
        super(player.lines, player.getName());
    }
    /**
     * Integrates decoration details into the player's appearance.
     * This method modifies the appearance lines of the player based on the decoration details provided.
     * @param decor an ArrayList containing decoration details to be integrated
     */
    protected void integrateDecor(ArrayList<String> decor) {
        for (int i = 0; i < decor.size(); i++) {
            String line = "";
            int minLength = Math.min(decor.get(i).length(), lines.get(i).length());

            for (int j = 0; j < minLength; j++) {
                if (decor.get(i).charAt(j) != ' ') {
                    line += decor.get(i).charAt(j);
                } else {
                    line += lines.get(i).charAt(j);
                }
            }

            if (decor.get(i).length() > lines.get(i).length()) {
                line += decor.get(i).substring(lines.get(i).length());
            } else if (decor.get(i).length() < lines.get(i).length()) {
                line += lines.get(i).substring(decor.get(i).length());
            }

            lines.set(i, line);
        }
    }
}





