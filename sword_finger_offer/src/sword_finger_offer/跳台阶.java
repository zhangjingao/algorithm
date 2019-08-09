package sword_finger_offer;

/**
 * @author zjg
 * @ClassName 跳台阶
 * @Description 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * @Date 2019/8/8 14:19
 **/
public class 跳台阶 {

    public static void main(String[] args) {
        int result = work(3);
        System.out.println(result);
    }

    private static int work (int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return work(n - 1) + work(n - 2);
    }

}
