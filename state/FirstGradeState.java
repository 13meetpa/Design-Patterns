package state;
public class FirstGradeState extends State{
    public FirstGradeState(SpellingList spellingList) {
        super(spellingList);
        this.words = FileReader.getWords("state/txt/first.txt");
    }

    public void increaseGrade(){
        System.out.println("Moving to Second Grade...");
        spellingList.setState(spellingList.getSecondGradeState());

    }

    public void  decreaseGrade() {
        System.out.println("You can't go below first grade");
    }

}