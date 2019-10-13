package 随笔.面试.笔试.转转58;

import java.util.Scanner;

/**
 * @author zjg
 * @ClassName Main3
 * @Description TODO
 * @Date 2019/9/16 21:14
 **/
public class Main3 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sca.nextInt();
        }
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            int temp = 0;
            boolean isUpdate = true;
            int lastUpdate = i;
            int lastValue = arr[i];
            for (int j = i + 1; j < n; j++) {
                if (lastValue + 1 == arr[j]) {
                    temp++;
                    lastValue = lastValue + 1;
                } else if (isUpdate) {
//                    arr[j] = arr[j - 1] + 1;
                    lastValue = lastValue + 1;
                    isUpdate = false;
                    lastUpdate = j - 1;
                    temp++;
                } else {
                    if (temp > maxLen) {
                        maxLen = temp;
                        i = lastUpdate;
                        break;
                    }
                }
            }
            if (temp > maxLen) {
                maxLen = temp;
//                i = lastUpdate;
            }
        }
        System.out.println(maxLen);
    }

}
