package 基础练习;

import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/3/16 16:23 </p>
 */
public class 时间转换 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int seconds = sca.nextInt();
        System.out.println((seconds / 3600) +":"+ (seconds % 3600 / 60)+":"+(seconds % 3600 % 60));
    }

}
