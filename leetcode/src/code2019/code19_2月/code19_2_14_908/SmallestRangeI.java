package code2019.code19_2月.code19_2_14_908;

import java.util.Arrays;

/**
 * @author zjg
 * <p> 2019/2/14 9:29 </p>
 */
public class SmallestRangeI {

    public int smallestRangeI(int[] A, int K) {
        Arrays.sort(A);
        return A[A.length - 1] - A[0] <= K * 2 ? 0 : A[A.length - 1] - A[0] - 2 * K;
    }

    public static void main(String[] args) {
        System.out.println(
                new SmallestRangeI().smallestRangeI(new int[]{10,7,1},3)
        );
    }

}
