package Problems.Methods;

import java.util.Scanner;

public class check_prime_or_not {
    public static String checkPrime(int n) {
        String result = "Prime number";
        for (int i = 2; i < n; i++) {
            if (n % i == 0) result = "Not a prime number"; break;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        System.out.println(checkPrime(n));
    }
}