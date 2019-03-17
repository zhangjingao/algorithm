package 基础练习;

import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/3/11 11:23 </p>
 */
public class Sine之舞 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        System.out.println(printfSN(n, n));
    }

    private static String printfSN(int n, int index) {
        if (index == 1) {
            return printfAn(1, 1, "")+"+"+n;
        }
        return "("+printfSN(n,index-1)+")"+printfAn(index,1,"")+"+"+(n - index + 1);
    }

    private static String printfAn (int n, int index, String str) {
        if (n == index) {
            return "sin("+index+")";
        }
        String operation = "-";
        if (index % 2 == 0) {
            operation = "+";
        }
        return str+"sin("+index+operation+printfAn(n, index + 1, str)+")";
    }

}
