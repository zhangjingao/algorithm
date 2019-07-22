package code2019.code19_5月.code12_16;

import java.util.Arrays;

/**
 * @author zjg
 * <p> 2019/5/12 9:06 </p>
 */
public class Sum3Closest {

    // O(n^3)
    /*
    public int threeSumClosest(int[] nums, int target) {
        int lastSum = 0;
        int differe = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int nowSum = nums[i] + nums[j] + nums[k];
                    int nowDiff = Math.abs(nowSum - target);
                    if (nowDiff < differe) {
                        lastSum = nowSum;
                        differe = nowDiff;
                    }
                }
            }
        }
        return lastSum;
    }

*/
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int lastSum = 0;
        int differe = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1, right = nums.length - 1;
            int nowSum = 0;
            while (left < right) {
                nowSum = nums[i] + nums[left] + nums[right];
                int nowDiff = Math.abs(nowSum - target);        //  1,2,5,10,11
//                System.out.println(nowSum+" "+nowDiff+ " ");
                if (nowDiff < differe) {
                    lastSum = nowSum;
                    differe = nowDiff;
                }
                if (nowSum > target) {
                    right--;
                } else if (nowSum < target) {
                    left++;
                } else {
                    return nowSum;
                }
//                System.out.println(nowSum+" "+i+" "+left+" "+ right);
            }

        }
        return lastSum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,5,10,11};
        System.out.println(
                new Sum3Closest().threeSumClosest(arr, 12)
        );
    }

}
