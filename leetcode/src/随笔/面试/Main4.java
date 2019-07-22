package 随笔.面试;

/**
 * @author zjg
 * <p> 2019/1/18 14:55 </p>
 */
public class Main4 {

    //这里写一个4G的数，每个线程读500M的数作为处理了500M的数据文件
    public static volatile int num = 4 * 1024 * 1024;

    public static void main(String[] args) {
        Main4 main4 = new Main4();
        new Thread(new Work(main4),"线程1").start();
        new Thread(new Work(main4),"线程2").start();
        new Thread(new Work(main4),"线程3").start();
        new Thread(new Work(main4),"线程4").start();
        new Thread(new Work(main4),"线程5").start();
        new Thread(new Work(main4),"线程6").start();
        new Thread(new Work(main4),"线程7").start();
        new Thread(new Work(main4),"线程8").start();
    }

}

class Work implements Runnable {

    //获得文件剩余数据量
    private Main4 main4;

    public Work (Main4 main4) {
        this.main4 = main4;
    }

    @Override
    public void run() {
        for (int i = 0; i < 512 * 1024; i++) {
            synchronized (main4) {
                Main4.num = Main4.num - 1;
                System.out.println(Thread.currentThread().getName() + "处理了 " + Main4.num);
            }
        }

    }
}
