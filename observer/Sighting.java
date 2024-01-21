package observer;

import java.util.ArrayList;
/**
 * The Sighting class represents information about a reported sighting.
 * @author Meetkumar Patel
 */
public class Sighting {
    
    private String location;
    private String details;
    private ArrayList<String> accomplices;

    /**
     * Constructs a Sighting object with the specified location, details, and accomplices.
     * @param location  The location of the sighting.
     * @param details   Details about the sighting.
     * @param accomplices   A list of accomplices involved in the sighting.
     */
    public Sighting(String location, String details, ArrayList<String> accomplices)
    {
        this.location = location;
        this.details = details;
        this.accomplices = accomplices;
    }
     /**
     * Gets the location of the sighting.
     *
     * @return The location of the sighting.
     */
    public String getLocation()
    {
        return location;
    }
    /**
     * Gets details about the sighting.
     *
     * @return Details about the sighting.
     */
    public String getDetails()
    {
        return details;
    }
     /**
     * Gets a formatted string of accomplices involved in the sighting.
     *
     * @return A string containing accomplices, separated by commas.
     */
    public String getAccomplices()
    {
        return String.join(", ", accomplices);
    }
}
