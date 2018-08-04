package 基础练习;

import java.util.Scanner;

/**
 * @author zjg
 * @date 2018/3/21 20:46
 * @Description
 */
public class 十六进制转十进制 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String sixTheen = sca.next();
        char temp;
        int tempNum = 0;
        long count = 0;
        for (int i=0;i<sixTheen.length();i++) {
            temp = sixTheen.charAt(i);
            switch (temp){
                case '0': tempNum = 0;break;
                case '1': tempNum = 1;break;
                case '2': tempNum = 2;break;
                case '3': tempNum = 3;break;
                case '4': tempNum = 4;break;
                case '5': tempNum = 5;break;
                case '6': tempNum = 6;break;
                case '7': tempNum = 7;break;
                case '8': tempNum = 8;break;
                case '9': tempNum = 9;break;
                case 'A': tempNum = 10;break;
                case 'B': tempNum = 11;break;
                case 'C': tempNum = 12;break;
                case 'D': tempNum = 13;break;
                case 'E': tempNum = 14;break;
                case 'F': tempNum = 15;break;
                default:break;
            }
            count = (long) (count + tempNum * (Math.pow(16, sixTheen.length() - 1 - i)));
        }
        System.out.println(count);
    }
}
