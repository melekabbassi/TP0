import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws Exception {
        //Write a Java program to divide two numbers and print on the screen.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double a = sc.nextInt();
        System.out.println("Enter the second number: ");
        double b = sc.nextInt();
        System.out.println("The result is: " + a / b);
    }
}