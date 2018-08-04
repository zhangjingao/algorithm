package 入门训练;

import java.util.Scanner;

import static java.lang.StrictMath.atan;

/**
 * @author zjg
 * @date 2018/3/20 22:09
 * @Description
 */
public class 圆面积 {

    public static void main(String[] args) {
        double pi = atan(1.0)*4;
        Scanner sca = new Scanner(System.in);
        int r = sca.nextInt();
        System.out.printf("%.7f",pi*r*r);
    }
}
