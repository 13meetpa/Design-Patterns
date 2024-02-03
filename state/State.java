public abstract class State{

protected SpellingList spellingList;
protected ArrayList<String> words;
private Random rand;

public State(SpellingList spellingList) {
    
}

public String getNextWord(){

}
public abstract void increaseGrade();
public abstract void decreaseGrade();

}