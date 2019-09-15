package 随笔.面试.笔试.美团2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 82%
 * @author zjg
 * @ClassName Main1
 * @Description TODO
 * @Date 2019/8/22 16:05
 **/
public class Main11 {

    public static void work(String str) {
        int[] last = new int[26];
        for (int i = 0; i < str.length(); i++) {
            last[str.charAt(i) - 'A'] = i;
        }
        List<Integer> res = new ArrayList<>();
        int preIndex = -1;
        int maxIndex = 0;
        for (int i = 0; i < str.length(); i++) {
            int index = last[str.charAt(i) - 'A'];
            if (index > maxIndex) {
                maxIndex = index;
            }
            if (i == maxIndex) {
                res.add(maxIndex - preIndex);
                preIndex = maxIndex;
            }
        }
        for (Integer re : res) {
            System.out.println(re);
        }
    }

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String str = sca.next();
        work(str);

    }



}
