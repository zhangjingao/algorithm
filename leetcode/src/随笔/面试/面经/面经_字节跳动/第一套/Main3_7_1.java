package 随笔.面试.面经.面经_字节跳动.第一套;

/**
 * @author zjg
 * <p> 2019/3/7 17:06 </p>
 */
public class Main3_7_1 {

    int maxSubmatrixSum(int[][] matrix,int n, int m) {
        int base_sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                base_sum += matrix[i][j];
            }
        }
        int result = 0;
        for (int i = 0; i + n < matrix.length; i++) {
            if (i > 0) {
                for (int y = 0; y < m; y++) {
                    base_sum += matrix[i + n][y] - matrix[i - 1][y];
                }
            }
            int real_sum = base_sum;
            if (real_sum > result) {
                result = real_sum;
            }
            for (int j = 0; j + m < matrix.length; j++) {
                for (int x = 0; x < n; x++) {
                    real_sum += matrix[x][j + m] - matrix[x][j - 1];
                }
                if (real_sum > result) {
                    result = real_sum;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,2},{7,8,9,2},{1,1,1,1}};
        System.out.println(
            new Main3_7_1().maxSubmatrixSum(arr,2,2)
        );
    }

}
