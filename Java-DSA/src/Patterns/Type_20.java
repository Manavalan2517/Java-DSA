package Patterns;

public class Type_20 {
    public static void main(String[] args) {
        int n = 200;
        int space = n;
        for (int i = 1; i <= n; i++) {
            space--;
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= (space*2); j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        int spaces = 2;
        for (int i = n-1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < spaces ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
            spaces += 2;
        }
    }
}
