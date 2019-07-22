package 随笔.面试.笔试.笔试携程;

import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/4/8 19:40 </p>
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String str = sca.next();
        int k = sca.nextInt();
        sca.close();
        str = str.substring(1,str.length()-1);
        String[] arr = str.split(",");
        int len = arr.length;
        String temp;
        for (int i = 0; i <= len-k; i+=k) {
            for (int j = i; j < (i+i+k)/2; j++) {
                temp = arr[j];
                arr[j] = arr[i + k-1-(j-i)];
                arr[i + k-1-(j-i)] = temp;
            }
        }
        System.out.print("[");
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i]);
            if (i != len-1) {
                System.out.print(",");
            }
        }
        System.out.print("]");

    }

}
