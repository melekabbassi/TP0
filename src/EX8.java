import java.util.Scanner;

public class EX8 {
    //Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the third number: ");
        int c = sc.nextInt();
        if (a + b == c) {
            System.out.println("The sum is equal to the third number");
        } else {
            System.out.println("The sum is not equal to the third number");
        }
    }
}
