import java.util.*;

public class pairs_with_sum {
    public static void main(String[] args) {
        int[] lst = {1,4,2,3,2};
        int count = 0;
        int val = 5;
        int length = lst.length;
        for (int i=0; i<length; i++){
            for (int j=i+1; j<length; j++){
                if(lst[i] + lst[j] == val){
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }
}