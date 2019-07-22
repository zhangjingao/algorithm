package 随笔.深入理解java虚拟机.内存溢出;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zjg
 * <p> 2019/1/23 20:58 </p>
 *
 * 测试堆溢出
 */
public class HeapOom {

    /**
     设置运行参数 -Xms20M -Xmx20M -XX:+HeapDumpOnOutOfMemoryError
     OOM异常
     java.lang.OutOfMemoryError: Java heap space
     Dumping heap to java_pid17072.hprof ...
     Heap dump file created [28459533 bytes Main1 0.199 secs]

     * */

    public static void main(String[] args) {
        List list = new ArrayList();
        while (true) {
//            int a = 0;
            list.add(1);
//            list.add(new TestClass());
//            new TestClass();
        }
    }

}

class TestClass {

}