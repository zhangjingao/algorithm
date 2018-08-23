package code18_8_12_compet;

/**
 * @author zjg
 * @date 2018/8/12 9:19
 * @Description
 */
public class SpiralMatrixIII_889 {

    public int[][] spiralMatrixIII(int R, int C, int r0, int c0) {
        int [][] arr = new int[R*C][2];
        int step = 1; //每次走的步数
        int stepTotal = 0;

        while (stepTotal == R * C) {

            //向左走
            while (step != 0) {
                arr[stepTotal] = new int[]{r0+1,c0};
                step--;
            }


        }

        return null;
    }
}
