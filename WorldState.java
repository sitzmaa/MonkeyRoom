public class WorldState {
    private String roomMonkeyIn;
    private String roomBoxIn;
    private String roomBananasIn;
    private String monkeyHeight;
    private boolean monkeyHasBananas;

    public static final String ROOM_A = "A";
    public static final String ROOM_B = "B";
    public static final String ROOM_C = "C";
    public static final String HEIGHT_LOW = "Low";
    public static final String HEIGHT_HIGH = "High";

    public WorldState(String monkeyPos, String boxPos, String bananaPos) {
        this.roomMonkeyIn = monkeyPos.toUpperCase();
        this.roomBoxIn = boxPos.toUpperCase();
        this.roomBananasIn = bananaPos.toUpperCase();
    }

    public String getRoomMonkeyIn(){
        return this.roomMonkeyIn;
    }
    public String getRoomBoxIn() {
        return this.roomBoxIn;
    }
    public String getRoomBananasIn(){
        return this.roomBananasIn;
    }
    public String getMonkeyHeight(){
        return this.monkeyHeight;
    }
    public boolean getMonkeyHasBananas(){
        return this.monkeyHasBananas;
    }

    

    public boolean isMonkeyAt(String room) {
        return this.roomMonkeyIn.equalsIgnoreCase(room);
    }
    public boolean isMonkeyHeight(String height) {
        return this.monkeyHeight.equalsIgnoreCase(height);
    }
    public boolean isBoxAt(String room) {
        return this.roomBoxIn.equalsIgnoreCase(room);
    }
    public boolean isBananasAt(String room) {
        return this.roomBananasIn.equalsIgnoreCase(room);
    }

}