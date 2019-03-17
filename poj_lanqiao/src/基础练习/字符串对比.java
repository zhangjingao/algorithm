package 基础练习;

import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/3/12 20:15 </p>
 */
public class 字符串对比 {

    public static void main(String[] args) {
        Scanner  sca = new Scanner(System.in);
        String strA = sca.next();
        String strB = sca.next();

        if (strA.length() != strB.length()) {
            System.out.println(1);
        } else if (strA.equals(strB)) {
            System.out.println(2);
        } else {
            int len = strA.length();
            for (int i = 0; i < len; i++) {
                char charA = strA.charAt(i);
                char charB = strB.charAt(i);
                if (charA != charB && charA + 32 != charB && charA - 32 != charB) {
                    System.out.println(4);
                    return;
                }
            }
            System.out.println(3);
        }


    }

}
