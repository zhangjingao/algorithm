package 随笔.面试.笔试.携程2;

/**
 * @author zjg
 * @ClassName Main3
 * @Description TODO
 * @Date 2019/9/4 20:27
 **/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main3 {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int schedule(int num, int[] arr) {
        if (arr.length <= num) {
            int result = -1;
            for (int i : arr) {
                result = result > i ? result : i;
            }
            return result;
        }
        int sum = 0, sumTmp = 0;
        for (int value : arr) {
            sumTmp += value;
        }
        while (sum != sumTmp - 1) {
            int mid = (sum + sumTmp) / 2;
            if (work(arr, mid) > num) {
                sum = mid;
            } else {
                sumTmp = mid;
            }
        }
        return sumTmp;
    }

    public static int work(int[] arr, int mid) {
        int index = 1, step = 0;
        for (int i = 0; i != arr.length; i++) {
            if (arr[i] > mid) {
                return Integer.MAX_VALUE;
            }
            step += arr[i];
            if (step > mid) {
                index++;
                step = arr[i];
            }
        }
        return index;
    }

    /******************************结束写代码******************************/


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int size = in.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        int res = schedule(m, array);
        System.out.println(String.valueOf(res));
    }
}

