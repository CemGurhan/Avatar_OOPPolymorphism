package Action;

import Element.Avatar;

public abstract class Blast implements IBlast {

    private int distance;
    private int amount;

    private String element;

    private Avatar avatar;

    private int volumeOfBlastMetresCubed;

    public Blast(int distance, int amount, Avatar avatar) {
        this.distance = distance;
        this.amount = amount;
        this.element = avatar.getElement();
        this.volumeOfBlastMetresCubed=this.distance*this.amount;

    }


    public int getVolumeOfBlastMetresCubed() {
        return volumeOfBlastMetresCubed;
    }

    public void setVolumeOfBlastMetresCubed(int volumeOfBlastMetresCubed) {
        this.volumeOfBlastMetresCubed = volumeOfBlastMetresCubed;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public Avatar getAvatar() {
        return avatar;
    }

    public void setAvatar(Avatar avatar) {
        this.avatar = avatar;
    }
}
