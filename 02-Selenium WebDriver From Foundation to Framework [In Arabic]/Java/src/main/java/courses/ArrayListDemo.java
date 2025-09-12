package courses;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        // Create an ArrayList
        ArrayList<String> cars = new ArrayList<String>();

        // Add elements to the ArrayList
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        // Get the element at the first position
        String firstCar = cars.get(0);
        System.out.println(firstCar);

        // Change an element
        cars.set(0, "Opel");
        System.out.println(cars);

        // Remove the third element
        cars.remove(2);
        System.out.println(cars);

        // Get the size of the ArrayList
        int size = cars.size();
        System.out.println(size);

        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);  
        myNumbers.add(25);
        int sum = 0;
        for(int i : myNumbers) {
            sum += i;
        }   
        System.out.println("The sum is " + sum);

    }
}
