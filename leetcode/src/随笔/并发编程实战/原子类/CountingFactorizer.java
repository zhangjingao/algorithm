package 随笔.并发编程实战.原子类;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author zjg
 * <p> 2019/2/10 17:39 </p>
 */
public class CountingFactorizer {

    private final AtomicLong count = new AtomicLong(0);

    private long getCount () {
        return count.get();
    }

    public static void main(String[] args) {
        System.out.println(
                new CountingFactorizer().count+" "+new CountingFactorizer().count.incrementAndGet()
        );
    }

}
