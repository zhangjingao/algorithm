import java.util.concurrent.locks.Lock;

/**
 * 生产者消费者
 * @author zjg
 * <p> 2018/10/6 20:50 </p>
 */
public class Test {

    static int count = 0;
    static final String LOCK = "lock";

    public static void main(String[] args) {
        Test t = new Test();
        new Thread(t.new Produce()).start();
        new Thread(t.new Customer()).start();
        new Thread(t.new Produce()).start();
        new Thread(t.new Customer()).start();
        new Thread(t.new Produce()).start();
        new Thread(t.new Customer()).start();
        new Thread(t.new Produce()).start();
        new Thread(t.new Customer()).start();
        new Thread(t.new Produce()).start();
        new Thread(t.new Customer()).start();


    }

    class Produce implements Runnable {

        @Override
        public void run() {
          /*  for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
             }*/

             synchronized (LOCK) {
                while (count == 10) {
                    try {
                        LOCK.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                count++;
                 System.out.println(Thread.currentThread().getName()+" 生产者生产，当前共有："+count);
                 LOCK.notifyAll();
             }
        }
    }

    class Customer implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            synchronized (LOCK) {
                while (count == 0) {
                    try {
                        LOCK.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                count--;
                System.out.println(Thread.currentThread().getName()+" 消费者消费，目前剩余："+count);
                LOCK.notifyAll();
            }

        }
    }

}
