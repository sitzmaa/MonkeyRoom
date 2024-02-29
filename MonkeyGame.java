public class MonkeyGame {
    private WorldState initialState;
    private Speaker speak;
    private Planner plan;
    public MonkeyGame() {
        this.speak = new Speaker();
        this.plan = new Planner();
    }

    public void Start() {
        speak.printBar();
        String monkey,box,bananas;
        monkey = speak.promptUserRoom("monkey");
        box = speak.promptUserRoom("box");
        bananas = speak.promptUserRoom("banana");
        initialState = new WorldState(monkey, box, bananas);
    }

}