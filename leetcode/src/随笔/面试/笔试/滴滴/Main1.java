package 随笔.面试.笔试.滴滴;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author zjg
 * @ClassName Main
 * @Description TODO
 * @Date 2019/8/27 18:52
 **/
public class Main1 {



    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int[] arr = new int[n];
//        Stack<Character> oper = new Stack<>();
        char[] oper = new char[n - 1];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = sca.nextInt();
//            oper.push(sca.next().charAt(0));
            oper[i - 1] = sca.next().charAt(0);
        }
        arr[n - 1] = sca.nextInt();
        work(n , arr, oper);
        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i]+" "+oper[i]+" ");
        }
        System.out.println(arr[n - 1]);
    }

    private static void work(int n, int[] arr, char[] oper) {
     /*   boolean boo = true;
        while (true) {
            boo = false;*/
            int index = 1;
            int numIndex = n - 2;
            while (index < n) {
                //弹出最上面的数，取出倒数第二个数
                char oper1 = oper[numIndex];
                char oper2 = '%';
                if (numIndex > 0) {
                    oper2 = oper[numIndex - 1];
                }
//                System.out.println(oper1 + " " + oper2);
                //如果两者相等并且两者等于+或者*，可以交换
                if (oper1 == oper2 && (oper1 == '+' || oper1 == '*')) {
                    int tmp1 = arr[numIndex];
                    int tmp2 = arr[numIndex - 1];
//                    System.out.println(oper1 + " " + oper2 + " " + tmp1 + " " + tmp2);
                    if (tmp2 > tmp1) {
                        arr[numIndex - 1] = tmp1;
                        arr[numIndex] = tmp2;
//                        boo = true;
                    }
                } else if (oper1 == '*' || oper1 == '/') {
                    int tmp1 = arr[numIndex];
                    int tmp2 = arr[numIndex - 1];
//                    System.out.println(oper1 + " " + oper2 + "----- " + tmp1 + " " + tmp2);
                    if (tmp2 > tmp1) {
                        arr[numIndex - 1] = tmp1;
                        arr[numIndex] = tmp2;
                        numIndex--;
                        numIndex--;
                        index++;
//                        boo = true;
                    }
                }
                numIndex--;
                index++;
            }
       /*     if (!boo) {
                break;
            }*/
//        }
    }

}
