package Patterns;

public class Type_17 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n; i++) {
            char ch = 'A';
            for (int j = 1; j <= n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(ch);
                ch++;
            }
            for (int j = i; j >= 0; j--) {
                System.out.print(ch);
                ch--;
            }
            System.out.println();
        }
    }
}
