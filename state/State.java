package state;

import java.util.ArrayList;
import java.util.Random;

public abstract class State{
protected SpellingList spellingList;
protected ArrayList<String> words;
private Random rand;

public State(SpellingList spellingList) {
    this.spellingList = spellingList;
    this.rand = new Random();
    this.words = new ArrayList<>();
}

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
public abstract void increaseGrade();
public abstract void decreaseGrade();

}