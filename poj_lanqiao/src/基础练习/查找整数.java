package 基础练习;

import java.util.Scanner;

/**
 * @author zjg
 * @date 2018/3/22 18:14
 * @Description
 */
public class 查找整数 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int [] array = new int[n];
        for (int i=0;i<n;i++) {
            array[i] = sca.nextInt();
        }
        int a = sca.nextInt();
        boolean boo = false;
        for (int i=0;i<n;i++) {
            if (a == array[i]) {
                boo = true;
                System.out.println(i+1);
                break;
            }
        }
        if (!boo) {
            System.out.println(-1);
        }
    }
}
