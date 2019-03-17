package 随笔.面试.面经;

import java.util.Scanner;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zjg
 * <p> 2019/3/17 8:52 </p>
 */
public class 多线程循环打印编号 {


    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        sca.close();
        printf p = new printf();
        for (int i = 0; i < n; i++) {
            new Thread(p,"线程"+i).start();

        }
    }

    static class printf implements Runnable {

        static int num = 0;

        @Override
        public void run() {
            String name = Thread.currentThread().getName();
            int index = name.charAt(name.length() - 1) - '0';
            while (num <= 100) {
                synchronized (printf.class) {
                    if (index != num % 3) {
                        continue;
                    } else {
                        System.out.println(Thread.currentThread().getName()+" "+num++);
                    }
                }
            }
        }

    }

}