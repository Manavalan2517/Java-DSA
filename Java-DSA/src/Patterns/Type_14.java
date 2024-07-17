package Patterns;

public class Type_14 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i <= n; i++) {
            for(char ch = 'A'; ch <= 'A'+i; ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
