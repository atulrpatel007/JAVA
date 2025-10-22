
public class LEETCODE1732 {
    public static void main(String[] args) {
        int [] gain = {-5,1,5,0,-7};
        int max = 0;
        int current = 0;
        for(int i = 0; i < gain.length; i++) {
            current += gain[i];
            max =  Math.max(current, max);
        }
        System.out.println(max);
    }
}
