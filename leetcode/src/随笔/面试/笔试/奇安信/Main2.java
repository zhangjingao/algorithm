package 随笔.面试.笔试.奇安信;

import java.util.Scanner;

public class Main2 {


    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int total =(int) Math.pow(2, n) - 1;
        int[] arr = new int[total];
        for (int i = 0; i < total; i++) {
            arr[i] = sca.nextInt();
        }
        if (n <= 0 ) {
            System.out.println(-1);
            return;
        }
        int key1 = sca.nextInt();
        int key2 = sca.nextInt();
        work(arr, key1, key2);
    }

    private static void work(int[] arr, int key1, int key2) {
        int index1 = 0;
        int index2 = 0;
        //far
        int index11 = 0;
        int index21 = 0;
        boolean boo1 = true, boo2 = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key1) {
                index1 = i;
                boo1 = false;
            }
            if (arr[i] == key2) {
                index2 = i;
                boo2 = false;
            }
            if(!boo1 && !boo2) {
                break;
            }
        }
        if(boo1 || boo2) {
            System.out.println(-1);
            return;
        }
        if (index1 == index2) {
            System.out.println(arr[index1]);
            return;
        }
        if (index1 != index2){
            index11 = getFar(index1);
            index21 = getFar(index2);
            if (index11 == index21) {
                System.out.println(arr[index11]);
                return;
            }
            while (true) {
                while (index11 < index21) {
                    index21 = getFar(index21);
                }
                if (index21 < 0) {
                    System.out.println(-1);
                    return;
                }
                if (index11 == index21) {
                    System.out.println(arr[index11]);
                    return;
                }
                while (index11 > index21) {
                    index11 = getFar(index11);
                }
                if (index11 < 0) {
                    System.out.println(-1);
                    return;
                }
                if (index11 == index21) {
                    System.out.println(arr[index11]);
                    return;
                }
                System.out.println(index11 +" "+index21);
            }

        }
    }

    private static int getFar(int index1) {
        if (index1 % 2 == 0) {
            return (index1 - 2) / 2;
        }
        return (index1 - 1) / 2;
    }

}
