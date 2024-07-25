package Problems;

public class max_element {
    public static void main(String[] args) {
        int[] lst = {4, 1, 7, 5, 10};
        int max_element = 0;
        for (int i : lst) {
            if (i > max_element) {
                max_element = i;
            }
        }
        System.out.println(max_element);
    }
}