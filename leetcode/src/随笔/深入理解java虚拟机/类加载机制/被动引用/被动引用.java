package 随笔.深入理解java虚拟机.类加载机制.被动引用;

/**
 * @author zjg
 * <p> 2019/1/25 17:48 </p>
 *
 *
 *
 */
public class 被动引用 {

    public static void main(String[] args) {
//        被动引用1();
        被动引用2();
//        被动引用3();
    }

    /**
     *
     * 被动引用1：利用子类调用父类的静态变量，会初始化父类，而不会初始化子类
     * 运行结果：
     *      父类被初始化
     *      zjg
     *
     */
    private static void 被动引用1 (){
        System.out.println(SubClass.VALUE);
    }

    /**
     * 被动引用2：通过数组定义引用不会初始化类
     * 运行结果：无内容
     *
     *
     */
    private static void 被动引用2 (){
        SuperClass [] superClasses = new SuperClass[10];
    }

    /**
     * 被动引用3：调用类的常量不会初始化该类。在编译阶段就会将常量放入常量池。
     * 运行结果：
     *      HELLO_WORD
     *
     */
    private static void 被动引用3 (){
        System.out.println(SubClass.HELLOWORD);
    }

}

class SuperClass {

    public static String VALUE = "zjg";

    static {
        System.out.println("父类被初始化");
    }
}
class SubClass extends SuperClass{

    protected static final String HELLOWORD = "HELLO_WORD";

    static {
        System.out.println("子类被初始化");
    }

}
