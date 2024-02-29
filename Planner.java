import java.util.Stack;

public class Planner {
    private Stack<Action> goalStack;
    private Stack<Action> moveStack;
    public Planner() {
        this.moveStack = new Stack<Action>();
        this.goalStack = new Stack<Action>();
    }
    public Stack<Action> getMoveStack() {
        return moveStack;
    }
    public Stack<Action> getGoalStack() {
        return goalStack;
    }
}
