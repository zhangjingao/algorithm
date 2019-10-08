package 随笔.面试.笔试.转转58;

import java.util.*;

/**
 * @author zjg
 * @ClassName Main2
 * @Description TODO
 * @Date 2019/9/16 20:54
 **/
public class Main2 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String str = sca.nextLine();
        String[] arr = str.split(",");
        Map<Integer, Integer> num = new HashMap<>();
        for (String i : arr) {
            int temp = Integer.parseInt(i);
            if (num.containsKey(temp)) {
//                num.replace(temp, num.get(temp) - 1);
                num.replace(temp, num.get(temp), num.get(temp) - 1);
                System.out.println(num.get(temp)+"---");
            }
            num.put(temp, temp);
        }
        int result = 0;
        for (Integer i : num.keySet()) {
            int temp = i;
            System.out.println(i+" "+ num.get(i));
            if (num.get(i) < 0) {
                temp += 0 - num.get(i);
            }
            if (i > 0) {
                result += temp + 1;
            }
        }

        System.out.println(result);
    }


}
