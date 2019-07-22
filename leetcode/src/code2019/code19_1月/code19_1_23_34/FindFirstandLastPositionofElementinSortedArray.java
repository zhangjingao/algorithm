package code2019.code19_1月.code19_1_23_34;

import java.util.Arrays;

/**
 * @author zjg
 * <p> 2019/1/23 15:42 </p>
 */
public class FindFirstandLastPositionofElementinSortedArray {

    //双指针法， 8ms
    /*public int[] searchRange(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            if (nums[i] == target) {
                int j;
                for(j = i+1; j < nums.length; j++){
                    if (nums[j] != target) {
                        return new int[]{i,j-1};
                    }
                }
                return new int[]{i,j-1};
            }
        }
        return new int[]{-1,-1};
    }*/
    //二分法
    public int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int mid;
        int index1 = -1,index2 = -1;
        while (left <= right) {
            if (nums[left] == target && index1 == -1) {
                index1 = left;
            }
            if (nums[right] == target && index2 == -1) {
                index2 = right;
            }
            if (index1 != -1 && index2 != -1) {
                return new int[]{index1, index2};
            }
            mid = left + right >> 1;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                if (index1 == -1) {
                    left++;
                }
                if (index2 == -1) {
                    right--;
                }
            }
        }
        return new int[]{index1, index2};
    }

    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(new FindFirstandLastPositionofElementinSortedArray()
                        .searchRange(new int[]{1,4}, 4))
        );
    }

}
