package 随笔.面试.笔试.字节跳动3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author zjg
 * @ClassName Main1
 * @Description TODO
 * @Date 2019/9/15 16:01
 **/
public class Main1 {

    private static int total = 0;

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
//        int[] arr = new int[n];
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sca.nextInt());
        }
        int k = sca.nextInt();
        permute(arr, k);
    }

    private static void permute(List<Integer> nums, int k) {
        for (int i = 0; i < nums.size(); i++) {
            int a = nums.get(i);
            if (a >= k) {
                break;
            }
            for (int j = i + 1; j < nums.size(); j++) {
                int b = nums.get(j);
                if (a + b >= k) {
                    System.out.println(total);
                    return;
                }
                int value = k - a - b;
                int index = nums.indexOf(value);
                if (index != -1) {
                    if (index <= j) {
                        continue;
                    }
                    total += index - j - 1;
                    break;
                } else {
                    int indexTemp = j + 1;
                    for (int l = j + 1; l < nums.size(); l++) {
                        if (nums.get(l) > value) {
                            indexTemp = l;
                        }
                    }
                    total += indexTemp - j - 1;
                }

            }
        }

        System.out.println(total);
    }

    private static boolean work(int[] nums, int k, int mid, int left, int right) {
        int sum = nums[mid] + nums[left] + nums[right];
        if (sum < k) {
            total++;
            return true;
        }
        return false;
    }

}
