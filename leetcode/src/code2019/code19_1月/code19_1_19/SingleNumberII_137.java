package code2019.code19_1月.code19_1_19;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zjg
 * <p> 2019/1/19 15:23 </p>
 */
public class SingleNumberII_137 {

    public int singleNumber(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (counts.containsKey(nums[i])) {
                int temp = counts.get(nums[i]);
                counts.put(nums[i], ++temp);
            } else {
                counts.put(nums[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> e : counts.entrySet()) {
//            System.out.println(e.getKey()+" "+e.getValue());
            if (e.getValue() == 1) {
                return e.getKey();
            }
        }
        return 0;
    }
/*
    网上解法：
    1：为下面代码，2：先排序再判断前三者是否相等
    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0;
        for (int num : nums) {
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
            System.out.println(ones+" "+twos);
            System.out.println();
        }
        return ones;
    }
*/

    public static void main(String[] args) {
//        System.out.println(
//                new SingleNumberII_137().singleNumber(new int[]{-2, -2, 1, 1, -3, 1, -3, -3, -4, -2})
//        );
//        System.out.println(
//                new SingleNumberII_137().singleNumber(new int[]{-2, -2, 1, 1, -3, 1, -3, -3, -4, -2}, 0)
//        );
        System.out.println(31&4);
    }

}
