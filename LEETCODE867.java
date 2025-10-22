public class LEETCODE867 {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] result = new int[matrix[0].length][matrix.length];
        for (int i =0;i<matrix[0].length;i++){
            for (int j=0;j< matrix.length;j++){
                result[i][j]=matrix[j][i];
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
