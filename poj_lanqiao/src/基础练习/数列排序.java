package 基础练习;

import java.util.Scanner;

/**
 * @author zjg
 * @date 2018/3/21 15:05
 * @Description
 */
public class 数列排序 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int []array = new int[n];
        for (int i=0;i<n;i++) {
            array[i] = sca.nextInt();
        }
        int temp;
        for (int i=0;i<n;i++) {
            for (int j=i+1;j<n;j++) {
                if (array[i]>array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        for (int a:array) {
            System.out.print(a+" ");
        }
    }
}
