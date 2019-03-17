package 随笔.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @author zjg
 * <p> 2019/1/30 18:41 </p>
 */
public class StreamApi {

    public static void main(String[] args) {
        List<Integer> lists = Arrays.asList(10,2,3,4,5,5);
        //自加自身
        lists.stream().map((x)-> x + x).forEach(System.out::println);

        //累加
        System.out.println(
                lists.stream().map((x)-> x + x).reduce((x, y) -> x + y ).get()
        );
        System.out.println("取前三个");
        //取前三个
        lists.stream().limit(3).forEach(System.out::print);

        System.out.println("去重");
        //去重
        lists.stream().distinct().forEach(System.out::print);
        //排序
        System.out.println("排序");
        lists.stream().sorted().forEach(System.out::print);

    }

}
