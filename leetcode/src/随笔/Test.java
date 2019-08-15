package 随笔;

import java.util.Arrays;
import java.util.List;

/**
 * @author zjg
 * <p> 2019/6/10 22:39 </p>
 */
public class Test {


    public static void main(String[] args) {
/*        int a =100,b=50,c=a---b,d=a---b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        String s = ",1";
        System.out.println(Arrays.toString(s.split(","))+" "+s.split(",").length);

        SD sd = new SD();
        sd.a = 30;
        createM (sd);
        System.out.println(sd.a+" "+sd.b);

        List list = Arrays.asList("2", "3", "1");
        list.forEach(System.out::println);*/

        long num = 0L;
        System.out.println(Integer.MIN_VALUE + " " + Integer.MAX_VALUE);
        for (int i = Integer.MIN_VALUE; i < Integer.MAX_VALUE; i++) {
            num++;
        }
        System.out.println( ((double)2147483647 * 4) / 1024 / 1024 / 1024);
        System.out.println("num: "+num+" "+(4294967296L ) / ((long)1024 * 1024 * 1024));
        System.out.println((long)4 * 1024 * 1024 * 1024 );
    }

    private static void createM(SD sd) {
        sd.a = 90;
        sd.b = 80;
    }

}

class SD {

    int a = 10;
    int b = 20;

}