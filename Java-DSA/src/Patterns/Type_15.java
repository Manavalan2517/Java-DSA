package Patterns;

public class Type_15 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = n; i > 0; i--) {
            for(char ch = 'A'; ch < 'A'+i; ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
