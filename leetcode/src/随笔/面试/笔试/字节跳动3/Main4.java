package 随笔.面试.笔试.字节跳动3;

import java.util.Scanner;

/**
 * @author zjg
 * @ClassName Main4
 * @Description TODO
 * @Date 2019/9/15 16:58
 **/
public class Main4 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int price = sca.nextInt();
        int[][] arr = new int[n][3];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sca.nextInt();
            arr[i][1] = sca.nextInt();
            arr[i][2] = sca.nextInt();
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i][1] <= price && arr[i][2] > max) {
                max = arr[i][2];
            }
        }
        System.out.println(max);
    }

}
