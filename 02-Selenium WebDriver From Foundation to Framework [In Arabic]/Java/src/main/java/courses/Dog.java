package courses;

public class Dog extends Animal{

    public static void main(String[] args) {
        Animal myDog = new Dog(); // Create a Dog object
        myDog.animalSound();
    }

    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}
