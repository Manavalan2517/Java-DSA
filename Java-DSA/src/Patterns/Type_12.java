package Patterns;
import java.util.Scanner;

public class Type_12 {
    public static void main(String[] args) {
        int n = 9;
        int space = n;
        for (int i = 1; i <= n; i++) {
            space--;
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= (space*2); j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}