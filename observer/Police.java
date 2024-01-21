package observer;
/**
 * The Police class respresnts law enforcement authorities that observe
 * and log information related to criminal activites reported by a Cook.
 * @author Meetkumar Patel
 */
import java.util.ArrayList;

public class Police implements Observer {
    
    private Subject cook;
    private ArrayList<String> locations;
    private String notes;
    private ArrayList<String> people;
    /**
     * Constructs a Police object with specified Cook subject.
     * @param cook The Cook subject to observe.
     */
    public Police(Subject cook)
    {
        this.cook = cook;
        this.locations = new ArrayList<>();
        this.notes = "";
        this.people = new ArrayList<>();
        cook.registerObserver(this);
    }
    /**
    * Updates the Police with new information.
    *
    * @param location     The location of the information.
    * @param description  A description of the information.
    * @param accomplices  A list of accomplices involved in the information.
    */
    public  void update(String location, String description, ArrayList<String> accomplices)
    {
        locations.add(location);
        notes += description + "\n";
        people.addAll(accomplices);
    }
    /**
    * Gets the log of information formatted for the Police.
    *
    * @return A formatted log of information.
    */
    public String getLog()
    {
        StringBuilder log = new StringBuilder("Locations:\n");
        for (String location : locations) {
            log.append("- ").append(location).append("\n");
        }

        log.append("\nNotes:\n");
        String[] notesArray = notes.split("\n");
        for (String note : notesArray) {
            log.append("- ").append(note.trim()).append("\n");
        }

        log.append("\nAccomplices:\n");
        for (String person : people) {
            log.append("- ").append(person).append("\n");
        }

        return log.toString();

    }
}


