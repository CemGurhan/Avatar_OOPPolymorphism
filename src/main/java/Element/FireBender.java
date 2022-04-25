package Element;

public class FireBender extends Avatar {

    private String fireColour;
    private int fireTemp;

    public FireBender(String name,int age, boolean good){
        super(name,age,good);
        this.fireColour = "orange";
        this.fireTemp = 600;

    }

    public String getFireColour() {
        return fireColour;
    }

    public void setFireColour(String fireColour) {
        this.fireColour = fireColour;
    }

    public int getFireTemp() {
        return fireTemp;
    }

    public void setFireTemp(int fireTemp) {
        this.fireTemp = fireTemp;
    }

    public String jump(){
        return this.name + " jumped using fire blast!";
    }


}
