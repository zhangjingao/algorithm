package 随笔.面试.笔试.度小满2;

import java.util.Scanner;

/**
 * @author zjg
 * @ClassName Main2
 * @Description TODO
 * @Date 2019/9/15 20:04
 **/
public class Main2 {

    private static int total = 0;

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int a = sca.nextInt();
        int b = sca.nextInt();
        int c = sca.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sca.nextInt();
        }
        int[] isInPath = new int[n];
        work(arr, a, b, c, 0, 0, isInPath);
    }

    private static void work(int[] arr, int a, int b, int c, int index, int cost, int[] isInPath) {
        if (index == arr.length) {
            if (cost < total) {
                total = cost;
            }
            return;
        }
        //被走过
        if (isInPath[index] != 0) {
            return;
        }
        //第一种
        int[] isInPathOne = isInPath.clone();
        isInPathOne[index] = 1;
        work(arr.clone(), a, b, c, arr[index], cost + a, isInPathOne);
        //第二种
        if (arr[index] > 0) {
            int[] arrTwo = arr.clone();
            arrTwo[index]--;
            work(arrTwo, a, b, c, index, cost + b, isInPath);
        }
        //第三种
        if (arr[index] < arr.length) {
            int[] arrThree = arr.clone();
            arrThree[index]++;
            work(arrThree, a, b, c, index, cost + c, isInPath);
        }
    }

}
