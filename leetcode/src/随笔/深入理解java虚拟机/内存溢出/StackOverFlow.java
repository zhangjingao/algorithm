package 随笔.深入理解java虚拟机.内存溢出;

/**
 * @author zjg
 * <p> 2019/1/23 21:11 </p>
 *
 * 测试本地虚拟机栈溢出
 */
public class StackOverFlow {

    public static void main(String[] args) {

        //单线程下的栈溢出
//        oneThreadstackOverFlow();

        while (true) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    manyThreadException();
                }
            }).start();
        }

    }


    /*
    测试虚拟机栈溢出
    Exception in thread "main" java.lang.StackOverflowError
    	at 随笔.深入理解java虚拟机.StackOverFlow.main(StackOverFlow.java:12)
    	at 随笔.深入理解java虚拟机.StackOverFlow.main(StackOverFlow.java:12)
    	at 随笔.深入理解java虚拟机.StackOverFlow.main(StackOverFlow.java:12)
    */
    private static void oneThreadstackOverFlow () {
        oneThreadstackOverFlow();
    }

    /**
     测试多线程虚拟机栈溢出，由于使用了多线程，1映射到了操作系统的多线程内核，
     此操作会导致操作系统假死

     */
    private static void manyThreadException () {
        while (true);
    }

}
