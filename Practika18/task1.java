package Practika18;

public class task1 {
    public static void main(String[] args) {
        exceptionDemo();
    }
    public static void exceptionDemo() {
        try{
            System.out.println( 2/0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }
    }
}