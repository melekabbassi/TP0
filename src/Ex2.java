import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) throws Exception {
        //Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double a = sc.nextInt();
        System.out.println("Enter the second number: ");
        double b = sc.nextInt();
        System.out.println("The sum is: " + (a + b));
        System.out.println("The multiply is: " + (a * b));
        System.out.println("The subtract is: " + (a - b));
        System.out.println("The divide is: " + (a / b));
        System.out.println("The remainder is: " + (a % b));
    }
}
