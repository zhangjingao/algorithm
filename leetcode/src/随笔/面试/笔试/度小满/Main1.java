package 随笔.面试.笔试.度小满;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/4/28 20:21 </p>
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int state;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sca.nextInt();
        }
        char[] arrChar;
        for (int i = 0; i < n; i++) {
            state = 0; //0代表S,
            arrChar = String.valueOf(arr[i]).toCharArray();
            for (char anArr : arrChar) {
                if (anArr == '0'|| arr[i] % (anArr - '0') == 0) {
                    state++;
                }
            }
            if (state == 0) {
                System.out.println("S");
            } else if (state < arrChar.length) {
                System.out.println("H");
            } else {
                System.out.println("G");
            }
        }
    }

}
