package 随笔.面试.面经.面经0908;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author zjg
 * @ClassName Main1
 * @Description TODO
 * @Date 2019/9/8 16:03
 **/
public class Main1 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int[] arr = new int[n - 1];

        int[] allNum = new int[n];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sca.nextInt();
            allNum[i] = i;
        }
        allNum[n - 1] = n - 1;
        List<List<Integer>> lists = permute(allNum, arr);
        System.out.println(lists.size());
    }

    private static List<List<Integer>> permute(int[] nums, int[] arr) {
        List<List<Integer>> listAll = new ArrayList<>();
        back(0,nums, listAll, arr);
        return listAll;
    }

    private static void back(int startIndex, int[] num, List<List<Integer>> listAll, int[] arr) {
        if (startIndex == num.length - 1) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < num.length; i++) {
                if (i != num.length - 1) {
                    if (arr[i] == 1 && num[i] < num[i + 1]) {
                        return;
                    }
                    if (arr[i] == 0 && num[i] > num[i + 1]) {
                        return;
                    }
                }
                list.add(num[i]);
            }
            listAll.add(list);
        } else {
            for (int i = startIndex; i < num.length; i++) {
                swap(i, startIndex, num);
                back(startIndex+1, num,listAll, arr);
                swap(i, startIndex, num);
            }
        }

    }

    private static void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
