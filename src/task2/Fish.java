package task2;

public class Fish extends Animal {
    protected String scaleType;

    public Fish() {
        super();
        this.scaleType = "Unknown";
    }

    public Fish(String name, int age, double weight, String scaleType) {
        super(name, age, weight);
        this.scaleType = scaleType;
    }

    public Fish(String name, String scaleType) {
        super(name);
        this.scaleType = scaleType;
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating algae.");
    }

    @Override
    public String getVoice() {
        return "Blub blub";
    }

    public void swim() {
        System.out.println(name + " is swimming underwater.");
    }

    public String getScaleType() { return scaleType; }
    public void setScaleType(String scaleType) { this.scaleType = scaleType; }

    @Override
    public String toString() {
        return "Fish [" + super.toString() + ", Scale Type=" + scaleType + "]";
    }
}