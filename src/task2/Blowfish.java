package task2;

public class Blowfish extends Fish implements AnimalBehavior {
    private double toxicityLevel;

    public Blowfish() {
        super();
        this.toxicityLevel = 0.0;
    }

    public Blowfish(String name, int age, double weight, String scaleType, double toxicityLevel) {
        super(name, age, weight, scaleType);
        this.toxicityLevel = toxicityLevel;
    }

    public Blowfish(String name, double toxicityLevel) {
        super(name, "Unknown");
        this.toxicityLevel = toxicityLevel;
    }

    @Override
    public void eat() {
        System.out.println(name + " the blowfish is eating crustaceans.");
    }

    @Override
    public String getVoice() {
        return "Puff sound";
    }

    public void puffUp() {
        System.out.println(name + " is puffing up to defend itself!");
    }

    public double getToxicityLevel() { return toxicityLevel; }
    public void setToxicityLevel(double toxicityLevel) { this.toxicityLevel = toxicityLevel; }


    @Override
    public void sleep() {
        System.out.println(name + " rests near the seabed.");
    }

    @Override
    public void move() {
        System.out.println("Blowfish swims.");
    }

    @Override
    public String toString() {
        return "Blowfish [" + super.toString() + ", Toxicity Level=" + toxicityLevel + "]";
    }
}