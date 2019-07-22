package code2019.code19_1月.code19_1_23_363____________________;

/**
 * @author zjg
 * <p> 2019/1/23 14:51 </p>
 */
public class MaxSumofRectangleNoLargerThanK {

    public int maxSumSubmatrix(int[][] matrix, int k) {
        int left_f = 0, right_f = 0,left_s = 1,right_s = 1;
        int markWord = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i+1; j < matrix[0].length ; j++) {

            }
        }
        return 0;
    }

    private int count (int[][] matrix, int left_f, int right_f, int left_s, int right_s) {
        int sum = 0;
        for (int i = left_f ; i < left_s ; i++) {
            for (int j = right_f; j < right_s ; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

}
