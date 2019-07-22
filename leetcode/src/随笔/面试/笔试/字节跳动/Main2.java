package 随笔.面试.笔试.字节跳动;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/4/14 10:01 </p>
 */
public class Main2 {

    private static int max = 1;

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        for (int i = 0; i < n; i++) {
            max = 1;
            //帧数
            int m = sca.nextInt();
            int[][] arr = new int[m][];
            int maxGroup = 0;
            for (int j = 0; j < m; j++) {
                int mNum = sca.nextInt();
                maxGroup = 2 * mNum;
                arr[j] = new int[maxGroup];
                for (int k = 0; k < maxGroup; k++) {
                    arr[j][k] = sca.nextInt();
                }
            }
            work (arr, 0, 0, maxGroup);
            System.out.println(max);
        }
    }

    private static void work(int[][] arr,int index, int group,int maxGroup) {
        int maxTempLen = 1;
        int tempIndex = index;
        int x1 = arr[index][group];
        int y1 = arr[index][group+1];
        while (++tempIndex < arr.length) {
            if (arr[tempIndex] == null || group >= arr[tempIndex].length) {
//                System.out.println(maxTempLen+" -1--- "+max);
                if (maxTempLen > max) {
//                    System.out.println("------~~~`");
                    max = maxTempLen;
                    maxTempLen = 1;
                }
                x1 = 0;
                y1 = 0;
                continue;
            }
            int x2 = arr[index][group];
            int y2 = arr[index][group+1];
//            System.out.println(x1+" "+x2+" "+y1+" "+y2);
            if (x1 == x2 && y1 == y2) {
//                System.out.println(maxTempLen+" -equals--- "+tempIndex+" "+group);
                maxTempLen++;
            } else {
                if (maxTempLen > max) {
//                    System.out.println("------2");
                    max = maxTempLen;
                }
                x1 = x2;
                y1 = y2;
                maxTempLen = 1;
            }
        }
        if (group < maxGroup) {
            work (arr,  0, group + 2, maxGroup);
        }

    }


}
