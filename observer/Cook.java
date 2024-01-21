package observer;

import java.util.ArrayList;
import java.util.List;
/**
 * The Cook class represents a character who can report sightings to
 * observers(e.g., Police, Cartel).
 * 
 * @author Meetkumar Patel
 */
public class Cook implements Subject {

   private ArrayList<Observer> observers;
   private String name;
   /**
    * Constructs a Cook object with the specified name
    * @param name The name of the Cook.
    */
   public Cook(String name)
   {
      this.name = name;
      this.observers = new ArrayList<>();

   }
   /**
    * Registers an observer to receive updates from the Cook.
    * @param observer The observer to register.
    */
   public void registerObserver(Observer observer)
   {
      observers.add(observer);
   }
   /**
    * Removes an observer from the list of registered observers.
    * @param observer The observer to remove.
    */
   public void removeObserver(Observer observer)
   {
      observers.remove(observer);
   }
   /**
    * Notifies all registered observers with the given sighting information.
    * @param location   The location of the sighting.
    * @param description   A description of the sighting.
    * @param accomplices A list of accomplices involved in the sighting.
    */
   public void notifyObservers(String location, String description, ArrayList<String> accomplices )
   {
      for (Observer observer : observers) {
         observer.update(location, description, accomplices);
     }
   }
   /**
     * Reports a sighting to all registered observers.
     *
     * @param location     The location of the sighting.
     * @param description  A description of the sighting.
     * @param accomplices  A comma-separated string of accomplices involved in the sighting.
     */
   public void enterSighting(String location, String description, String accomplices)
   {
      notifyObservers(location, description, new ArrayList<>(List.of(accomplices)));
   }
   /**
    * Gets the name of the Cook.
    * @return The name of the Cook.
    */
   public String getName()
   {
      return name;
   }
     
}
