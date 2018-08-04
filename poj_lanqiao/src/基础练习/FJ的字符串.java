package 基础练习;

import java.util.Scanner;

/**
 * @author zjg
 * @date 2018/3/26 11:40
 * @Description
 */
public class FJ的字符串 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        System.out.println(write("A",'A',n));
    }

    public static String write (String now,char start,int end) {
        if (start-64 == end) {
            return now;
        }
        String string = now+""+(++start)+""+now;
        return write(string,start,end);
    }
}
