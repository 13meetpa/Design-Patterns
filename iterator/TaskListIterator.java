package iterator;

public class TaskListIterator implements Iterator {
    private Ticket[] tickets;
    private int position;

    public TaskListIterator(Ticket[] tickets) {
        this.tickets = tickets;
        position = 0;
    }
    
    public boolean hasNext() {
        return position < tickets.length && tickets[position] != null;
    }
    public Ticket next() {
        return tickets[position++];
    }
}
