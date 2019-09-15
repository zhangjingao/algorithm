package 随笔.面试.笔试.美团2;

import java.util.Scanner;

/**
 * 82%
 * @author zjg
 * @ClassName Main1
 * @Description TODO
 * @Date 2019/8/22 16:05
 **/
public class Main1 {

    public static void work(String str) {
        if (str == null || str.length() == 0) {
            System.out.print(0+" ");
            return;
        }
        char[] arr = str.toCharArray();
        if (arr.length == 1) {
            System.out.print(1+" ");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            //这一段的起点
            int startFirst = i;
            int endLast = arr.length;
            for (int j = i; j < endLast; j++) {
                int start = j;
                char starttmp = arr[j];
                //这一段的终点
                int end = j;
                int k = arr.length - 1;
                for (k = arr.length - 1; k > start; k--) {
                    if (starttmp == arr[k]) {
                        end = k;
                        if (end > endLast || endLast == arr.length) {
                            endLast = end;
                        }
                        break;
                    }
                }
                if (k == start) {
                    break;
                }
            }
            if (endLast == arr.length) {
                endLast = startFirst;
            }
            System.out.print(endLast-startFirst + 1+" ");
            i = endLast;
        }

    }

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String str = sca.next();
        work(str);

    }



}
