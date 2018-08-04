package 基础练习;

import java.util.Scanner;

/**
 * @author zjg
 * @date 2018/3/22 18:19
 * @Description
 */
public class 数列特征 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int [] array = new int[n];
        int count=0;
        for (int i=0;i<n;i++) {
            array[i] = sca.nextInt();
            count +=array[i];
        }
        int temp;
        for (int j=1;j<n;j++) {
            if (array[0]<array[j]) {
                temp = array[j];
                array[j] = array[0];
                array[0] = temp;
            }
        }
        System.out.println(array[0]);
        for (int j=1;j<n;j++) {
            if (array[0]>array[j]) {
                temp = array[j];
                array[j] = array[0];
                array[0] = temp;
            }
        }
        System.out.println(array[0]+"\n"+count);
    }
}
