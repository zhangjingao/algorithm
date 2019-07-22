package code2019.code19_5月.code1_77;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zjg
 * <p> 2019/5/1 21:19 </p>
 */
public class 全排列 {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> lists = new LinkedList<>();
        work(0,nums, lists);
        lists.forEach(System.out::println);
        return lists;
    }

    private void work(int index, int[] nums, List<List<Integer>> listList) {
        if (index == nums.length - 1) {
            List<Integer> list = new ArrayList<>(nums.length);
            for (int num : nums) {
                list.add(num);
            }
            listList.add(list);
        } else {
            for (int i = index; i < nums.length; i++) {
                swap(nums, i, index);
                work(index + 1, nums, listList);
                swap(nums, i, index);
            }
        }
    }

    private void swap(int[] nums, int i, int index) {
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;

    }

    public static void main(String[] args) {
        int[] arr = {0,-1,1};
        new 全排列().permute(arr);
    }

}
