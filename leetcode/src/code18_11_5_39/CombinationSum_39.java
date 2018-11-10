package code18_11_5_39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author zjg
 * <p> 2018/11/6 20:17 </p>
 */
public class CombinationSum_39 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(candidates);
        get(results, new ArrayList<Integer>(), target, 0, candidates.length-1, candidates);
        return null;
    }

    public void get (List<List<Integer>> results, List<Integer> temp, int target, int sum, int index, int[] candidates) {
        if (sum == target) {
            List list = temp;
            results.add(list);
            temp = new ArrayList<>();
        } else {
            if (sum < target && index > 0) {
                while (index >= 0) {
                    while (sum < target) {
                        sum += candidates[index];
                        temp.add(candidates[index]);
                        System.out.print(candidates[index]);
                    }
                    if (sum == target) {
                        get(results, temp, target, sum, index - 1, candidates);
                    }
                    sum -= candidates[index];
//                    temp.remove(temp.size()-1);
                    index--;
                }
            }
        }

    }



    public static void main(String[] args) {
        System.out.println(
                new CombinationSum_39().combinationSum(new int[]{2,3,5}, 8)
        );
    }

}
