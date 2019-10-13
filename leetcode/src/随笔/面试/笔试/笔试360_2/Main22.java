package 随笔.面试.笔试.笔试360_2;

import java.util.Scanner;

/**
 * @author zjg
 * @ClassName Main2
 * @Description TODO
 * @Date 2019/9/26 20:11
 **/
public class Main22 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int m = sca.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sca.nextInt();
        }
        if (m == 0) {
            System.out.println(0);
            return;
        }
        double max = 0;
        for (int i = 0; i < m; i++) {
            max += arr[i];
        }
        double temp = max;
        int maxLen = m;
        for (int i = 0; i < n - m; i++) {
            double result = 0;
            for (int j = i ; j < i + m; j ++) {
                result += arr[j];
            }
            int len = m;
            for (int j = i + m; j < n; j++) {
                if (result / m <= (result + arr[j]) / (len + 1)){
                    temp = result;
                    len++;
                } else {
                    break;
                }
            }
            max = temp;
            maxLen = len;
        }
        System.out.printf("%.3f",max / maxLen);
    }


}
