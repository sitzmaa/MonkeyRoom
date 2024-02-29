import java.util.Scanner;
import java.util.Stack;
public class Speaker {
    private Scanner scan;
    public Speaker() {
        this.scan = new Scanner(System.in);
    }

    public void printBar() {
        System.out.printf("=================================================\n\n");
    }
    public String promptUserRoom(String object) {
        System.out.printf("Select which room the %s starts in:\n"+
        "[1] Room A\n" +
        "[2] Room B\n" +
        "[3] Room C\n" +
        "==> ", object);
        return scan.nextLine();
    }
    public void printPlan(Planner plan) {
        Stack<Action> moves = plan.getMoveStack();
        System.out.println("Plan:");
        Action nextMove = moves.pop();
        while (nextMove!=null) {
            System.out.printf("%s()\n", nextMove.getOp());
            nextMove = moves.pop();
        }
        System.out.println();
    }
}