package 算法训练;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author zjg
 * @date 2018/3/31 8:43
 * @Description
 */
public class 集合运算 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int [] arrayA = new int[n];
        for (int i = 0; i < n; i++ ) {
            arrayA[i] = sca.nextInt();
        }
        int m = sca.nextInt();
        int [] arrayB = new int[m];
        for (int i = 0; i < m; i++) {
            arrayB[i] = sca.nextInt();
        }
        sort(arrayA);
        sort(arrayB);
        int i = 0,j = 0;
        List lists = new ArrayList(arrayA.length);//交集最多
        while (i < arrayA.length && j < arrayB.length) {
            if (arrayA[i] == arrayB[j]) {
                j++;
                System.out.print(arrayA[i++]+" ");
            } else if (arrayA[i] > arrayB[j]) {
                j++;
            } else if (arrayA[i] < arrayB[j]) {
                i++;
            }
        }
        System.out.println();
        i = 0;j = 0;
        while (i < arrayA.length && j < arrayB.length) {
            if (arrayA[i] == arrayB[j]) {
                j++;
                System.out.print(arrayA[i++]+" ");
            } else if (arrayA[i] > arrayB[j]){
                System.out.print(arrayB[j++]+" ");
            }
            else if (arrayA[i] < arrayB[j]) {
                System.out.print(arrayA[i++]+" ");
            }
        }
        if (i >= arrayA.length) {
            while (j < arrayB.length) {
                System.out.print(arrayB[j++]+" ");
            }
            System.out.println();
        }
        if (j >= arrayB.length) {
            while (i < arrayA.length) {
                System.out.print(arrayA[i++]+" ");
            }
            System.out.println();
        }
        System.out.println();

    }

    private static void sort (int[] array) {
        int temp,tempValue;
        for (int i = 0; i < array.length; i++) {
            temp = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[temp] > array[j]) {
                    temp = j;
                }
            }
            if (temp != i) {
                tempValue = array[i];
                array[i] = array[temp];
                array[temp] = tempValue;
            }
        }
    }

}
