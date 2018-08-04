package 基础练习;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author zjg
 * @date 2018/3/27 15:20
 * @Description
 */
public class 完美的代价 {

    private static int count = 0;

    /*public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        String str = sca.next();
        char[] chars = str.toCharArray();
       changeLoca(chars,0,chars.length-1);
        System.out.println(count);
    }

    private static void changeLoca (char[] array ,int startIndex,int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }
        boolean temp = false;
        for (int i = endIndex; i > startIndex; i--) {
            if (array[startIndex] == array[i]&&startIndex == endIndex-1) { //当两者相等，并且位置相邻，不交换
                temp = true;
                return;
            }
            if (array[startIndex] == array[i]) {
                temp = true;
                change(array,i,endIndex);
                changeLoca(array,++startIndex,--endIndex);
                break;
            }
        }
        if (!temp) {
            System.out.println("Impossable");
        }
    }

    private static void change (char [] chars,int start,int end) {
        char temp = chars[start];
        for (int i = start; i < end; i++) {
            chars[i] = chars[i+1];
            count++;
        }
        chars[end] = temp;
    }*/
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(reader.readLine());
        char[] s = reader.readLine().toCharArray();
        reader.close();
        if (palindrome(s, 0, len - 1)) {
            System.out.println(cnt);
        } else {
            System.out.println("Impossible");
        }
    }

    private static int cnt = 0;
    private static boolean haveMiddle = false;

    private static boolean palindrome(char[] s, int a, int b) {
        if (b <= a) {
            return true;
        }
        // 从最后的位置开始遍历字符串
        for (int i = b; i > a; i--) {
            if (s[a] == s[i]) {
                exchangeTo(s, i, b);
                cnt += getExchangeTimes(i, b);
                return palindrome(s, a + 1, b - 1);
            }
        }
        // 如果没有出现过中间字符
        if (!haveMiddle) {
            haveMiddle = true;
            cnt += getExchangeTimes(a, s.length / 2);
            return palindrome(s, a + 1, b);
        }
        return false;
    }

    private static int getExchangeTimes(int a, int b) {
        return b - a;
    }

    private static void exchangeTo(char[] s, int a, int b) {
        char temp = s[a];
        for (int i = a; i < b; i++) {
            s[i] = s[i + 1];
        }
        s[b] = temp;
    }
}