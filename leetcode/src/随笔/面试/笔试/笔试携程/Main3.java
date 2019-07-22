package 随笔.面试.笔试.笔试携程;

import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/4/8 20:15 </p>
 */
public class Main3 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            String tempArrI = sca.next();
            if (tempArrI.charAt(0) == '/') {
                tempArrI = tempArrI.substring(1,tempArrI.length());
            }
            if (tempArrI.charAt(tempArrI.length()-1) == '/') {
                tempArrI = tempArrI.substring(0,tempArrI.length()-1);
            }
            arr[i] = tempArrI;
        }
        if (n == 0) {
            System.out.print(0);
        } else {
            for (int i = 0; i < n; i++) {
                int count = 1;
                for (int j = i-1; j >= 0; j--) {
                    if (arr[i].equals(arr[j])) {
                        count++;
                    }
                }
                String[] temp = arr[i].split("/");
                if (temp.length == 1) {
                    System.out.print(1+" ");
                } else {
                    System.out.print("1");
                    for (int j = 1; j < temp.length - 1; j++) {
                        System.out.print(count);
                    }
                    System.out.print("1" + " ");
                }
            }
        }
    }
}
