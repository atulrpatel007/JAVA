import java.util.Arrays;

public class LEETCODE832 {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] result = new int[image.length][image[0].length];
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                result[i][j] = image[i][image[i].length - 1 - j] ^ 1;
            }
        }
        System.out.println(Arrays.deepToString(result));
    }
}

