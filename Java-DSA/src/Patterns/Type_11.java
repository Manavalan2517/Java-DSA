package Patterns;

public class Type_11 {
    public static void main(String[] args) {
        int n = 6;
        int start;
        int end;
        for (int i = 0; i <= n; i++) {
            if (i%2==0) start = 1;
            else start=0;
            for (int j = 0; j < i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }
}
