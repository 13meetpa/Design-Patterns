package iterator;
/**
 * Represents a ticket with a name, team member, and difficulty level
 */
public class Ticket {
    private String name;
    private String teamMember;
    private int difficulty;
    /**
     * Constructs a ticket with the given name, team member, and difficulty level
     * @param name the name of the ticket
     * @param teamMember the team member assigned to the ticket
     * @param difficulty the difficuly level of the ticket
     */
    public Ticket(String name, String teamMember, int difficulty) {
        this.name = name;
        this.teamMember = teamMember;
        this.difficulty = difficulty;
    }
    /**
     * Retrieves the name of the ticket
     * @return the name of the ticket
     */
    public String getName() {
        return name;
    }
    /**
     * Generates a string representation of the ticket
     * @return a string representation of the ticket
     */
    public String toString() {
        return name + "(" + difficulty + ") - " + teamMember;
    }
}
