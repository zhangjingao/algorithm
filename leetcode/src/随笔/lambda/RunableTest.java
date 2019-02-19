package 随笔.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @author zjg
 * <p> 2019/1/30 17:44 </p>
 */
public class RunableTest {

    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("sd");
        new Thread(runnable).start();

        new Thread(
                ()->System.out.println("lambda")
        ).start();
        printArr();
    }

    private static void printArr () {
        List<Integer> lists = Arrays.asList(1,2,3,4,5);
        lists.forEach(System.out::println);


    }

}
