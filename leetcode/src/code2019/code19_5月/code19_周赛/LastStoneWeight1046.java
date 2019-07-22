package code2019.code19_5月.code19_周赛;

import java.util.Arrays;

/**
 * @author zjg
 * <p> 2019/5/19 10:35 </p>
 */
public class LastStoneWeight1046 {

    public int lastStoneWeight(int[] stones) {
        if (stones.length == 1) {
            return stones[0];
        }
        Arrays.sort(stones);
        int index = stones.length - 1;
        while (index > 0) {
            int compare = index - 1;
            if (stones[index] == stones[compare]) { //两者都碎
                stones[index] = 0;
                stones[compare] = 0;
                index -= 2;
            } else {
                stones[compare] = stones[index] - stones[compare];
                stones[index] = 0;
                if (compare == 0) {
                    break;
                } else {
                    index--;
                    for (int i = compare - 1; i >= 0; i--) {
                        if (stones[i] > stones[i + 1]) {
                            int temp = stones[i];
                            stones[i] = stones[i + 1];
                            stones[i + 1] = temp;
                        } else {
                            break;
                        }
                    }
                }
            }
//            System.out.println(Arrays.toString(stones));
        }
        return stones[0];
    }

    public static void main(String[] args) {
        int[] arr = {9,3,2,10};
        System.out.println(
                new LastStoneWeight1046().lastStoneWeight(arr)
        );
    }

}
