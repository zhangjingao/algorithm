package 随笔.面试.面经.alibaba;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author zjg
 * <p> 2019/4/2 22:35 </p>
 */
public class StackOverFlow {

    public static void main(String[] args) {
        int[] a;
        while (true) {
            int[] arr = new int[10];
            a = arr;
            System.out.println(a);
        }
    }


}
