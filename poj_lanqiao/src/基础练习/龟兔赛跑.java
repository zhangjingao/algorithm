package 基础练习;

import java.util.Scanner;

/**
 * @author zjg
 * @date 2018/3/26 11:12
 * @Description
 */
public class 龟兔赛跑 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int v1 = sca.nextInt();
        int v2 = sca.nextInt();
        int t = sca.nextInt();
        int s = sca.nextInt();
        int l = sca.nextInt();
        int count1 = 0, count2 = 0,second = 0;//兔已跑，龟已跑
        while (count1 < l && count2 < l) {
            if (count1-count2 >= t) {
                count2 += v2 * s;
                second += s;
            } else {
                count1 += v1;
                count2 += v2;
                second++;
            }
        }
        if (count1 == l&&count2 == l) {
            System.out.println("D"+"\n"+second);
        } else if (count1 == l) {
            System.out.println("R"+"\n"+second);
        } else if (count2 == 1) {
            System.out.println("T"+"\n"+second);
        }else if (count2 > 1) {
            second = second-(count2-l)/v2;
            System.out.println("T"+"\n"+second);
        }
    }
}
