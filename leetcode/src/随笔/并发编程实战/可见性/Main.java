package 随笔.并发编程实战.可见性;

/**
 * @author zjg
 * <p> 2019/2/13 16:32 </p>
 */
public class Main {

    private static int number;
    private static boolean ready;

    public static void main(String[] args) {
        Main main = new Main();
        new Thread(main.new ReadNumber()).start();
        number = 33;
        ready = true;
    }

    class ReadNumber implements Runnable {

        @Override
        public void run() {
            while (!ready) {
                Thread.yield();//将该线程变为就绪状态，再次抢夺cpu执行
            }
            System.out.println(number);
        }
    }

}
