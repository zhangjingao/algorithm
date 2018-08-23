package code18_8_18;

/**
 * @author zjg
 * @date 2018/8/18 15:50
 * @Description
 */
public class ClimbingStairs_70 {

    public int climbStairs(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        int [] arr = new int[n];
        arr[0] = 1;
        arr[1] = 2;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n-1];
    }

    public static void main(String[] args) {

    }

}
