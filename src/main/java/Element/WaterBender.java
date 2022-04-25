package Element;

public class WaterBender extends Avatar {

    private String waterState;
    private String tribe;

    public WaterBender(String name, int age, boolean good, String tribe){
        super(name, age, good);
        this.tribe = tribe;
        this.waterState = "liquid";
    }

    public String getWaterState() {
        return waterState;
    }

    public String getTribe() {
        return tribe;
    }

    public void setTribe(String tribe) {
        this.tribe = tribe;
    }

    public void setWaterState(String waterState) {
        this.waterState = waterState;
    }

    public String jump(){
        return this.name + " jumps using water blast!";

    }

    public void freezeWater(){
        this.waterState = "Ice";

    }

    public void unfreezeWater(){
        this.waterState = "liquid";
    }
}
