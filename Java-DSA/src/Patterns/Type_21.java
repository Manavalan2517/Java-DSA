package Patterns;

public class Type_21 {
    public static void main(String[] args) {
        int n = 20;
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 1; i < n-1; i++) {
            System.out.print("*");
            for (int j = 1; j <= n-2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }
}
