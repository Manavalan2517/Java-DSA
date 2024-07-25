package Problems.Methods;

import java.util.Scanner;

public class eligible_to_vote {
    public static String eligiblity(int age) {
        String result = " are ";
        if (age < 18) {
            result += "not ";
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        String result = eligiblity(age);
        System.out.println("You"+result+"eligible to vote");
    }
}