package code18_7_30_62;

/**
 * @author zjg
 * @date 2018/7/30 20:39
 * @Description
 */
public class UniquePaths {

    public int uniquePaths(int m, int n) {
        int [][] arr = new int[m][n];
        arr[0][0] = 1;//重点，将其置为1，从它开始走就是1。
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    continue;
                } else if (i == 0) {
                    arr[i][j] = arr[i][j-1];
                } else if (j == 0) {
                    arr[i][j] = arr[i-1][j];
                } else {
                    arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
                }
            }
        }
        return arr[m-1][n-1];
    }


    public static void main(String[] args) {
        new UniquePaths().uniquePaths(3,3);
    }


}
