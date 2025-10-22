import java.util.Arrays;

public class LEETCODE1920 {
    public static void main(String[] args) {
        int[] num = {0, 2, 1, 5, 3, 4};
        int[] arr = new int[num.length];

        for (int i = 0; i < num.length; i++) {
            arr[i] = num[num[i]];
        }
        System.out.println(Arrays.toString(arr));
    }
}
