package iterator;

public class SCRUMBoard {
    private String projectName;
    private TaskList todo;
    private TaskList doing;
    private TaskList done;

    public SCRUMBoard(String projectName) {
        this.projectName = projectName;
        todo = new TaskList("ToDo");
        doing = new TaskList("Doing");
        done = new TaskList("Done");
    }

    public void addTicket(String name, String teamMember, int difficulty) {
        Ticket ticket = new Ticket(name, teamMember, difficulty);
        todo.addTicket(ticket);
    }

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


