package code18_8_4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zjg
 * @date 2018/8/4 15:34
 * @Description
 */
public class Permutations_46 {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> listAll = new ArrayList<>();
        back(0,nums, listAll);
        return listAll;
    }

    private void back (int startIndex, int [] num, List<List<Integer>> listAll) {
        if (startIndex == num.length - 1) {
            List<Integer> list = new ArrayList<>();
            for (int n : num) {
                list.add(n);
            }
            listAll.add(list);
        } else {
            for (int i = startIndex; i < num.length; i++) {
                swap(i, startIndex, num);
                back(startIndex+1, num,listAll);
                swap(i, startIndex, num);
            }
        }

    }

    private void swap (int i, int j, int [] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        List<List<Integer>> lists = new Permutations_46().permute(arr);
        lists.forEach(t->{
            t.forEach(System.out::print);
            System.out.println();
        });
    }
}
