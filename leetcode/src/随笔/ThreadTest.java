package 随笔;

import java.util.concurrent.*;

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
/*        for (int i = 0 ; i < 10; i++) {
            new Thread(new RunableImpl()).start();
            System.out.println(Thread.currentThread().getName()+"  main第"+i+"要睡会了");
        }*/
        ExecutorService exe = Executors.newCachedThreadPool();
        for (int i = 0; i < 3; i++) {
            Future future = exe.submit(new FutureTask(new CallableImpl()));
            try {
                System.out.println((future.get()));
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        exe.shutdown();
        System.out.println("enter here");



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
class CallableImpl implements Callable {

    @Override
    public Object call() throws Exception {
        System.out.println("enter callable");
        Thread.sleep(3* 1000);
        System.out.println("exit callable");
        return "sdsds";
    }
}
