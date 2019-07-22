package 随笔.lambda;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.function.Predicate;

/**
 * 测试java8默认实现
 * @author zjg
 * <p> 2019/5/17 8:31 </p>
 */
public class InterfaceImpl {
//                    implements InterfaceTest{

    public static void main(String[] args) {
        FutureTask futureTask = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {
                System.out.println("sd");
                return null;
            }
        });
        futureTask.run();
//        new InterfaceImpl().test();
//        String mess = "mess";
        InterfaceTest interfaceTest = "s"::equals;
        System.out.println(interfaceTest.funcationInterface("ssdsd"));
        System.out.println(interfaceTest.funcationInterface("s"));
    }

}

interface InterfaceTest {

    Object funcationInterface(String mess);

    default void test(){
        System.out.println("default method");
    }

}

class test implements Callable {

    @Override
    public Object call() throws Exception {
        return null;
    }
}