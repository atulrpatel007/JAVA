import java.lang.reflect.Array;
import java.util.Arrays;

public class SWAP {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 9, 6};
        System.out.println(Arrays.toString(arr));
                swap(arr,2,4);
                int m = max(arr);
        System.out.println("Maximum value is: "+m);
        rev(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] num, int a ,int b){
        int temp = num[a];
        num[a] = num[b];
        num[b] = temp;
        System.out.println(Arrays.toString(num));
    }
    static int max (int [] num){
        int max = num[0];
        for (int i = 1 ; i < num.length ; i++ ){
            if ( max < num[i] ){
                max = num[i];
            }
        }
        return max;
    }
    static void rev (int[] num){
        int start = 0;
        int end = num.length - 1;
        while (start<end){
            swap(num,start,end);
            start++;
            end--;
        }
    }
}
