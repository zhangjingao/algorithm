package 随笔.面试.笔试.奇安信;

import java.util.*;

/**
 * @author zjg
 * @ClassName Main1
 * @Description TODO
 * @Date 2019/9/9 19:00
 **/
public class Main1 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String strA = sca.nextLine();
        String strB = sca.nextLine();
        String[] arrA = strA.split(" ");
        String[] arrB = strB.split(" ");
        String key = sca.nextLine();
        List<String> list = new LinkedList<>();
        list.add(key);
        work(Arrays.asList(arrA), Arrays.asList(arrB), list, 0);
    }

    private static void work(List<String> arrA, List<String> arrB, List<String> list, int total) {
        if (list.size() <= 0) {
            System.out.println(total);
        } else {
            List<String> list1 = new LinkedList<>();
            for (String s : list) {
                for (int i = 0; i < arrB.size(); i++) {
                    if (arrB.get(i).equals(s)) {
                        list1.add(arrA.get(i));
                    }
                }
            }
            total += list.size();
            work(arrA,  arrB, list1, total);
        }
    }

}
