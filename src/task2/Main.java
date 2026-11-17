package task2;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[6];

        animals[0] = new Mammal("Leo", 5, 20.5, "Brown");
        Dog dog = new Dog("Rex", 3, 15.0, "Black", "German Shepherd");
        animals[1] = dog;
        animals[2] = new Bird("Twetty", 1, 15, "Yellow");
        Pigeon pigeon = new Pigeon("Pidgey", 2, 0.5, "Grey", "Rock Dove");
        animals[3] = pigeon;
        animals[4] = new Fish();
        Blowfish blowfish = new Blowfish("Puffer", 1, 1.2, "Spiky", 8.5);
        animals[5] = blowfish;

        for (Animal animal : animals) {
            System.out.println("-----------------------------------");
            System.out.println(animal.toString());
            System.out.println("Voice: " + animal.getVoice());
            animal.eat();

            if (animal instanceof Dog) {
                ((Dog) animal).fetch();
            } else if (animal instanceof Pigeon) {
                ((Pigeon) animal).deliverMessage();
            } else if (animal instanceof Blowfish) {
                ((Blowfish) animal).puffUp();
            } else if (animal instanceof Mammal) {
                ((Mammal) animal).run();
            } else if (animal instanceof Bird) {
                ((Bird) animal).fly();
            } else if (animal instanceof Fish) {
                ((Fish) animal).swim();
            }
        }

        System.out.println("-----------------------------------");
        AnimalBehavior[] sleepingAnimals = {dog, pigeon, blowfish};
        sleepingAnimals[0].sleep();
        sleepingAnimals[1].sleep();
        sleepingAnimals[2].sleep();

        System.out.println("-----------------------------------");
        for (Animal animal : animals) {
            animal.move();
            AnimalName.name(animal.getName());
        }
    }
}