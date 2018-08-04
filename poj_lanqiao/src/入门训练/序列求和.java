package 入门训练;

import java.util.Scanner;

/**
 * @author zjg
 * @date 2018/3/20 22:18
 * @Description
 */
public class 序列求和 {

    public static void main(String[] args) {
       Scanner sca = new Scanner(System.in);
       int n = sca.nextInt();
       long count = 1;
       long temp = count+n;
       if (n==1) {
           System.out.println(count);
       } else if (n%2==0) {
           count = temp*(n/2);
           System.out.println(count);
       } else {
           count = temp*(n/2)+n/2+1;
           System.out.println(count);
       }
    }
}
