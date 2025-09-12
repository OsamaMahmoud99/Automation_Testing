package courses;

import java.util.LinkedList;

public class DemoLinkedList {

    public static void main(String[] args) {

        // Create a LinkedList
        LinkedList<String> cars = new LinkedList<String>();

        // Add elements to the LinkedList
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        // Add the element at the first position
        cars.addFirst("Honda");
        System.out.println(cars);

        // Add the element at the last position
        cars.addLast("Toyota");
        System.out.println(cars);

        // Get the first element
        String firstCar = cars.get(0);
        System.out.println(firstCar);

        // Get the last element
        String lastCar = cars.get(cars.size() - 1);
        System.out.println(lastCar);

        // Change an element
        cars.set(0, "Opel");
        System.out.println(cars);

        // Remove the first element
        cars.remove(0);
        System.out.println(cars);

        // Remove the last element
        cars.remove(cars.size() - 1);
        System.out.println(cars);

    }

}
