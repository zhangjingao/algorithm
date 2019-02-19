package code2019.code19_2_16;

import java.util.Arrays;

/**
 * @author zjg
 * <p> 2019/2/16 19:49 </p>
 * 该题使用欧几里得距离，欧几里得：d(x1,x2)=sqrt((x1-x2)^2+(y1-y2)^2);
 *
 */
public class KClosestPointstoOrigin_973 {

    public int[][] kClosest(int[][] points, int K) {
        int[] discontent = new int[points.length];
        int[][] result = new int[K][2];
        for (int i = 0; i < points.length; i++) {
            discontent[i] = points[i][0] * points[i][0] + points[i][1] * points[i][1];
        }
        int min = 0;
        while (K > 0) {
            for (int i = 0; i < discontent.length; i++) {
                if (discontent[i] != -1) {
                    min = i;
                    break;
                }
            }
            for (int i = 0; i < discontent.length; i++) {
                if (discontent[min] > discontent[i] && discontent[i] != -1) {
                    min = i;
                }
            }
            discontent[min] = -1;
            System.out.println(min);
            result[K-1] = points[min];
            K--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(
                Arrays.deepToString(new KClosestPointstoOrigin_973().kClosest(new int[][]{{3, 3}, {5,-1},{-2,4}}, 2))
        );
    }

}
