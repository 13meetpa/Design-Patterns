package iterator;
/**
 * Represents a list of tasks
 */
public class TaskList {
    private Ticket[] tickets;
    private int count;
    private String name;
    /**
     * Constructs a TaskList with the given name
     * @param name the name of the task list
     */
    public TaskList(String name) {
        this.name = name;
        tickets = new Ticket[100]; 
        count = 0;
    }
    /**
     * Adds a new ticket to the task list
     * @param name the name of the ticket
     * @param teamMember the team member assigned to the ticket
     * @param difficulty the difficulty level of the ticket 
     */
    public void addTicket(String name, String teamMember, int difficulty) {
        Ticket ticket = new Ticket(name, teamMember, difficulty);
        addTicket(ticket);
    }
    /**
     * Adds a ticket to the task list
     * @param ticket the ticket to be added
     */
    public void addTicket(Ticket ticket) {
        if (count < tickets.length) {
            tickets[count++] = ticket;
        }
    }
    /**
     * Retrieves a ticket from the task list by name
     * @param name the name of the ticket to retrieve
     * @return the ticket with the specified name, or null if not found
     */
    public Ticket getTicket(String name) {
        for (int i = 0; i < count; i++) {
            if (tickets[i] != null && tickets[i].getName().equalsIgnoreCase(name)) {
                Ticket ticketToRemove = tickets[i];
                for (int j = i; j < count - 1; j++) {
                    tickets[j] = tickets[j + 1];
                }
                tickets[count - 1] = null;
                count--;
                return ticketToRemove;
            }
        }
        return null;
    }
    /**
     * Creates an iterator for the task list
     * @return a TaskListIterator for iterating over the tickets
     */
    public TaskListIterator createIterator() {
        return new TaskListIterator(tickets);
    }
    /**
     * Generates a string represntation of the task list
     * @return a string represntation of the task list
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(":\n");
        for (int i = 0; i < count; i++) {
            if (tickets[i] != null) {
                sb.append("- ").append(tickets[i]).append("\n");
            }
        }
        return sb.toString();
    }
}
