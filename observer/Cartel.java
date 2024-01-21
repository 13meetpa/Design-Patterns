package observer;
/**
 * The Cartel class represents a criminal organization that observes and logs
 * sightings reported by a Cook class.
 * @author Meetkumar Patel 
 */
import java.util.ArrayList;

public class Cartel implements Observer {
    
    private Subject cook;
    private ArrayList<Sighting> sightings;
    /**
     * Constructs a Cartel object with the specified Cook subject
     * @param cook The Cook subject to observe
     */

    public Cartel(Subject cook)
    {
        this.cook = cook;
        this.sightings = new ArrayList<>();
        cook.registerObserver(this);
    }
    /**
     * Updates the Cartel with new sighting information.
     * 
     * @param location  The location of the sighting
     * @param description A description of the sighting
     * @param accomplices A list of accomplices involved in the sighting.
     */
    public void update(String location, String description, ArrayList<String> accomplices)
    {
        Sighting sighting = new Sighting(location, description, accomplices);
        sightings.add(sighting);
    }
    /**
     * Gets the log of sightings formatted for the Cartel.
     * 
     * @return A formatted log of sightings.
     */
    public String getLog()
    {
        StringBuilder log = new StringBuilder();
        for (Sighting sighting : sightings) {
            log.append(sighting.getLocation()).append(" (").append(sighting.getDetails()).append("), with ");
            log.append(String.join(", ", sighting.getAccomplices())).append("\n");
        }
        return log.toString();

    }
 }


