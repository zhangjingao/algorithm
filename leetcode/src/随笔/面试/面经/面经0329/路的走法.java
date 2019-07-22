package 随笔.面试.面经.面经0329;

import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/3/29 11:01 </p>
 */
public class 路的走法 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int x = sca.nextInt()+1;
        int y = sca.nextInt()+1;
        int[][] arr = new int[x][y];
        arr[0][0] = 0;
        for (int i = 0; i < x; i++) {
            arr[i][0] = 1;
        }
        for (int i = 0; i < y; i++) {
            arr[0][i] = 1;
        }
        for (int i = 1; i < x; i++) {
            for (int j = 1; j < y; j++) {
                arr[i][j] = arr[i-1][j] + arr[i][j-1];
            }
        }
        System.out.println(arr[x-1][y-1]);
    }


}
