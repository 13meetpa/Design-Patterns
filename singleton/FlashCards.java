import java.util.ArrayList;
import java.util.Random;
/**
 * The FlashCards class represents a collection of flashcards containing words
 * It provoids functionlity to retrieve random words from the colleaction
 */
public class FlashCards {
    private Random rand;
    private static FlashCards flashCards;
    private ArrayList<Word> words;
    private Word currentWord;
    /**
     * Constructs a new FlashCards object with random number generator and initializes the word collection
     * This constructor is private to enforce singleton design pattern
     */
    private FlashCards() {
        rand = new Random();
        words = FileReader.getWords();
        currentWord = null;
    }

    /**
     * Retrieves the singleton instance of the FlashCards class
     * @return The singleton instance of the FlashCards class
     */
    public static FlashCards getInstance() {
        if (flashCards == null) {
            flashCards = new FlashCards();
        }
        return flashCards;
    }
    /**
     * Retrieves a random word from the word collection
     * If no words are available, it prints a message and returns null
     * @return A random Word object from the collection
     */
    public Word getWord() {
        if (words.isEmpty()) {
            System.out.println("No words available.");
            return null;
        }

        if (currentWord != null) {
            words.remove(currentWord);
        }

        int randomIndex = rand.nextInt(words.size());
        currentWord = words.get(randomIndex);

        return currentWord;
    }
}