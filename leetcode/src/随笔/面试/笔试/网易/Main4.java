package 随笔.面试.笔试.网易;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 14.29%
 * @author zjg
 * <p> 2019/4/2 20:29 </p>
 */
public class Main4 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String str = sca.nextLine();
        String[] arr = str.split(" ");
        int len = arr.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            list.add(Integer.parseInt(arr[i]));
        }
        int index = 0;
        int sum = 0;
        while (index < len) {
            int max = 0;
            int sumMaxTemp = 0;
            for (int i = 0; i < list.size(); i++) {
                int left = i - 1 < 0 ? 1 : list.get(i-1);
                int right = i + 1 >= list.size() ? 1 : list.get(i+1);
                int temp = left * right * list.get(i);
                if (left * right * list.get(i) > sumMaxTemp) {
                    max = i;
                    sumMaxTemp = temp;
                }
            }
            sum += sumMaxTemp;
            list.remove(max);
            index++;
        }
        System.out.println(sum);
    }

}
