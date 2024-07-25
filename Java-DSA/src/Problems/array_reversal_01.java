package Problems;

public class array_reversal_01 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = new int[a.length];
        int j = 0;

        for(int i=4; i>=0; i--){
            b[j] = a[i];
            j++;
        }
        for(int i=0; i <=4; i++){
            System.out.print(b[i]+" ");
        }
    }
}
