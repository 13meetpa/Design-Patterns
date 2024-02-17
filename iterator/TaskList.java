package iterator;

public class TaskList {
    private Ticket[] tickets;
    private int count;
    private String name;

    public TaskList(String name) {
        this.name = name;
        tickets = new Ticket[100]; // Initial capacity, adjust as needed
        count = 0;
    }

    public void addTicket(String name, String teamMember, int difficulty) {
        Ticket ticket = new Ticket(name, teamMember, difficulty);
        addTicket(ticket);
    }

    public void addTicket(Ticket ticket) {
        if (count < tickets.length) {
            tickets[count++] = ticket;
        }
    }
    
    public Ticket getTicket(String name) {
        for (int i = 0; i < count; i++) {
            if (tickets[i] != null && tickets[i].getName().equalsIgnoreCase(name)) {
                Ticket ticketToRemove = tickets[i];
                // Remove the ticket from the list
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

    public TaskListIterator createIterator() {
        return new TaskListIterator(tickets);
    }

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
