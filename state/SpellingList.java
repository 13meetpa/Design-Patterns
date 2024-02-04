package state;
/**
 * Represents the state of a spelling list.
 */
public class SpellingList {

    private State state;
    private FirstGradeState firstGradeState;
    private SecondGradeState secondGradeState;
    private ThirdGradeState thirdGradeState;
    /**
     * Constrcuts a SpellingList object with default state set to first grade.
     */
   public SpellingList(){

    firstGradeState = new FirstGradeState(this);
    secondGradeState = new SecondGradeState(this);
    thirdGradeState = new ThirdGradeState(this);
    state = firstGradeState;
   }
   /**
    * Retrieves the next word from the current state's word list.
    * @return the next word from the current state's word list.
    */
   public String getNextWord(){
    return state.getNextWord();
    
   }
   /**
    * Increases the grade by transitioning to the next higher grade state.
    */
   public void increaseGrade() {
    state.increaseGrade();
   }
   /**
    * Decreases the grade by transitioning to the next lower grade state.
    */
   public void decreaseGrade() {
    state.decreaseGrade();
   }
   /**
    * Retrieves the state representing the first grade.
    * @return the state representing the first grade.
    */
   public State getFirstGradeState() {
    return firstGradeState;
   }
   /**
    * Retrieves the state representing the second grade.
    * @return the state representing the second grade.
    */
   public State getSecondGradeState() {
    return secondGradeState;
   }
   /**
    * Retrieves the state representing the third grade.
    * @return the state representing the third grade.
    */
   public State getThirdGradeState() {
     return thirdGradeState;
   }
   /**
    * Sets the current state of the SpellingList
    * @param state the state to be set.
    */
   public void setState(State state) {
     this.state = state;
   }
   
}