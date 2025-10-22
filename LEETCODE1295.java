public class LEETCODE1295 {
    public static void main(String[] args) {
        int [] nums = {12,345,2,6,7896};
        int count = 0;
        for (int i = 0 ; i < nums.length ; i++){
            String temp = String.valueOf(nums[i]);
            if (temp.length()%2 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
/*class Solution {
    public int findNumbers(int[] nums) {

        int count=0;

        for(int i =0 ; i< nums.length; i++){

            if((nums[i]>9 && nums[i]<100) || (nums[i]>999 && nums[i]<10000) || nums[i]==100000){
                count++;
            }
        }

        return count;

    }
}
 */