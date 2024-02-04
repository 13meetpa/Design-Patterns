package state;
/**
 * Represents the state of a spelling list for the second grade.
 */
public class SecondGradeState extends State{
    /**
     * Constructs a SecondGradeState object with the specified spelling list.
     * @param spellingList  the spelling list to be associated with the second grade state.
     */
    public SecondGradeState(SpellingList spellingList) {
        super(spellingList);
        this.words = FileReader.getWords("state/txt/second.txt");

    }
    /**
     * Increases the grade to the third grade.
     */
    public void increaseGrade() {
        System.out.println("Moving to Third Grade...");
        spellingList.setState(spellingList.getThirdGradeState());

    }
    /**
     * Decreases the grade to the first grade.
     */
    public void decreaseGrade() {
    System.out.println("Moving to First Grade...");
    spellingList.setState(spellingList.getFirstGradeState());

        
    }
}