package 基础练习;

import java.util.Scanner;

/**
 * @author zjg
 * @date 2018/3/21 15:27
 * @Description
 */
public class 十六进制转八进制 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        String [] sixTheens = new String[n];
        for (int i=0;i<n;i++) {
            sixTheens[i] = sca.next();
        }
        for (int i=0;i<n;i++) {
            count(sixTheens[i]);
        }
    }

    public static void count(String sixTheen){
        StringBuffer stringBuffer = new StringBuffer();
        for (int i=0;i<sixTheen.length();i++) {
            switch (sixTheen.charAt(i)) {
                case '0' : stringBuffer.append("0000");break;
                case '1' : stringBuffer.append("0001");break;
                case '2' : stringBuffer.append("0010");break;
                case '3' : stringBuffer.append("0011");break;
                case '4' : stringBuffer.append("0100");break;
                case '5' : stringBuffer.append("0101");break;
                case '6' : stringBuffer.append("0110");break;
                case '7' : stringBuffer.append("0111");break;
                case '8' : stringBuffer.append("1000");break;
                case '9' : stringBuffer.append("1001");break;
                case 'A' : stringBuffer.append("1010");break;
                case 'B' : stringBuffer.append("1011");break;
                case 'C' : stringBuffer.append("1100");break;
                case 'D' : stringBuffer.append("1101");break;
                case 'E' : stringBuffer.append("1110");break;
                case 'F' : stringBuffer.append("1111");break;
                default:break;
            }
        }
        String eight = stringBuffer.toString();
        if (eight.length()%3 == 1) {
            eight = "00"+eight;
        } else if (eight.length()%3 == 2) {
            eight = "0"+eight;
        }
        int begin = 0;
        if ("000".equals(eight.substring(0,3))) {
            begin = 3;
        }
        String temp;
        StringBuffer eightFinal = new StringBuffer();
        for (int i=begin;i<eight.length()-2;i+=3) {
            temp = eight.substring(i,i+3);
            if ("000".equals(temp)) {
                eightFinal.append("0");
            } else if ("001".equals(temp)) {
                eightFinal.append("1");
            } else if ("010".equals(temp)) {
                eightFinal.append("2");
            } else if ("011".equals(temp)) {
                eightFinal.append("3");
            } else if ("100".equals(temp)) {
                eightFinal.append("4");
            } else if ("101".equals(temp)) {
                eightFinal.append("5");
            } else if ("110".equals(temp)) {
                eightFinal.append("6");
            } else if ("111".equals(temp)) {
                eightFinal.append("7");
            }
        }
        System.out.println(eightFinal);
    }
}
