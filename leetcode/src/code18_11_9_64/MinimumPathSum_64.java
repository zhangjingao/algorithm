package code18_11_9_64;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zjg
 * <p> 2018/11/10 10:34 </p>
 */
public class MinimumPathSum_64 {

    public int minPathSum(int[][] grid) {
        if (grid.length == 0) {
            return 0;
        }
        int ilen = grid.length;
        int jLen = grid[0].length;
        int [][] sortLen = new int[ilen][jLen];
        for (int i = 0; i < ilen ; i++) {
            for (int j = 0; j < jLen; j++) {
                if (i == 0 && j == 0) {
                    sortLen[i][j] = grid[i][j];
                } else if (i == 0) {
                    sortLen[i][j] = sortLen[i][j-1] + grid[i][j];
                } else if (j == 0) {
                    sortLen[i][j] = sortLen[i - 1][j] + grid[i][j];
                } else {
                    sortLen[i][j] = Math.min(sortLen[i - 1][j], sortLen[i][j - 1]) + grid[i][j];
                }
            }
        }
        return sortLen[ilen-1][jLen-1];
    }


    public static void main(String[] args) {
        int [][] arr = {{3,8,6,0,5,9,9,6,3,4,0,5,7,3,9,3},{0,9,2,5,5,4,9,1,4,6,9,5,6,7,3,2},{8,2,2,3,3,3,1,6,9,1,1,6,6,2,1,9},{1,3,6,9,9,5,0,3,4,9,1,0,9,6,2,7},{8,6,2,2,1,3,0,0,7,2,7,5,4,8,4,8},{4,1,9,5,8,9,9,2,0,2,5,1,8,7,0,9},{6,2,1,7,8,1,8,5,5,7,0,2,5,7,2,1},{8,1,7,6,2,8,1,2,2,6,4,0,5,4,1,3},{9,2,1,7,6,1,4,3,8,6,5,5,3,9,7,3},{0,6,0,2,4,3,7,6,1,3,8,6,9,0,0,8},{4,3,7,2,4,3,6,4,0,3,9,5,3,6,9,3},{2,1,8,8,4,5,6,5,8,7,3,7,7,5,8,3},{0,7,6,6,1,2,0,3,5,0,8,0,8,7,4,3},{0,4,3,4,9,0,1,9,7,7,8,6,4,6,9,5},{6,5,1,9,9,2,2,7,4,2,7,2,2,3,7,2},{7,1,9,6,1,2,7,0,9,6,6,4,4,5,1,0},{3,4,9,2,8,3,1,2,6,9,7,0,2,4,2,0},{5,1,8,8,4,6,8,5,2,4,1,6,2,2,9,7}};
        System.out.println(
                new MinimumPathSum_64().minPathSum(arr)
        );
    }


}
