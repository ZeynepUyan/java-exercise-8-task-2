package task2;

public class Pigeon extends Bird implements AnimalBehavior {
    private String species;

    public Pigeon() {
        super();
        this.species = "Unknown";
    }

    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    public Pigeon(String name, String species) {
        super(name, "Unknown");
        this.species = species;
    }

    @Override
    public void eat() {
        System.out.println(name + " the pigeon is eating breadcrumbs.");
    }

    @Override
    public String getVoice() {
        return "Coo coo";
    }

    public void deliverMessage() {
        System.out.println(name + " is delivering a letter.");
    }

    public String getSpecies() { return species; }
    public void setSpecies(String species) { this.species = species; }


    @Override
    public void sleep() {
        System.out.println(name + " sleeps on a perch.");
    }

    @Override
    public void move() {
        System.out.println("Pigeon flies.");
    }

    @Override
    public String toString() {
        return "Pigeon [" + super.toString() + ", Species=" + species + "]";
    }
}