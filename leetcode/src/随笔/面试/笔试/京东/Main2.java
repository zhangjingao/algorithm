package 随笔.面试.笔试.京东;

import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/4/13 19:51 </p>
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int m = sca.nextInt();
        String[] arr = new String[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sca.next();
        }
        String str = sca.next();
        System.out.println(m);

    }

}
