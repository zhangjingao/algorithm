package 随笔.面试.笔试.科大讯飞;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author zjg
 * <p> 2019/2/23 14:56 </p>
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        List<Integer> lists = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String oper = sca.next();
            if ("push".equals(oper)) {
                push(lists,sca.nextInt());
            } else if ("pop".equals(oper)) {
                pop(lists);
            } else if ("delete".equals(oper)) {
                delete(lists, sca.nextInt());
            } else {
                query(lists);
            }
        }
    }

    private static void push (List<Integer> lists, int v) {
        lists.add(v);
    }

    private static void pop (List<Integer> lists) {
        int len = lists.size();
        if (len == 0) {
            return;
        }
        lists.remove(len-1);
    }

    private static void delete (List<Integer> lists, int v) {
        for (int i = lists.size() - 1; i >= 0; i--) {
            if (lists.get(i) == v) {
                lists.remove(i);
                return;
            }
        }
    }

    private static void query (List<Integer> lists) {
        if (lists.size() == 0) {
            System.out.println(0);
            return;
        }
        System.out.println(lists.get(lists.size()-1));
    }


}
