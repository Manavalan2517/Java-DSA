package Problems.Methods;

import java.util.Scanner;

public class product_of_two_numbers {
    public static int product(int num1, int num2){
        return num1*num2;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        int product = product(num1, num2);
        System.out.println("The product of two numbers is " + product);
    }
}
