package Element;

public class FireBender extends Avatar {

    private String fireColour;
    private int fireTemp;

    public FireBender(String name,int age, boolean good){
        super(name,age,good);
        this.fireColour = "orange";
        this.fireTemp = 1000;

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
        if (fireTemp>=1980 && fireTemp<=2400){
            this.fireColour= "blue";
        }else if(fireTemp>2400){
            this.fireColour = "white";
        }
    }

    public String jump(){
        return this.name + " jumped using fire blast!";
    }


}
