package observer;

import java.util.ArrayList;

public class Police implements Observer {
    
    private Subject cook;
    private ArrayList<String> locations;
    private String notes;
    private ArrayList<String> people;

    public Police(Subject cook)
    {
        this.cook = cook;
        this.locations = new ArrayList<>();
        this.notes = "";
        this.people = new ArrayList<>();
        cook.registerObserver(this);
    }
    public  void update(String location, String description, ArrayList<String> accomplices)
    {
        locations.add(location);
        notes += description + "\n";
        people.addAll(accomplices);
    }
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


