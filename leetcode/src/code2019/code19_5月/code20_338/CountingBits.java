package code2019.code19_5月.code20_338;

import java.util.Arrays;

/**
 * @author zjg
 * <p> 2019/5/20 20:54 </p>
 */
public class CountingBits {

/*    public int[] countBits(int num) {
        int[] arr = new int[num + 1];
        arr[0] = 0;
        int index = 1;
        while (index <= num) {
            int temp = 0;
            int tempValue = index;
            while ((tempValue /= 2) != 0) {
                temp++;
            }
            //正好相等则不用再减
            if (Math.pow(2,temp) == index) {
                arr[index] = 1;
            } else {            //不相等则当前数减去上一次得到的平方值
                arr[index] = arr[(int) (index - Math.pow(2,temp))] + 1;
            }
            index++;
        }
        return arr;
    }*/

    public int[] countBits(int num) {
        int[] arr = new int[num + 1];
        arr[0] = 0;
        if (num <= 0) {
            return arr;
        }
        arr[1] = 1;
        //当前执行到的数
        int index = 1;
        //当前到达的平方数
        int powNum = 0;
        //上次到达的数
        int powSum = (int) Math.pow(2, powNum + 1);
        while (++index <= num) {
            if (index == powSum) {
                arr[index] = 1;
                powNum++;
                powSum = (int) Math.pow(2, powNum + 1);
            } else {
                arr[index] = arr[index - powSum / 2] + 1;
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        int arr = 12;

        System.out.println(
                Arrays.toString(new CountingBits().countBits(arr))
        );

    }

}
