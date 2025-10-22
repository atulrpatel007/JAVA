import java.util.Arrays;

public class LEETCODE1365 {
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        int[] demo = Arrays.copyOf(nums, nums.length);
        Arrays.sort(demo);
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            for (int j = 0; j < demo.length; j++) {
                if (demo[j] == num) {
                    result[i] = j;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(result));
    }
}

