package code2019.code19_2月.code19_2_28_414;

/**
 * @author zjg
 * <p> 2019/2/28 8:34 </p>
 */
public class ThirdMaximumNumber_414 {

/*    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        if (nums.length >= 3) {
            int index = 0;
            for (int i = nums.length - 1; i >= 0; i--) {
                if (i == 0 && nums[i] != nums[i+1]) {
                    index++;
                }
                if (i != 0 && nums[i] != nums[i - 1]) {
                    index++;
                }
                if (index == 3) {
                    return nums[i];
                }
            }
        }
        return nums[nums.length-1];
    }*/

    public int thirdMax(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int maxIndex = i;
            for (int j = i; j < nums.length; j++) {
                if (nums[maxIndex] < nums[j]) {
                    maxIndex = j;
                }
            }
            swap(nums, maxIndex, i);
            if (i == 0) {
                max++;
            } else if (nums[i] != nums[i-1]) {
                max++;
            }
            if (max == 3) {
                return nums[i];
            }
        }
        return nums[0];
    }

    private void swap (int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
