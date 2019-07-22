package 随笔.面试.笔试.笔试腾讯;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/4/5 20:05 </p>
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int m = sca.nextInt();
        int n = sca.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sca.nextInt();
        }
        sca.close();
        Arrays.sort(arr);
        int[] maxMianZhi = new int[n];
        int max = -1; //最大需要带的硬币数量
        for (int i = 1; i <= m; i++) {
            int sumTemp = 0;
            for (int j = 0; j < n; j++) {
                sumTemp += maxMianZhi[j] * arr[j];
            }
            if (sumTemp >= i) {
                continue;
            }

            int temp = i;
            int sum = 0;  //对于当前数值来说需要带的硬币
            //判断最大可达的面值
            int maxIndex;//对于当前值来说最大的面值
            for (maxIndex = 0; maxIndex < n; maxIndex++) {
                if (temp < arr[maxIndex]) {
                    break;
                }
            }
            maxIndex--;
            //从当前最大面值开始递减到最小面值
            while (maxIndex >= 0) {
                sum += temp / arr[maxIndex];
                if ((temp / arr[maxIndex]) > maxMianZhi[maxIndex]) {
                    maxMianZhi[maxIndex] = temp / arr[maxIndex];
                }
                temp = temp % arr[maxIndex];
                maxIndex--;
            }
            if (temp != 0) {
                System.out.println(-1);
                return;
            }
            if (sum > max) {
                max = sum;
            }
        }
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum2 += maxMianZhi[i];
        }
        System.out.println(sum2);
    }

}