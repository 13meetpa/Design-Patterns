package iterator;
/**
 * Represents an iterator for iterating over a collection of tickets
 */
public class TaskListIterator implements Iterator {
    private Ticket[] tickets;
    private int position;
    /**
     * Constructs a TaskListIterator with the given array of tickets
     * @param tickets the array of tickets to iterate over
     */
    public TaskListIterator(Ticket[] tickets) {
        this.tickets = tickets;
        position = 0;
    }
    /**
     * Checks if there is a next ticket available in the iterator 
     * @return true if there is a next ticket, false otherwise
     */
    public boolean hasNext() {
        return position < tickets.length && tickets[position] != null;
    }
    /**
     * Retrieves the next ticket in the iterator 
     * @return the next ticket
     */
    public Ticket next() {
        return tickets[position++];
    }
}
