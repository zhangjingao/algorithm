package 随笔.面试.笔试.滴滴;

import javafx.scene.transform.Scale;

import java.util.Scanner;

/**
 * @author zjg
 * @ClassName Main
 * @Description TODO
 * @Date 2019/8/27 18:52
 **/
public class Main {



    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int total = sca.nextInt();
        int cost = sca.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sca.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sca.nextInt();
        }
        work(n, arr1, arr2, total, cost);

    }

    private static void work(int n, int[] arr1, int[] arr2, int total, int cost) {
        int index1 = n - 1;
        int index2 = n - 1;
        while (cost < total) {
            

        }


    }

}
