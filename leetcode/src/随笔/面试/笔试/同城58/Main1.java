package 随笔.面试.笔试.同城58;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author zjg
 * @ClassName Main1
 * @Description TODO
 * @Date 2019/9/12 20:33
 **/
public class Main1 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String str = sca.nextLine();
        if ("".equals(str)){
            System.out.println(0);
            return;
        }
        String[] arr = str.split(",");
        if (arr.length == 1) {
            System.out.println(1);
            return;
        }
        HashSet<String> set = new HashSet<>(Arrays.asList(arr));
        System.out.println(set.size());
//        int result = 0;
//        for (int i = 0; i < arr.length; i++) {
//            String tmp1 = arr[i];
//            result++;
//            int j = i + 1;
//            for (; j < arr.length; j++) {
//                String tmp2 = arr[j];
//                if (!tmp1.equals(tmp2)) {
//                    break;
//                }
//            }
//            i = j;
//        }
//        if (!arr[arr.length - 1].equals(arr[arr.length - 2])) {
//            result++;
//        }
//        System.out.println(result);
    }

}
