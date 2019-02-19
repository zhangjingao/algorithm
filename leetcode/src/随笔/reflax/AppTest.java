package 随笔.reflax;

/**
 * @author zjg
 * <p> 2018/11/1 15:11 </p>
 */
public class AppTest {

    private int count;

    public void noParam () {
        System.out.println("执行 noParam 方法");
    }

    public void intParam (int param) {
        System.out.println("执行 intParam 方法" + param);
    }

    public void stringParam (String param) {
        System.out.println("执行 stringParam 方法"+param);
    }

}
