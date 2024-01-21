package observer;

import java.util.ArrayList;
import java.util.List;

public class Cook implements Subject {

   private ArrayList<Observer> observers;
   private String name;

   public Cook(String name)
   {
      this.name = name;
      this.observers = new ArrayList<>();

   }
   public void registerObserver(Observer observer)
   {
      observers.add(observer);
   }
   public void removeObserver(Observer observer)
   {
      observers.remove(observer);
   }
   public void notifyObservers(String location, String description, ArrayList<String> accomplices )
   {
      for (Observer observer : observers) {
         observer.update(location, description, accomplices);
     }
 }
   public void enterSighting(String location, String description, String accomplices)
   {
      notifyObservers(location, description, new ArrayList<>(List.of(accomplices)));
   }
   public String getName()
   {
      return name;
   }
     
}
