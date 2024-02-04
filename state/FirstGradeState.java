package state;
/**
 * Represents the state of a spelling list for the first grade.
 */
public class FirstGradeState extends State{
    /**
     * Constructs a FirstGradeState object with the specified spelling list.
     * @param spellingList the spelling list to be associated with the first grade state.
     */
    public FirstGradeState(SpellingList spellingList) {
        super(spellingList);
        this.words = FileReader.getWords("state/txt/first.txt");
    }
    /**
     * Increases the grade to the second grade.
     */
    public void increaseGrade(){
        System.out.println("Moving to Second Grade...");
        spellingList.setState(spellingList.getSecondGradeState());

    }
    /**
     * Decreases the grade (not applicable for the first grade).
     */
    public void  decreaseGrade() {
        System.out.println("You can't go below first grade");
    }

}