package Patterns;

public class Type_5 {
    public static void main(String[] args) {
        String pattern = "*";
        int num = 5;
        for(int i=0; i<5; i++){
            for (int j=num; j>0; j--){
                System.out.print(pattern);
            }
            num -= 1;
            System.out.println();
        }
    }
}
