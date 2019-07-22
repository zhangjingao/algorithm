package 随笔.面试.笔试.alibaba;

/**
 * @author zjg
 * <p> 2019/4/12 19:46 </p>
 */
import java.util.*;

public class Main1 {

    static String calculate(int m, int k) {
        int[] arr = new int[m];
        if (m <= 3) {
            String str =  "4"+",2020,";
            if (k == 1) {
                str += "4";
            } else if (k == 2) {
                str += "3";
            } else if (k == 3) {
                str += "2";
            }
            return str;
        }
        arr[0] = 2;
        arr[1] = 3;
        arr[2] = 4;
        int index = 3;

        while (index < m) {
            arr[index] = arr[index - 2] + arr[index - 3];
            index++;
        }
        String result = String.valueOf(arr[m-1]);
        long[] arrResult = new long[m];
        for (int i = 0; i < 5; i++) {
            arrResult[i] = arr[i];
        }
        for (int i = 5; i < m; i++) {
            char[] chars  = String.valueOf(arr[i]).toCharArray();
            for (int j = 0; j < chars.length/2; j++) {
                char temp = chars[j];
                chars[j] = chars[chars.length-j-1];
                chars[chars.length-j-1] = temp;
            }
            try {
                arrResult[i] = Long.parseLong(new String(chars));
            } catch (Exception e) {
                System.out.println(Arrays.toString(chars)+"---");
                e.printStackTrace();
                return "";
            }
        }
        //求m出生年，斐波那契
        int f1 = 2, f2 = 3;
        int year = 3;
        while (f2 < m) {
            int temp = f1;
            f1 = f2;
            f2 = f1 + temp;
            year++;
        }
        result += ","+(year-2+2019);
        //求中奖猪

        Arrays.sort(arrResult);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrResult));

        char[] chars  = String.valueOf(arrResult[m-k]).toCharArray();
        for (int j = 0; j < chars.length/2; j++) {
            char temp = chars[j];
            chars[j] = chars[chars.length-j-1];
            chars[chars.length-j-1] = temp;
        }
        int target = Integer.parseInt(new String(chars));
        for (int i = 0; i < m; i++) {
            if (target == arr[i]) {
                result += ","+(i+1);
                break;
            }
        }
        return result;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] line = in.nextLine().split(",");
        int m = Integer.valueOf(line[0]);
        int k = Integer.valueOf(line[1]);;
        System.out.println(calculate(m, k));

    }
}
