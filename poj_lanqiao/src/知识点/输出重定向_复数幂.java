package 知识点;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * @author zjg
 * @date 2018/5/19 13:18
 * @Description
 */
public class 输出重定向_复数幂 {

    public static void main(String[] args) throws FileNotFoundException {
        int n = 123456;
        long a = 2,b = 3; //(2+3i)^n   -387842047+215089152i
        int nTemp = 2;
        long aTemp = 0;
        PrintStream ps = null;
        try {
            ps = new PrintStream("log.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.setOut(ps);
        while (nTemp <= n) {
            aTemp = a;
            a = a*a - b*b;
            b = aTemp*b*2;
            nTemp *= 2;
        }
        if (b > 0) {
            System.out.println(a+"+"+b+"i");
        } else {
            System.out.println(a+""+b+"i");
        }
    }
}
