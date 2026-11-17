package task2;

public class Dog extends Mammal implements AnimalBehavior {
    private String breed;

    public Dog() {
        super();
        this.breed = "Unknown";
    }

    public Dog(String name, int age, double weight, String furColor, String breed) {
        super(name, age, weight, furColor);
        this.breed = breed;
    }

    public Dog(String name, String breed) {
        super(name, "Unknown");
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println(name + " the dog is eating bones.");
    }

    @Override
    public String getVoice() {
        return "Woof woof!";
    }

    public void fetch() {
        System.out.println(name + " is fetching the ball!");
    }

    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }


    @Override
    public void sleep() {
        System.out.println(name + " curls up to sleep.");
    }

    @Override
    public void move() {
        System.out.println("Dog runs.");
    }

    @Override
    public String toString() {
        return "Dog [" + super.toString() + ", Breed=" + breed + "]";
    }
}