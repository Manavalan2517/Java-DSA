package Problems;

public class array_reversal_02 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int start = 0;
        for(int end=a.length-1; start<end; end--){
            int start_element = a[start];
            int end_element = a[end];
            a[end] = start_element;
            a[start] = end_element;
            start++;
        }
        for(int i=0; i<=4; i++){
            System.out.println(a[i]);
        }
    }
}