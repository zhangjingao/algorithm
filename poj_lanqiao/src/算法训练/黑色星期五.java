package 算法训练;

import java.util.Scanner;

/**
 * @author zjg
 * @date 2018/3/30 10:25
 * @Description
 */
public class 黑色星期五 {

    private static int wuNum = 0;
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        yanZheng(n);
        System.out.println(wuNum);
    }

    private static int year (int year) {
        int days = 365;
        if ((year%4 == 0 && year%100 != 0)||year%400 == 0) {
            days = 366;
        }
        return days;
    }

    private static void yanZheng (int year) {
        int count = 0;
        for (int i = 1998; i < year; i++) {
            count += year(i);
        }
        count += 13;//1月
        judge(count);
        count += 18+13;//2
        judge(count);
        if (year(year) == 366) { //3
            count += 16+13;
        } else {
            count += 15+13;
        }
        judge(count);
        count += 18+13;//4
        judge(count);
        count += 17+13;//5
        judge(count);
        count += 18+13;//6
        judge(count);
        count += 17+13;//7
        judge(count);
        count += 18+13;//8
        judge(count);
        count += 18+13;//9
        judge(count);
        count += 17+13;//10
        judge(count);
        count += 18+13;//11
        judge(count);
        count += 17+13;//12
        judge(count);
    }

    private static void judge (int count) {
        if (count%7 == 2) {
            wuNum++;
        }
    }

}
