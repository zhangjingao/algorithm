package code18_10_6;

/**
 * @author zjg
 * <p> 2018/10/6 15:32 </p>
 */
public class IntegerBreak_343 {


    public int integerBreak(int n) {
        int max[] = new int[n+1];
        max[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i-1; j++) {
                max[i] = Math.max(max[i],Math.max(j*max[i-j],j*(i-j)));
            }
        }
        return max[n];
    }

    public static void main(String[] args) {
        System.out.println(
                new IntegerBreak_343().integerBreak(10)
        );
    }

}
