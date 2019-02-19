package code2018.code18_11_24;

import java.util.LinkedList;
import java.util.List;

/**
 * @author zjg
 * <p> 2018/11/24 21:57 </p>
 */
public class EliminationGame_390 {

    public int lastRemaining2(int n) {
        List<Integer> lists = new LinkedList<Integer>();
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            if (n % 2 != 0) {
                n = n-1;
            }
            for (int i = 1; i <= n; i++) {
                lists.add(i);
            }

            while (lists.size() > 1) {
                int index = lists.size();
                while (index-- > 0 && lists.size() > 1) {
                    lists.remove(index);
                    index--;
                }
                index = 0;
                while (index < lists.size() && lists.size() > 1) {
                    lists.remove(index);
                    index++;
                }
            }
            System.out.println(lists.get(0));
            return lists.get(0);
        }
    }
    public int lastRemaining3(int n) {
        n = n % 2 == 0 ? n : n-1;
        int count = 0;
        int differe = 2;
        int index = 0;
        int temp = 0;
        while (count < n) {
            while (count < n && index < n) {
                count++;
                index+=differe;
            }
            index--;
            differe *= 2;
            while (count < n && index > 0) {
                count++;
                index+=differe;
            }

        }

        return 0;
    }

    public int lastRemaining(int n) {

        boolean leftToRight = true;
        int step = 1, head = 1, remaining = n;

        while (remaining != 1) {

            if (leftToRight || remaining % 2 == 1)
                head += step;
            remaining /= 2;
            step *= 2;
            leftToRight = !leftToRight;
        }
        return head;
    }

    public static void main(String[] args) {
        new EliminationGame_390().lastRemaining(9);
    }

}
