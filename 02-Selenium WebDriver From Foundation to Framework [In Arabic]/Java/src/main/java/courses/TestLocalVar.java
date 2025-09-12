package courses;

public class TestLocalVar {

    public void testLocalVariable() {
       int age = 34;
       System.out.println("Age is: " + age);
    }

    public void testSamLocalVariable() {
       int age = 45;
       System.out.println("Age is: " + age);
    }

    public void testParameterVariable(int age) {
       System.out.println("Age is: " + age);
    }
    
    public static void main(String[] args) {
        TestLocalVar testClass = new TestLocalVar();
        testClass.testLocalVariable();  
        testClass.testSamLocalVariable();
    }
}
