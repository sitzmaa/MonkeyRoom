public class ClimbUp extends Action{

    public ClimbUp(){
        this.operatorName = "CLIMBUP";
    }

    public boolean checkPreconditions(WorldState worldState) {
        return true;
    }

    public WorldState applyPostconditions(WorldState worldState) {
        //create and return a new WorldState
        //with the monkey’s updated location
        return null;
    }
}