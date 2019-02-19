package code2018.code18_8_18;

/**
 * @author zjg
 * @date 2018/8/18 14:47
 * @Description
 */
public class RomantoInteger_13 {

    public int romanToInt(String s) {
        int result = 0;
        String[][] arr = {{"I", "1"}, {"V", "5"}, {"X", "10"}, {"L", "50"}, {"C", "100"}, {"D", "500"}, {"M", "1000"}};
        char[] sChars = s.toCharArray();
        result = count(sChars, arr);
        return result;
    }


    /**
     * 除带4，9的正常的数，从大到小的数
     */
    private int count(char[] chars, String[][] arr) {
        int result = 0;
        for (int i = 0; i < chars.length; i++) {
            int thisValue = 0;
            int nextValue = 0;
            for (int j = 0; j < arr.length; j++) {
                char thisChar = arr[j][0].charAt(0);
                if (chars[i] == thisChar) {
                    thisValue = Integer.parseInt(arr[j][1]);
                }
                if (i + 1 < chars.length && chars[i+1] == thisChar) {
                    nextValue = Integer.parseInt(arr[j][1]);
                }
            }
            if (thisValue < nextValue) {
                result += nextValue - thisValue;
                i++;// 跳过下一个数
            } else {
                result += thisValue;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(
                new RomantoInteger_13().romanToInt("MCMXCIV")
        );
    }

}
