package 基础练习;

import java.util.Scanner;

/**
 * @author zjg
 * @date 2018/3/25 11:06
 * @Description
 */
public class 报时助手 {

    static StringBuffer stringBuffer = new StringBuffer();

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String time = sca.nextLine();
        String [] times = time.split(" ");
        int hour = Integer.parseInt(times[0]);
        int minSecond = Integer.parseInt(times[1]);
        if (minSecond==0) {
            read(hour);
            stringBuffer.append(" o'clock");
        } else {
            read(hour);
            read(minSecond);
        }
        System.out.println(stringBuffer);
    }

    public static void read(int time){
        if (time > 50) {
            stringBuffer.append("fifty ");
            read(time-50);
        } else if (time > 40) {
            stringBuffer.append("forty ");
            read(time-40);
        } else if (time > 30) {
            stringBuffer.append("thirty ");
            read(time-30);
        } else if (time > 20) {
            stringBuffer.append("twenty ");
            read(time-20);
        }
        switch (time) {
            case 0 : stringBuffer.append("zero ");break;
            case 1 : stringBuffer.append("one ");break;
            case 2 : stringBuffer.append("two ");break;
            case 3 : stringBuffer.append("three ");break;
            case 4 : stringBuffer.append("four ");break;
            case 5 : stringBuffer.append("five ");break;
            case 6 : stringBuffer.append("six ");break;
            case 7 : stringBuffer.append("seven ");break;
            case 8 : stringBuffer.append("eight ");break;
            case 9 : stringBuffer.append("nine ");break;
            case 10 : stringBuffer.append("ten ");break;
            case 11 : stringBuffer.append("eleven ");break;
            case 12 : stringBuffer.append("twelve ");break;
            case 13 : stringBuffer.append("thirteen ");break;
            case 14 : stringBuffer.append("fourteen ");break;
            case 15 : stringBuffer.append("fifteen ");break;
            case 16 : stringBuffer.append("sixteen ");break;
            case 17 : stringBuffer.append("seventeen ");break;
            case 18 : stringBuffer.append("eighteen ");break;
            case 19 : stringBuffer.append("nineteen ");break;
            case 20 : stringBuffer.append("twenty ");break;
        }
    }

}
