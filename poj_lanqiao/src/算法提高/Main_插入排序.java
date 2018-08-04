package 算法提高;

import java.util.Scanner;

/**
 * @author zjg
 * @date 2018/5/24 18:34
 * @Description
 */
public class Main_插入排序 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++ ) {
            arr[i] = sca.nextInt();
        }
        int [] arrSort = new int[n];
        arrSort[0] = arr[0];
        System.out.println("Insert element[1]:"+"\n"+"Init:"+arrSort[0]+"\nFinal:"+arrSort[0]);

        int j = 0;
        int temp;
        int k;
        for (int i = 1; i < n; i++) {
            arrSort[i] = arr[i];
            insert(i+1);
            init(true,arrSort,i+1);
            for (j = i; j > 0; j--) {
                temp = arrSort[j];
                for (k = j; k > 0; k--) {
                    if (arrSort[k-1] >  temp) {
                        arrSort[k] = arrSort[k-1];
                        moveBack(arrSort,i+1);
                    } else {
                        break;
                    }
                }
                arrSort[k] = temp;
            }
            init(false,arrSort,i+1);
        }

    }

    private static void insert (int n) {
        System.out.println("Insert element["+n+"]:");
    }

    private static void init (boolean isInit,int[] arr,int len) {
        if (isInit) {
            System.out.print("Init:");
        } else {
            System.out.print("Final:");
        }
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void moveBack (int []arr,int len) {
        System.out.print("Move back:");
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
