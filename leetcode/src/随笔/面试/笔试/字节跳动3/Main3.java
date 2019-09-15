package 随笔.面试.笔试.字节跳动3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author zjg
 * @ClassName Main3
 * @Description TODO
 * @Date 2019/9/15 16:48
 **/
public class Main3 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        List<Integer> lists = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            lists.add(sca.nextInt());
        }
        int total = 0;
        while (!lists.isEmpty()) {
            int len = lists.size();
            if (lists.get(0) >= lists.get(len - 1)) {
                total += lists.get(0);
                lists.remove(0);
            } else {
                total += lists.get(len - 1);
                lists.remove(len - 1);
            }
        }
        System.out.println(total);
    }

}
