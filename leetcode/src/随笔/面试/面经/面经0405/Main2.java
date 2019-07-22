package 随笔.面试.面经.面经0405;

import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/4/5 16:23 </p>
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while (sca.hasNext()) {
            String temp = sca.next();
            changeLocation(temp);
        }

    }

    //AkleBiCeilD
    private static void changeLocation(String temp) {
        int len = temp.length();
        int bigCharcIndex = len;
        while (--bigCharcIndex >= 0) {
            char c = temp.charAt(bigCharcIndex);
            //如果是大写字母就不管
            if (c >= 65 && c < 91) {
                continue;
            } else {        //如果是小写字母，就往前找一个大写字母，一次往前替换    AkleBiCeilD
                System.out.println(c+" 1");
                int smallCharcIndexTemp = bigCharcIndex-1;
                int smallCharcIndex = smallCharcIndexTemp;
                while (smallCharcIndex > 0) {
                    char cSmall = temp.charAt(smallCharcIndex);
                    //如果还是小写字母，继续向前
                    if (cSmall >= 97 && cSmall < 123) {
                        smallCharcIndex--;
                        continue;
                    }
                    //如果是大写字母，将后面的小写字母提前，然后就此跳出
                    while (smallCharcIndex <= smallCharcIndexTemp) {
                        char tempC = temp.charAt(smallCharcIndex);
                        char tempD = temp.charAt(smallCharcIndex+1);
                        temp = temp.substring(0, smallCharcIndex)+tempD+tempC+temp.substring(smallCharcIndex+2,len);
                        smallCharcIndex++;
                    }
                    break;
                }
            }
        }
        System.out.println(temp);

    }

}
