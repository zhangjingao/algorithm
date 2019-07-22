package 随笔.面试.笔试.字节跳动2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/7/2 19:40 </p>
 */
public class Main2 {

    static int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int[][] arr = new int[n][3];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sca.nextInt();
            arr[i][1] = sca.nextInt();
            arr[i][2] = sca.nextInt();
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd");
        Date dateBefore = null;
        long dataBLong = 0;
        try {
            dateBefore = sdf.parse("2012 3 12");
            dataBLong = dateBefore.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < n; i++) {
            try {
                Date date = sdf.parse(arr[i][0]+" "+arr[i][1]+" "+arr[i][2]);
                System.out.println((date.getTime() - dataBLong)/86400000);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }

}
