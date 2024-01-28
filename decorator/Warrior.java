package decorator;
/**
 * Warrior class represents a specific type of player in the game.
 * It inherits from the Player class and provides specific behavior for a warrior player.
 */
public class Warrior extends Player {
    /**
     * Constructs a Warrior object with the specified name and reads appearance details from a file.
     * @param name the name of the warrior players
     */
    public Warrior(String name) {
        super(FileReader.getLines("decorator/txt/warrior.txt"), name);
    }
        
    
}
