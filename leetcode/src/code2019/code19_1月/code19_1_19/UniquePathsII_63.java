package code2019.code19_1月.code19_1_19;

/**
 * @author zjg
 * <p> 2019/1/19 17:07 </p>
 */
public class UniquePathsII_63 {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int height = obstacleGrid.length;
        int width = obstacleGrid[0].length;
        int [][] arrs = new int[height][width];
        for (int i = 0; i < height; i++) {
            if (obstacleGrid[i][0] == 1) {
                break;
            }
            arrs[i][0] = 1;
        }
        for (int i = 0; i < width; i++) {
            if (obstacleGrid[0][i] == 1) {
                break;
            }
            arrs[0][i] = 1;
        }
        for (int i = 1; i < height; i++) {
            for (int j = 1; j < width; j++) {
                if (obstacleGrid[i][j] == 1) {
                    continue;
                }
                arrs[i][j] = arrs[i - 1][j] + arrs[i][j - 1];
            }
        }
        return arrs[height-1][width-1];
    }

    public static void main(String[] args) {
        System.out.println(
                new UniquePathsII_63().uniquePathsWithObstacles(new int[][]{{0,0,0},{0,1,0},{0,0,0}})
        );
    }

}
