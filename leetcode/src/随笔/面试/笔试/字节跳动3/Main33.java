package 随笔.面试.笔试.字节跳动3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author zjg
 * @ClassName Main3
 * @Description TODO
 * @Date 2019/9/15 16:48
 **/
public class Main33 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        long[] nums = new long[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sca.nextInt();
        }
        long first = 0, two = 0;
        int flag = 0;
        int i = 0;
        int j = n -1;
        while (i <= j) {
            long temp = 0;
            if (nums[i] >= nums[j]) {
                temp = nums[i];
                i++;
            } else {
                temp = nums[j];
                j--;
            }
            if (flag == 0) {
                first += temp;
                flag = 1;
            } else {
                two += temp;
                flag = 0;
            }

        }
        System.out.println(first);
    }

}
