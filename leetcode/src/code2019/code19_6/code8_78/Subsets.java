package code2019.code19_6.code8_78;

import java.util.*;

/**
 * @author zjg
 * <p> 2019/6/8 9:05 </p>
 */
public class Subsets {


    private List<List<Integer>> lists = new LinkedList<>();

    public List<List<Integer>> subsets(int[] nums) {
        LinkedList<Integer> temp = new LinkedList<>();

        //开始的结点
        for (int i = 0; i < nums.length; i++) {
            //长度
            for (int j = 1; j <= nums.length - i; j++) {
                work(nums, i, j, temp);
                temp.clear();
            }
        }
        return lists;
    }

    private void work(int[] nums, int start, int len, LinkedList<Integer> temp) {
        if (temp.size() == len) {
            lists.add((List<Integer>) temp.clone());
            temp.removeLast();
            return;
        }
        for (int i = start; i < nums.length; i++) {
//            System.out.println(start+" "+ len);
            temp.add(nums[i]);
            work(nums, start + 1, len, temp);
        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> result = new Subsets().subsets(arr);
        result.forEach(l -> {
                    System.out.println(Arrays.toString(l.toArray()));
                }
        );
    }

}
