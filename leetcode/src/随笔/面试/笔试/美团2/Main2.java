package 随笔.面试.笔试.美团2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author zjg
 * @ClassName Main2
 * @Description TODO
 * @Date 2019/8/22 16:34
 **/
public class Main2 {

    public static void work(String[] arr) {
        List<Character> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean haveChar = true;
            int index = 0;
            while (haveChar) {
                for (int j = 0; j < arr.length; j++) {

                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String str = sca.nextLine();
        String[] arr = str.split(" ");
        work(arr);
    }

}
