package 算法训练;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/3/23 15:22 </p>
 */
public class 子串统计 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int l = sca.nextInt();
        String s = sca.next();

        Map<String , Integer> sum = new HashMap<>();
        int len = s.length();
        for (int i = l; i < len; i++) {
            for (int j = 0; j < len - i; j++) {
                String strTemp = s.substring(j, j+i);
                if (sum.containsKey(strTemp)) {
                    int lastLen = sum.get(strTemp);
                    sum.replace(strTemp, lastLen, lastLen+1);
                } else {
                    sum.put(strTemp, 1);
                }
            }

        }
        int maxLen = 0;
        String maxStr = "";
        for (Map.Entry<String, Integer> sumtemp : sum.entrySet()) {
            if (sumtemp.getValue() == maxLen && sumtemp.getKey().length() > maxStr.length()) {
                maxStr = sumtemp.getKey();
            } else if (sumtemp.getValue() > maxLen) {
                maxLen = sumtemp.getValue();
                maxStr = sumtemp.getKey();
            }
        }
        System.out.println(maxStr);
    }

}
