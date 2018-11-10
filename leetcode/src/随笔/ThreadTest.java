package 随笔;

import static java.lang.Thread.sleep;

/**
 * @author zjg
 * <p> 2018/10/18 14:52 </p>
 */
public class ThreadTest {

    public static void main(String[] args) {

/*        for (int i = 0 ; i < 10; i++) {
            new ThreadImpl(i+"线程").start();
        }*/
        for (int i = 0 ; i < 10; i++) {
            new Thread(new RunableImpl()).start();
            System.out.println(Thread.currentThread().getName()+"  main第"+i+"要睡会了");
        }
    }

}
class ThreadImpl extends Thread {

    public ThreadImpl(String name) {
        super(name);
    }

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            try {
                System.out.println(getName()+"第"+i+"要睡会了");
                sleep(1000);
                System.out.println(getName()+"醒了");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class RunableImpl implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                System.out.println(Thread.currentThread().getName()+"第"+i+"要睡会了");
                sleep(1000);
                System.out.println(Thread.currentThread().getName()+"醒了");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
