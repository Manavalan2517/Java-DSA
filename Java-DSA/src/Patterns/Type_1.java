package Patterns;

public class Type_1 {
    public static void main(String[] args) {
        String pattern = "*";
        int row = 5;
        int column = 5;
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
