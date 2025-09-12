package courses;

public class Calculation {

    int total;

    public void sum(int a, int b) {
         total = a + b;
         System.out.println("The Sum is " + total);
    }

    public void subtract(int a, int b) {
        total = a - b;
        System.out.println("The Subtraction is " + total);
    }
}
