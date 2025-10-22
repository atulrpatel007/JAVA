import java.util.Arrays;

public class LEETCODE1480 {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int[] arr = new int[nums.length];
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            sum += nums[i];
            arr[i] = sum;
        }
        System.out.println(Arrays.toString(arr));
    }
}
