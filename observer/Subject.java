package observer;

import java.util.ArrayList;
/**
 * The Subject interface represents an entity that can be observed by observers.
 * It defines methods to register, remove, and notify observers.
 * @author Meetkumar Patel
 */
public interface Subject {
    /**
     * Registers an observer to receive updates from the subject.
     * @param observer The observer to register.
     */
    public void registerObserver(Observer observer);
    /**
     * Removes an observer from the list of registered observers.
     * @param observer  The observer to remove.
     */
    public void removeObserver(Observer observer);
    /**
     * Notifies all registered observers with the given sighting information.
     * @param location  The location of the sighting.
     * @param description   A description of the sighting.
     * @param accomplices   A list of accomplices involved in the sighting.
     */
    public void  notifyObservers(String location, String description, ArrayList<String> accomplices);
}
