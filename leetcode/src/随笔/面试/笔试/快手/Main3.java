package 随笔.面试.笔试.快手;

import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/3/30 20:26 </p>
 */
public class Main3 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        if (n == 1) {
            System.out.println(1);
            return;
        }
        int index = 0;
        while (Math.pow(2, index) < n) {
            index++;
        }
        int count = 0;
        while (--index >= 0) {
            int temp = n / (int)Math.pow(2,index);
            if (temp > 0|| (n == 1 && index == 0)) {
                count++;
                n = n % (int) Math.pow(2,index);
            }
        }
        System.out.println(count);
    }

}
