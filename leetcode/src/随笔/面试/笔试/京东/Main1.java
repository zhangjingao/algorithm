package 随笔.面试.笔试.京东;

import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/4/13 19:51 </p>
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 1; i < n; i++) {
            int col = sca.nextInt();
            int row = sca.nextInt();
            arr[row-1][col-1] = 1;
        }
        int time = 0;
        int[] arrUp = new int[n];
        while (true) {
            //判断和1相连的是否还有节点，如果没有就结束
            boolean boo = false;
            for (int i = 0; i < n; i++) {
                if (arr[0][i] == 1) {
                    arr[0][i] = 0;
                    arrUp[i] = 1;
                    boo = true;
                }
            }
            if (!boo) {
                break;
            } else {
                for (int a = 0; a < n; a++) {
                    if (arrUp[a] != 1) {
                        continue;
                    }
                    arrUp[a] = 0;
                    //并将其子节点移上去一个
                    int upNode = 0;
                    for (int j = 0; j < n; j++) {
                        if (arr[a][j] == 1) {
                            arr[a][j] = 0;
                            arr[0][j] = 1;
                            upNode = j;
                            break;
                        }
                    }
                    //将子节点转移到提升的节点上
                    for (int j = 0; j < n; j++) {
                        if (arr[a][j] == 1) {
                            arr[a][j] = 0;
                            arr[upNode][j] = 1;
                        }
                    }
                }
                time++;
            }
        }

        System.out.println(time);
    }

}
