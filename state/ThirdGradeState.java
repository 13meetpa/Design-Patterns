package state;
/**
 * Represents the state of a spelling list for the third grade.
 */
public class ThirdGradeState extends State{
    /**
     * Constructs a ThirdGradeState object with the specified spelling list.
     * @param spellingList the spelling list to be associated with the third grade state.
     */
    public ThirdGradeState(SpellingList spellingList) {
        super(spellingList);
        this.words = FileReader.getWords("state/txt/third.txt");
    }
    /**
     * Increases the grade (not applicable for the third grade).
     */
    public void increaseGrade() {
        System.out.println("Sorry, we currently only up third grade in our system");
    }
    /**
     * Decreases the grade to the second grade.
     */
    public void decreaseGrade() {
        System.out.println("Moving to Second Grade...");
        spellingList.setState(spellingList.getSecondGradeState());

    }
}