package Patterns;

public class Type_6 {
    public static void main(String[] args) {
        int num = 5;
        for (int i=num; i>0; i--){
            int current_num = i;
            for (int j=current_num; j>0; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}