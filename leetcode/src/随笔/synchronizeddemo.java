package 随笔;

/**
 * @author zjg
 * <p> 2018/10/31 22:15 </p>
 */
public class synchronizeddemo implements Runnable {
    static int i = 0;

    public synchronized void increase() {
        i++;
    }

    @Override
    public void run() {
        for (int j = 0; j < 100; j++) {
            System.out.println("线程名字为："+Thread.currentThread().getName());
            increase();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        //new新实例
        Thread t1 = new Thread(new synchronizeddemo(),"t1");
        //new新实例
        Thread t2 = new Thread(new synchronizeddemo(),"t2");
        t1.start();
        t2.start();
        //join含义:当前线程A等待thread线程终止之后才能从thread.join()返回
//        t1.join();
//        t2.join();
        System.out.println("线程名字为："+Thread.currentThread().getName()+" "+i);
    }
}