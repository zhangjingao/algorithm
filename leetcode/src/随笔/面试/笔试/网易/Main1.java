package 随笔.面试.笔试.网易;

import java.util.Scanner;

/** 60%
 * @author zjg
 * <p> 2019/4/2 19:09 </p>
 */
public class Main1 {

    public static void main (String[] args) {
        Scanner sca = new Scanner(System.in);
        String content = sca.nextLine();
        String[] arr = content.split(" ");
        int len = arr.length;
        for (int i = 0; i < len / 2; i++) {
            String tempLeft = arr[i];
            tempLeft = replace(tempLeft);
            String tempRight = arr[len - i - 1];
            tempRight = replace(tempRight);
            arr[i] = tempRight;
            arr[len - i - 1] = tempLeft;
        }
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static String replace (String temp) {
        if (temp.indexOf('.') != -1) {
            temp = '.'+temp.substring(0,temp.length()-1);
        } else if (temp.indexOf('-') != -1) {
            temp = replace(temp.split("-")[1])+"-"+replace(temp.split("-")[0]);
        } else if (temp.indexOf(',') != -1) {
            temp = ','+temp.substring(0,temp.length()-1);
        } else if (temp.contains("'s")) {
            temp = "s'"+temp.substring(0,temp.length()-2);
        } else if (temp.indexOf('?') != -1) {
            temp = '?'+temp.substring(0,temp.length()-1);
        } else if (temp.indexOf('!') != -1) {
            temp = '!'+temp.substring(0,temp.length()-1);
        } else if (temp.indexOf(':') != -1) {
            temp = ':'+temp.substring(0,temp.length()-1);
        } else if (temp.contains("'re")) {
            temp = "re'"+temp.substring(0,temp.length()-3);
        }
        return temp;
    }

}
