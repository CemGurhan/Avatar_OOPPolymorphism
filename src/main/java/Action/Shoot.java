package Action;

import Element.Avatar;

public abstract class Shoot   {
    private int distance;
    private int amount;

    private String element;

    private Avatar avatar;

    public Shoot(int distance, int amount, Avatar avatar){
        this.distance = distance;
        this.amount = amount;
        this.element = avatar.getElement();
    }

    public Avatar getAvatar() {
        return avatar;
    }

    public void setAvatar(Avatar avatar) {
        this.avatar = avatar;
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
}
