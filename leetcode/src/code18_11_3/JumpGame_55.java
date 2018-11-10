package code18_11_3;

import java.util.concurrent.locks.Lock;

/**
 * @author zjg
 * <p> 2018/11/3 16:13 </p>
 */
public class JumpGame_55 {

    public boolean canJump(int[] nums) {
        int index = 0;//当前位置
        int discount = 0;//可以达到的最远距离
        for (int i = 0; i < nums.length-1 && index <= discount; i++) {
            discount = Math.max(discount, index+nums[i]);
            index++;
        }
        return discount >= nums.length-1;
    }

    public static void main(String[] args) {
        System.out.println(
                new JumpGame_55().canJump(new int[]{0,2,3})
        );
    }

}
