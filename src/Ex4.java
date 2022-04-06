import java.util.Scanner;

public class Ex4 {
    //Write a Java program to print the area and perimeter of a circle
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double r = sc.nextDouble();
        double area = Math.PI * r * r;
        double perimeter = 2 * Math.PI * r;
        System.out.println("The area is: " + area);
        System.out.println("The perimeter is: " + perimeter);
    }
}
