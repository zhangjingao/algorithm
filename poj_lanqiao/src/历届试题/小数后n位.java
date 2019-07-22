package 历届试题;

import java.util.*;

/**
 * @author zjg
 * <p> 2019/3/21 21:09 </p>
 */
public class 小数后n位 {
    /*
        public static void main(String[] args) {
            Scanner sca = new Scanner(System.in);
            int a = sca.nextInt();
            int b = sca.nextInt();
            int n = sca.nextInt();
            sca.close();
            char[] beichushu = String.valueOf(a).toCharArray();
            StringBuilder result = new StringBuilder();
            StringBuilder temp = new StringBuilder();
            int index = 0;
            while (true) {
                if (index < beichushu.length) {
                    temp.append(beichushu[index]);
                } else {
                    temp.append(0);
                    if (result.indexOf(".") == -1) {
                        result.append(".");
                    } else {
                        int indexTemp = result.indexOf(".");
                        int len = result.length();
                        if (len - indexTemp -1 == n + 2) {
                            break;
                        }
                    }
                }
                index++;
                int beichushuTemp = Integer.valueOf(temp.toString());
                if (beichushuTemp > b) {
                    temp.delete(0,temp.length());
                    temp.append(beichushuTemp % b);
                    result.append(beichushuTemp / b);
                } else {
                    result.append(0);
                }
            }
            int len = result.length();
            System.out.println(result.substring(len - 3, len));
        }*/
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int n = input.nextInt();
        for (int i = 1; i < n; i++) {
            int mod = a % b;
            a = mod * 10;
        }
        for (int i = 0; i < 3; i++) {
            int mod = a % b;
            a = mod * 10;
            System.out.print(a / b);
        }
    }


}
