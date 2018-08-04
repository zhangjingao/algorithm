package 算法训练;

import java.util.Scanner;

/**
 * @author zjg
 * @date 2018/3/30 15:39
 * @Description
 */
public class 快速排序 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sca.nextInt();
        }
        int min;
        int minVal;
        for (int i = 0; i < n; i++) {
            min = i;
            for (int j = i; j < n; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            if (min != i) {
                minVal = array[min];
                array[min] = array[i];
                array[i] = minVal;
            }
        }
        for (int i:array) {
            System.out.println(i);
        }
    }
}
