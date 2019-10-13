package 随笔.面试.笔试.有赞;

import java.util.Scanner;

/**
 * 100
 * @author zjg
 * @ClassName Main2
 * @Description TODO
 * @Date 2019/10/8 19:43
 **/
public class Main2 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int N = sca.nextInt();
        for (int i = 0; i < N; i++) {
            work(sca.nextInt());
        }
    }

    private static void work(int n) {
        if (n == 1) {
            System.out.println(0);
            return;
        }
        int num = 0;
        int sqrt = (int) Math.sqrt(n);
        for (int i = 1; i < sqrt + 1; i++) {
            int temp = (n - i) / (i + 1);
            if (temp * i + i + temp == n) {
                num++;
            }
        }
        System.out.println(num);
    }

}
