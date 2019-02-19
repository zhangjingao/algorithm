package 随笔;

/**
 * @author zjg
 * <p> 2019/1/18 14:55 </p>
 */
public class ThreadTemp {

    public static void main(String[] args) {


        NoCompete compete = new NoCompete(10,11);
        Thread thread1 = new Thread(compete,"线程1");
        Thread thread2 = new Thread(compete,"线程2");
        thread1.start();
        thread2.start();
    }

}

class NoCompete implements Runnable {

    private int a, b;

    NoCompete(int a, int b) {
        this.a = a;
        this.b = b;
    }

//    同步方法，无实际竞争
    private synchronized void count1() {
//        ....do something
        System.out.println("线程名称："+Thread.currentThread().getName()+": "+a+"+"+b+"= "+(a+b));
    }

//    同步方法，有实际竞争
    private synchronized void count2() {
        a++;
        b++;
        System.out.println("线程名称："+Thread.currentThread().getName()+": "+a+"+"+b+"= "+(a+b));
    }

    @Override
    public void run() {
        try {
            //睡1s，模仿做了一些业务逻辑，拉长业务线，容易看到抢占cpu
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count1();
    }
}
