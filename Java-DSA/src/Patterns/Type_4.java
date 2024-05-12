package Patterns;

public class Type_4 {
    public static void main(String[] args) {
        int num = 5;
        int current_num = 0;
        for(int i=1; i<=num; i++){
            current_num = i;
            for(int j=1; j<=i; j++){
                System.out.print(current_num);
            }
            System.out.println();
        }
    }
}
