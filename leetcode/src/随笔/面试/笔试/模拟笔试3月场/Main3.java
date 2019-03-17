package 随笔.面试.笔试.模拟笔试3月场;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/3/14 20:20 </p>
 */
public class Main3 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int[] arrA = new int[n];
        int[] arrB = new int[n];
        for (int i = 0; i < n; i++) {
            arrA[i] = sca.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arrB[i] = sca.nextInt();
        }
        Arrays.sort(arrA);
        Arrays.sort(arrB);
        int indexA = n-1;
        int indexB = n-1;
        int sumA = 0, sumB = 0;
        while (indexA >= 0) {
            if (arrA[indexA] >= arrB[indexB]) {
                sumA += arrA[indexA];
                indexA--;
            } else {
                indexB--;
            }
            if (indexB >= 0 && indexA >= 0) {
                if (arrA[indexA] > arrB[indexB]) {
                    indexA--;
                } else {
                    sumB += arrB[indexB];
                    indexB--;
                }
            } else {
                sumB += arrB[indexB];
            }
        }
        System.out.println(sumA-sumB);

    }

}
