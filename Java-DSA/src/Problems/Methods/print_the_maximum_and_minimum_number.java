package Problems.Methods;
import java.util.Scanner;

public class print_the_maximum_and_minimum_number{
    public static int largest(int num1, int num2, int num3) {
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        return max;
    }
    public static int smallest(int num1, int num2, int num3) {
        int min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();

        int max = largest(num1,num2,num3);
        int min = smallest(num1,num2,num3);

        System.out.println("The maximum number is: " + max);
        System.out.println("The minimum number is: " + min);
    }
}
