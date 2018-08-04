package 算法训练;

/**
 * @author zjg
 * @date 2018/3/29 21:00
 * @Description
 */
public class 求完数 {

    public static void main(String[] args) {

        for (int i = 2; i < 10000; i++) {
            getYinShu(i);
        }
    }

    private static void getYinShu (int n) {
        int count = 1;
        for (int i = 2; i < n; i++) {
            if (n%i == 0) {
                count += i;
            }
        }
        if (count == n) {
            System.out.println(n);
        }
    }
}
