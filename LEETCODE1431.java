import java.util.Arrays;

public class LEETCODE1431 {
    public static void main(String[] args) {
        int[] candies = {4, 2, 1, 1, 2};
        boolean[] result = new boolean[candies.length];
        int extracandy = 1;
        int[] demo = Arrays.copyOf(candies, candies.length);
        Arrays.sort(demo);
        int max = demo[demo.length - 1];
        for (int j = 0; j < candies.length; j++) {
            result[j] = candies[j] + extracandy >= max;
        }
        System.out.println(Arrays.toString(result));
    }
}
/*import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }
        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }
        return result;
    }
}
*/