package 算法训练;

import java.util.*;

/**
 * @author zjg
 * <p> 2018/11/17 16:58 </p>
 */
public class 出现次数最多的整数 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        if (n < 1 || n > 20) {
            return;
        }
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0, maxTemp = 0;
        for (int i = 0; i < n; i++) {
            int temp = sca.nextInt();
            if (map.containsKey(temp)) {
                map.put(temp, map.get(temp)+1);
            } else {
                map.put(temp, 1);
            }
            if (map.get(temp) > max) {
                max = map.get(temp);
                maxTemp = temp;
            }
            if (map.get(temp) == max) {
                maxTemp = temp > maxTemp ? maxTemp : temp;
            }
        }
        System.out.println(maxTemp);
    }


}
