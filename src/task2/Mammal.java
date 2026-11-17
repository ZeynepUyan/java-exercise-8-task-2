package task2;

public class Mammal extends Animal {
    protected String furColor;

    public Mammal() {
        super();
        this.furColor = "Unknown";
    }

    public Mammal(String name, int age, double weight, String furColor) {
        super(name, age, weight);
        this.furColor = furColor;
    }

    public Mammal(String name, String furColor) {
        super(name);
        this.furColor = furColor;
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating mammal food.");
    }

    @Override
    public String getVoice() {
        return "Generic mammal sound";
    }

    public void run() {
        System.out.println(name + " is running on land.");
    }

    public String getFurColor() { return furColor; }
    public void setFurColor(String furColor) { this.furColor = furColor; }

    @Override
    public String toString() {
        return "Mammal [" + super.toString() + ", Fur Color=" + furColor + "]";
    }
}