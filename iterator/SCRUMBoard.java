package iterator;
/**
 * Represents a SCRUM board for managing tasks
 */
public class SCRUMBoard {
    private String projectName;
    private TaskList todo;
    private TaskList doing;
    private TaskList done;
    /**
     * Constructs a SCRUM board with the given project name
     * @param projectName the name of the project
     */
    public SCRUMBoard(String projectName) {
        this.projectName = projectName;
        todo = new TaskList("ToDo");
        doing = new TaskList("Doing");
        done = new TaskList("Done");
    }
    /**
     * Adds a new ticket to the ToDo list of the SCRUM board
     * @param name the name of the ticket
     * @param teamMember the team member assigned to the ticket
     * @param difficulty the difficuly level of the ticket
     */
    public void addTicket(String name, String teamMember, int difficulty) {
        Ticket ticket = new Ticket(name, teamMember, difficulty);
        todo.addTicket(ticket);
    }
    /**
     * Moves a ticket from the ToDo list to the Doing list
     * @param name the name of the ticket to start 
     * @return true if the ticket was sucessfully started, false otherwise
     */
    public boolean startTicket(String name) {
        Ticket ticket = todo.getTicket(name);
        if (ticket != null) {
            doing.addTicket(ticket);
            return true;
        } else {
            System.out.println("Ticket '" + name + "' not found in the ToDo list.");
            return false;
        }
    }
    /**
     * Moves a ticket from the Doing list to the Done list
     * @param name the name of the ticket to finish 
     * @return true if the ticket was sucessfully finshed, false otherwise
     */
    public boolean finishTicket(String name) {
        Ticket ticket = doing.getTicket(name);
        if (ticket != null) {
            done.addTicket(ticket);
            return true;
        } else {
            System.out.println("Ticket '" + name + "' not found in the Doing list.");
            return false;
        }
    }
    /**
     * Generates a string representation of the SCRUM board
     * @return a string representation of the SCRUM board
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("***** ").append(projectName).append(" *****\n");
        sb.append(todo).append("\n");
        sb.append(doing).append("\n");
        sb.append(done);
        return sb.toString();
    }
}


