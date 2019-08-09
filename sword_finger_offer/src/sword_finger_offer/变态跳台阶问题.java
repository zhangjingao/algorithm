package sword_finger_offer;

/**
 * @author zjg
 * @ClassName 变态跳台阶问题
 * @Description 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * @Date 2019/8/8 14:28
 **/
public class 变态跳台阶问题 {

    /**
     * 每次跳台阶是它前面所有数的方式的和
     */
    private static void work (int n) {
        //i位的数表示到达台阶i的方式
        int[] arr = new int[n + 1];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            int sum = 0;
            for (int j = i - 1; j >= 0; j--) {
                sum += arr[j];
            }
            arr[i] = sum;
        }
        System.out.println(arr[n]);
    }


    public static void main(String[] args) {
        work(3);
    }

}
