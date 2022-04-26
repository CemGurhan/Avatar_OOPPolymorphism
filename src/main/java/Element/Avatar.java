package Element;

public abstract class Avatar {
    protected String name;
    private int age;
    private boolean good;

    private String element;

    public Avatar(String name, int age, boolean good,String element){
        this.name = name;
        this.age = age;
        this.good = good;
        this.element = element;
    }

    public String getElement() {
        return element;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGood() {
        return good;
    }

    public void setGood(boolean good) {
        this.good = good;
    }

    public abstract String jump();
}
