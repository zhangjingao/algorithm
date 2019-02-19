package code2019.code19_1_26;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zjg
 * <p> 2019/1/26 16:20 </p>
 */
public class GrayCode_89 {

    public List<Integer> grayCode(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(0);
        }
        List<Integer> lists = new LinkedList<>();
        allSort(stringBuilder.toString().toCharArray(), 0, lists);

        return null;
    }

    private void allSort(char[] arr, int index, List<Integer> lists) {
//        System.out.println("index: "+index);
        if (index == arr.length) {
            System.out.println(arr);
        } else {
            for (int i = index; i < arr.length; i++) {
                System.out.println(i + " -1- " + index);
                arr = swap(arr, i, index);
                allSort(arr, i + 1, lists);
                System.out.println(i + " -2- " + index);
                arr = swap(arr, i, index);
            }
        }
    }

    private char[] swap(char[] arr, int i, int j) {
//        System.out.println(i+" "+j);
        if (arr[i] == 1 && i != j) {
            arr[i] = 0;
        } else if (arr[i] == 0 && i != j) {
            arr[i] = 1;
        }
        return arr;
    }


    public static void main(String[] args) {
        new GrayCode_89().grayCode(2);
    }

}
