package 算法训练;

import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/3/23 20:11 </p>
 */
public class s01串 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        String str = "0";
        for (int i = 0; i < n; i++) {
            StringBuilder strTemp = new StringBuilder();
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '0') {
                    strTemp.append("1");
                } else if (str.charAt(j) == '1') {
                    strTemp.append("01");
                }
            }
            str = strTemp.toString();
        }
        System.out.println(str);
    }
    
    

}
