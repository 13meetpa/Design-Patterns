import java.util.ArrayList;
import java.util.Random;

public class FlashCards {
    private Random rand;
    private static FlashCards flashCards;
    private ArrayList<Word> words;
    private Word currentWord;

    private FlashCards() {
        rand = new Random();
        words = FileReader.getWords();
        currentWord = null;
    }

    // Modified to be static
    public static FlashCards getInstance() {
        if (flashCards == null) {
            flashCards = new FlashCards();
        }
        return flashCards;
    }

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