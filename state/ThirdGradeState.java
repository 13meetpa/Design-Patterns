package state;
public class ThirdGradeState extends State{
    public ThirdGradeState(SpellingList spellingList) {
        super(spellingList);
        this.words = FileReader.getWords("state/txt/third.txt");
    }
    public void increaseGrade() {
        System.out.println("Sorry, we currently only up third grade in our system");
    }
    public void decreaseGrade() {
        System.out.println("Moving to Second Grade...");
        spellingList.setState(spellingList.getSecondGradeState());

    }
}