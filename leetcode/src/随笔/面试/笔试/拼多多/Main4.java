package 随笔.面试.笔试.拼多多;

import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/5/6 19:02 </p>
 */
public class Main4 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int m = sca.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sca.nextInt();
        }
        //高度为height的高楼有多少座
        int[] height = new int[4001];
        for (int i = 0; i < n; i++) {
            height[arr[i]]++;
        }
        //最小花销
        int min = Integer.MAX_VALUE;
        for (int i = 2; i <= 4000; i++) {
            int minTemp = 0;

            int heightNumNow = height[i];
            for (int j = i - 1; j >= 0 ; j--) {
                if (heightNumNow >= m) {
                    break;
                }
                if (height[j] == 0) {
                    continue;
                }
                //如果楼房数量够了，就加钱
                if (heightNumNow + height[j] >= m ) {
                    minTemp += (m - heightNumNow) * (i - j);
                    heightNumNow = m;
                    break;
                } else {
                    minTemp += height[j] * (i - j);
                    heightNumNow += height[j];
                }
            }
            if (minTemp < min && heightNumNow >= m ) {
                min = minTemp;
            }
        }
        System.out.println(min);
    }

}
