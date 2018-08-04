package acmpage16;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author zjg
 * @date 2018/5/7 19:52
 * @Description
 */
public class CutNecklace {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while (sca.hasNext()) {
            int n = sca.nextInt();
            int [][] arr = new int[2][n];
            arr[0][0] = n;
            arr[0][1] = sca.nextInt();
            arr[0][2] = sca.nextInt();
            for (int i = 0; i < n; i++) {
                arr[1][i] = sca.nextInt();
            }
            cutNeck(arr[0][1],arr[0][2],arr[1]);
        }
    }

    private static void cutNeck (int l, int u, int [] arr) {
        int lSum = 0,uSum = 0;
        for (int i = 0; i < arr.length; i++ ) {
            int lSumTemp = countLU(i,l,arr);
            if (lSumTemp > lSum) {
                lSum = lSumTemp;
            }
            int uSumTemp = countLU(i,u,arr);
            if (uSumTemp > uSum) {
                uSum = uSumTemp;
            }
        }
        if (lSum > uSum) {
            System.out.println(lSum+"/"+l);
        } else {
            System.out.println(uSum+"/"+u);
        }
    }

    private static int countLU (int i, int lu,int[] arr) {
        int temp = 0;
        int len = arr.length;
        int sum = 0;
        for (int j = i; j < i+lu; j++) {
            if (j >= len) {
                temp = j;
                j = j-len;
                sum += arr[j];
                j = temp;
            } else {
                sum += arr[j];
            }
        }
        return sum;
    }
}
