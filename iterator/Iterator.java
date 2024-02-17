package iterator;
/**
 * An interface representing an iterator for iterating over a collection of tickets
 */
public interface Iterator {
    /**
     * Checks if there is a next ticket available in the iterator
     * @return true if there is a next ticket, false otherwise
     */
    boolean hasNext();
    /**
     * Retrieves the next ticket in the iterator
     * @return
     */
    Ticket next();
}
