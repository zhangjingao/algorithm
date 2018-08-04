package 基础练习;

import java.util.Scanner;

/**
 * @author zjg
 * @date 2018/3/21 22:20
 * @Description
 */
public class 特殊回文数 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int temp;
        char[] chars;
        int ge,shi,bai,qian,wan,shiWan,count;
        for (int i=10000;i<1000000;i++) {
            temp = i;
            shiWan = temp/100000;
            wan = temp%100000/10000;
            qian = temp%100000%10000/1000;
            bai = temp%100000%10000%1000/100;
            shi = temp%100000%10000%1000%100/10;
            ge = temp%100000%10000%1000%100%10;
            count = ge+shi+bai+qian+wan+shiWan;
            if (i<100000&&ge==wan&&shi==qian&&count==n) {
                System.out.println(i);
            } else if (i>=100000&&ge==shiWan&&shi==wan&&bai==qian&&count==n) {
                System.out.println(i);
            }
        }
    }
}
