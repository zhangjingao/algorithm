package code2019.code19_3_4_413;

/**
 * @author zjg
 * <p> 2019/3/4 16:57 </p>
 */
public class ArithmeticSlices {

    public int numberOfArithmeticSlices(int[] A) {
        if (A.length < 3) {
            return 0;
        }
        int count = 0;//本次多的等差数列数
        int d = A[1] - A[0];
        int sum = 0;
        for (int i = 2; i < A.length; i++) {
            int d2 = A[i] - A[i-1];
            if (d2 == d) {
                count++;
                sum += count;
            } else {
                count = 0;
            }
            d = d2;
        }
        return sum;
    }

}
