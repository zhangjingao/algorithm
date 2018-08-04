package 基础练习;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author zjg
 * @date 2018/3/24 8:54
 * @Description
 */
public class huffman {

    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        List<Integer> lists = new ArrayList<Integer>(n);
        for (int i = 0;i < n;i++) {
            lists.add(sca.nextInt());
        }
        System.out.println(sort(lists));
    }

    public static int sort(List<Integer> lists) {
        int temp;
        int cost = 0;
        if (lists.size()==1) {
            return 0;
        }
        for (int i = 0;i < 2;i++) {
            for (int j = i+1;j < lists.size();j++) {
                if (lists.get(i) > lists.get(j)) {
                    temp = lists.get(j);
                    lists.set(j,lists.get(i));
                    lists.set(i,temp);
                }
            }
        }
        cost = lists.get(0) + lists.get(1);
        lists.set(0,cost);
        lists.remove(1);
        return cost+sort(lists);
    }
}
