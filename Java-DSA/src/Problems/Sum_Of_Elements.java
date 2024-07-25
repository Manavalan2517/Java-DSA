package Problems;

public class Sum_Of_Elements {
    public static void main(String[] args) {
        int lst[] = {4,1,7,5,10};
        int sum = 0;
        int length = lst.length;

        for (int i=0; i<length; i++){
            sum += lst[i];
        }
        System.out.println(sum);
    }
}
