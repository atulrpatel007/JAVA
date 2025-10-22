public class LEETCODE1572 {
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int result = 0;
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            result += mat[i][i];
            if (i != n - 1 - i) {
                result += mat[i][n - 1 - i];
            }
        }
        System.out.println(result);
    }
}
