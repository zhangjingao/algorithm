package 基础练习;

import java.util.Scanner;

/**
 * @author zjg
 * @date 2018/3/21 21:03
 * @Description
 */
public class 十进制转十六进制 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int a = sca.nextInt();
        String stringBuffer = "";
        int temp;
        if (a==0) {
            System.out.println(0);
            return;
        }
        while (a!=0) {
            temp = a%16;
            if (temp == 0) {
                stringBuffer = "0" +stringBuffer;
            } else if (temp == 1) {
                stringBuffer = "1" +stringBuffer;
            } else if (temp == 2) {
                stringBuffer = "2" +stringBuffer;
            } else if (temp == 3) {
                stringBuffer = "3" +stringBuffer;
            }else if (temp == 4) {
                stringBuffer = "4" +stringBuffer;
            }else if (temp == 5) {
                stringBuffer = "5" +stringBuffer;
            }else if (temp == 6) {
                stringBuffer = "6" +stringBuffer;
            }else if (temp == 7) {
                stringBuffer = "7" +stringBuffer;
            }else if (temp == 8) {
                stringBuffer = "8" +stringBuffer;
            }else if (temp == 9) {
                stringBuffer = "9" +stringBuffer;
            }else if (temp == 10) {
                stringBuffer = "A" +stringBuffer;
            }else if (temp == 11) {
                stringBuffer = "B" +stringBuffer;
            }else if (temp == 12) {
                stringBuffer = "C" +stringBuffer;
            }else if (temp == 13) {
                stringBuffer = "D" +stringBuffer;
            }else if (temp == 14) {
                stringBuffer = "E" +stringBuffer;
            }else if (temp == 15) {
                stringBuffer = "F" +stringBuffer;
            }
            a = a/16;
        }
        System.out.println(stringBuffer);
    }
}
