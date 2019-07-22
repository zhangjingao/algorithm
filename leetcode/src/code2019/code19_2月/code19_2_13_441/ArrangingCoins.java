package code2019.code19_2月.code19_2_13_441;

/**
 * @author zjg
 * <p> 2019/2/13 20:36 </p>
 */
public class ArrangingCoins {

    //数学法
/*
    public int arrangeCoins(int n) {
        if (n == 1) {
            return 1;
        }
        int row = 1;
        int addCount = 2;
        long lastSum = row;
        while (lastSum <= n) {
            lastSum += addCount;
            addCount++;
            row++;
        }
        return row-1;
    }
*/

    // 二分法
    public int arrangeCoins(int n) {
        long left = 1,right = n;
        long mid ,sum = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            sum = (mid + 1) * (mid / 2);
            sum += mid % 2 != 0 ?  (mid + 1) / 2 : 0;
            if (sum <= n && sum + mid + 1 > n) {
                return (int)mid;
            } else if (sum > n) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        System.out.println(
                new ArrangingCoins().arrangeCoins(8)
        );
    }

}
