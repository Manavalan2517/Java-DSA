package Patterns;

public class Type_13 {
    public static void main(String[] args) {
        int n = 6;
        int current_num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(current_num+" ");
                current_num++;
            }
            System.out.println();
        }
    }
}
