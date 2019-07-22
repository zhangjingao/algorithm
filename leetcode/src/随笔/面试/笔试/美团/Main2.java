package 随笔.面试.笔试.美团;

import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/4/23 20:07 </p>
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int m = sca.nextInt();
        int[][] arr = new int[m][2];
        for (int i = 0; i < m; i++) {
            arr[i][0] = sca.nextInt();
        }
        for (int i = 0; i < m; i++) {
            arr[i][1] = sca.nextInt();
        }
        System.out.println(m/3);

    }

}
