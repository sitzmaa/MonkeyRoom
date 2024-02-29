public class Grab extends Action{

    public Grab(){
        this.operatorName = "GRAB";
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