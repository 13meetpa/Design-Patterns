package observer;

import java.util.ArrayList;
/**
 * The Observer interface represents a entity that can observe and log information 
 * provided by a subject.
 * @author Meetkumar Patel 
 */
public interface Observer {
    /**
     * Updates the observer with new information.
     * @param location  The location of the information.
     * @param description   A description of the information.
     * @param accomplices   A list of accomplices involved in the information.
     */
    public void update(String location, String description, ArrayList<String> accomplices);
    /**
     * Gets the log of information formatted for the observer.
     * @return  A formatted log of information.
     */
    public String getLog();
}
