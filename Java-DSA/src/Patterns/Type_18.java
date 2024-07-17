package Patterns;

public class Type_18 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (char ch = (char)((int)('F'-i)); ch <= 'E'; ch++) {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
