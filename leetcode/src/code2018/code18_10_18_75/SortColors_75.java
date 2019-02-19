package code2018.code18_10_18_75;

/**
 * @author zjg
 * <p> 2018/10/18 16:41 </p>
 */
public class SortColors_75 {

    public void sortColors(int[] nums) {
        int temp;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        new SortColors_75().sortColors(new int[]{2,0,2,1,1,0});
    }

}
