package 基础练习;

import java.util.Scanner;

/**
 * @author zjg
 * @date 2018/3/23 21:34
 * @Description
 */
public class 高精度加法 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String a = sca.next();
        String b = sca.next();
        int [] arrayA = new int[a.length()];
        int [] arrayB = new int[b.length()];
        char [] charsA = a.toCharArray();
        char [] charsB = b.toCharArray();
        int maxLen = a.length();
        int minLen = b.length();
        if (b.length()>a.length()) {
            maxLen = b.length();
            minLen = a.length();
        }
        int [] c = new int[maxLen+1];
        for (int i=arrayA.length-1;i>=0;i--) {
            arrayA[arrayA.length-i-1] = charsA[i]-'0';
        }
        for (int i=arrayB.length-1;i>=0;i--) {
            arrayB[arrayB.length-i-1] = charsB[i]-'0';
        }
        int temp = 0;
        for (int i=0;i<minLen;i++) {
            temp = arrayA[i]+arrayB[i]+temp;
            if (temp>=10) {
                c[i] = temp-10;
                temp = 1;
            } else {
                c[i] =temp;
                temp = 0;
            }
        }
        if (minLen == a.length()&&minLen == b.length()) {
            c[minLen] = temp;
        } else if (minLen==a.length()) {
            temp = temp+arrayB[minLen];
            if (temp>=10) {
                c[minLen] = temp-10;
                temp = 1;
            } else {
                c[minLen] = temp;
                temp = 0;
            }
            for (int i=minLen+1;i<b.length();i++) {
                temp = arrayB[i]+temp;
                if (temp>=10) {
                    c[i] = temp-10;
                    temp = 1;
                } else {
                    c[i] =temp;
                    temp = 0;
                }
            }
        } else {
            temp = temp+arrayA[minLen];
            if (temp>=10) {
                c[minLen] = temp-10;
                temp = 1;
            } else {
                c[minLen] =temp;
                temp = 0;
            }
            for (int i=minLen+1;i<a.length();i++) {
                temp = arrayA[i]+temp;
                if (temp>=10) {
                    c[i] = temp-10;
                    temp = 1;
                } else {
                    c[i] =temp;
                    temp = 0;
                }
            }
        }
        if (temp==1) {
            c[maxLen] = 1;
        }
        if (c[maxLen]!=0) {
            System.out.print(c[maxLen]);
        }
        for (int i=maxLen-1;i>=0;i--) {
            System.out.print(c[i]);
        }
    }
}
