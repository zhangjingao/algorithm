package 随笔.面试.笔试.笔试携程;

import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/4/8 19:35 </p>
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String str = sca.nextLine();
        sca.close();
        String[] arr = str.split(",");
        int len = arr.length;
        for (int i = 1; i <= len; i++) {
            int num = str.indexOf(arr[i-1], 2*i);
            if (num != -1) {
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }

}
