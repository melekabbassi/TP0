import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) throws Exception {
        //Write a Java program that takes a number as input and prints its multiplication table upto 10
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " x " + i + " = " + a * i);
        }
    }
}