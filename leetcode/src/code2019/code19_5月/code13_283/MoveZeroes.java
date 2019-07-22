package code2019.code19_5月.code13_283;

/**
 * @author zjg
 * <p> 2019/5/13 9:06 </p>
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int index2 = -1;
        if (nums.length > 1) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    //记录非0元素的地址
                    if (index2 == -1) {
                        index2 = i;
                    }
                    while (++index2 < nums.length) {
                        if (nums[index2] != 0) {
                            nums[i] = nums[index2];
                            nums[index2] = 0;
                            break;
                        }
                    }
                    if (index2 == nums.length - 1) {
                        break;
                    }
                }
            }
        }
    }

}
