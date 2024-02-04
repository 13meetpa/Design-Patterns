package state;

import java.util.ArrayList;
import java.util.Random;
/**
 * Represents the abstract state of a spelling list.
 */
public abstract class State{
protected SpellingList spellingList;
protected ArrayList<String> words;
private Random rand;
/**
 * Constructs a State object with the specified spelling list.
 * @param spellingList the spelling list associated with the state.
 */
public State(SpellingList spellingList) {
    this.spellingList = spellingList;
    this.rand = new Random();
    this.words = new ArrayList<>();
}
/**
 * Retrieves the next word from the list of words.
 * @return the next word from the list of words.
 */
public String getNextWord(){

    if(!words.isEmpty()) {
        int index = rand.nextInt(words.size());
        String nextWord = words.remove(index);
        return nextWord;
    } 
    else {
        return "No words available";
    }

}
/**
 * Increases the grade (to be implemented by subclasses)
 */
public abstract void increaseGrade();
/**
 * Decreases the grade (to be implemented by subclasses).
 */
public abstract void decreaseGrade();

}