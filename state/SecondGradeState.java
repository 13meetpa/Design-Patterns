package state;

public class SecondGradeState extends State{

    public SecondGradeState(SpellingList spellingList) {
        super(spellingList);
        this.words = FileReader.getWords("state/txt/second.txt");

    }
    public void increaseGrade() {
        System.out.println("Moving to Third Grade...");
        spellingList.setState(spellingList.getThirdGradeState());

    }
    
    public void decreaseGrade() {
    System.out.println("Moving to First Grade...");
    spellingList.setState(spellingList.getFirstGradeState());

        
    }
}