package 随笔.并发编程实战.线程池;

import java.util.concurrent.*;

/**
 * @author zjg
 * <p> 2019/3/18 9:49 </p>
 */
public class ThreadPoolExecutorTest {

    public void testConstructor () {

        ArrayBlockingQueue<Runnable> arrayBlockingQueue = new ArrayBlockingQueue<Runnable>(10);
        ThreadPoolExecutor executor1 = new ThreadPoolExecutor(4,10,
                600, TimeUnit.SECONDS, arrayBlockingQueue);

        ThreadPoolExecutor executor2 = new ThreadPoolExecutor(4,10,
                600, TimeUnit.SECONDS, arrayBlockingQueue, Executors.defaultThreadFactory());


        RejectedExecutionHandler rejectedExecutionHandler = new ThreadPoolExecutor.DiscardOldestPolicy();
        ThreadPoolExecutor executor3 = new ThreadPoolExecutor(4,10,
                600, TimeUnit.SECONDS, arrayBlockingQueue,Executors.defaultThreadFactory(),
                rejectedExecutionHandler);



        Object k;

    }


}
