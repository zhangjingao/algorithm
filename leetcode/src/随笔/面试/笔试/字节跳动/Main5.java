package 随笔.面试.笔试.字节跳动;

import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/4/14 10:01 </p>
 */
public class Main5 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sca.nextInt();
        }
        System.out.println(n-1);
    }


}
