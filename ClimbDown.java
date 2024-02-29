public class ClimbDown extends Action{

    public ClimbDown(){
        this.operatorName = "CLIMBDOWN";
    }

    public boolean checkPreconditions(WorldState worldState) {
        return false;
    }

    public WorldState applyPostconditions(WorldState worldState) {
        //create and return a new WorldState
        //with the monkey’s updated location
        return null;
    }
}