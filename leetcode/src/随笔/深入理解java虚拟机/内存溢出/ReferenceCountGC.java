package 随笔.深入理解java虚拟机.内存溢出;

/**
 * @author zjg
 * <p> 2019/1/24 8:54 </p>
 *
 *
 * 垃圾回收——引用计数法
 *
 */
public class ReferenceCountGC {

    private Object instance = null;

    private byte[] bigSize = new byte[2 * 1024 * 1024];

    private static void testGc () {

        ReferenceCountGC rcGc1 = new ReferenceCountGC();
        ReferenceCountGC rcGc2 = new ReferenceCountGC();
        //循环引用
        rcGc1.instance = rcGc2;
        rcGc2.instance = rcGc1;

        rcGc1 = null;
        rcGc1 = null;
        //此时调用gc
        System.gc();
    }

    public static void main(String[] args) {
        testGc();
    }


}
