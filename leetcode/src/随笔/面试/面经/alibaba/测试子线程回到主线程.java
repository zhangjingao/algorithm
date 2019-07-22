package 随笔.面试.面经.alibaba;

import java.util.concurrent.CountDownLatch;

/**
 * @author zjg
 * <p> 2019/4/2 22:22 </p>
 */
public class 测试子线程回到主线程 {

    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(10);
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+"： 我想睡觉，我要睡觉啦");
                try {
                    Thread.sleep(3*1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"我醒啦");
                latch.countDown();
            }).start();
        }
        try {
            System.out.println("主线程到这了，哇吼吼，我是乖宝宝哦，我等着子线程");
            latch.await();
            System.out.println("子线程都结束了");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
