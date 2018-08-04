package 算法提高;

import java.util.Scanner;

/**
 * @author zjg
 * @date 2018/5/20 14:45
 * @Description
 */
public class 最小乘积 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int num,arr[][];
        for (int i = 0; i < n; i++) {
            num = sca.nextInt();
            arr = new int[2][num];
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < num; k++) {
                    arr[j][k] = sca.nextInt();
                }
            }
            out(arr);
        }
    }

    private static void out (int [][] arr) {
        int tempIndex,temp;
        for (int i = 0; i < arr[0].length; i++) {
            tempIndex = i;
            for (int j = i+1; j < arr[0].length; j++) {
                if (arr[0][tempIndex] > arr[0][j]) {
                    tempIndex = j;
                }
            }
            temp = arr[0][tempIndex];
            arr[0][tempIndex] = arr[0][i];
            arr[0][i] = temp;
        }
        for (int i = 0; i < arr[1].length; i++) {
            tempIndex = i;
            for (int j = i+1; j < arr[1].length; j++) {
                if (arr[1][tempIndex] < arr[1][j]) {
                    tempIndex = j;
                }
            }
            temp = arr[1][tempIndex];
            arr[1][tempIndex] = arr[1][i];
            arr[1][i] = temp;
        }
        int sum = 0;
        for (int i = 0; i < arr[0].length; i++) {
            sum += arr[0][i]*arr[1][i];
        }
        System.out.println(sum);
    }
}
