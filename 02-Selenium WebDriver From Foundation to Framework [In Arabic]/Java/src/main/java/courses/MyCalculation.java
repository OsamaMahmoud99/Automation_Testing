package courses;

public class MyCalculation extends Calculation {

    public void multiply(int a, int b) {
        total = a * b;
        System.out.println("The Multiplication is " + total);
    }

    public static void main(String[] args) {
       MyCalculation obj = new MyCalculation();
       obj.sum(10, 20);
       obj.subtract(20, 10);
       obj.multiply(10, 20);
    }
}
