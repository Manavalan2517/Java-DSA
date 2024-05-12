package Patterns;

public class Type_2 {

    public static void main(String[] args) {
        String pattern = "*";
        for(int i=1; i<6; i++){
            for(int j=1; j<=i; j++){
                System.out.print(pattern);
            }
            System.out.println();
        }
    }
}
