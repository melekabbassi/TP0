import java.util.Scanner;

public class EX6 {
    // Write a Java program to convert a decimal number to binary number
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number: ");
        int a = sc.nextInt();
        int b = a;
        int c = 0;
        int d = 0;
        while (b != 0) {
            d = b % 2;
            b = b / 2;
            c = c * 10 + d;
        }
        System.out.println("The binary number is: " + c);
    }
}
