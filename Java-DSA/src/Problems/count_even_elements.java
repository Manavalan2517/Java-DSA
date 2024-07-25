package Problems;

public class count_even_elements {
    public static void main(String[] args) {
        int[] lst = {2,5,4,7,8,10,12};
        int count = 0;
        for (int i : lst){
            if (i%2 == 0){
                count += 1;
            }
        }
        System.out.println(count);
    }
}