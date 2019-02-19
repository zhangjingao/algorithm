package code2018.code18_11_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zjg
 * <p> 2018/11/3 20:03 </p>
 */
public class Sum3_15 {

/*
    我的代码，未ac
   public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> sum3s;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] > 0) {
                break;
            }
            for (int j = i+1; j < len; j++) {
                if (nums[j] + nums[i] > 0 && nums[j] >= 0) {
                    break;
                }
                for (int k = j+1; k < len; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        sum3s = new ArrayList<>(3);
                        sum3s.add(nums[i]);
                        sum3s.add(nums[j]);
                        sum3s.add(nums[k]);
                        if (!lists.contains(sum3s)) {
                            lists.add(sum3s);
                        }
                    }
                }
            }
        }
        return lists;
    }*/

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        int i,j,k,reserve;
        for(i=0;i<nums.length-2;i++){
            reserve=-nums[i];
            j=i+1;
            k=nums.length-1;
            while(j<k){
                if(nums[j]+nums[k]==reserve){
                    List<Integer> tmp=new ArrayList<Integer>();
                    tmp.add(nums[i]);
                    tmp.add(nums[j]);
                    tmp.add(nums[k]);
                    result.add(tmp);
                    j++;
                    while(j<k && nums[j-1]==nums[j]){
                        j++;
                    }
                    k--;
                }
                else if(nums[j]+nums[k]<reserve){
                    j++;
                    while(j<k && nums[j-1]==nums[j]){
                        j++;
                    }
                } else{
                    k--;
                }
            }
            while(i+1<nums.length-2 && nums[i]==nums[i+1]){
                i++;
            }
        }
        return result;

    }
}
