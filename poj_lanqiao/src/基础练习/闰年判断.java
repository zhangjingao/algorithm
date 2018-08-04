package 基础练习;

import java.util.Scanner;

/**
 * @author zjg
 * @date 2018/3/23 11:32
 * @Description
 */
public class 闰年判断 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int year = sca.nextInt();
        if ((year%4==0&&year%100!=0)||year%400==0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
