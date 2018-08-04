package code18_7_26;

/**
 * @author zjg
 * @date 2018/7/26 20:32
 * @Description
 */
public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        //如果s为""，默认为0，匹配到的为""，如果s长度大于0，就默认长度为1，匹配到的为第一个字符
        int maxLen = 0;
        String maxValue = "";
        if (s.length() > 0) {
            maxLen = 1;
            maxValue = s.charAt(0)+"";
        }
        //暴破法
        /*for (int i = 0; i < s.length(); i++) {
            for (int j = s.length()-1; j > i; j--) {
                if (judge(s,i,j)) {
                    if (j-i+1 > maxLen) {
                        maxLen = j-i+1;
                        maxValue = s.substring(i, j + 1);
                    }
                    break;
                }
            }
        }*/
        //降序长度字串法
        for (int i = s.length(); i > 0; i--) {
            for (int j = 0; j < s.length()-i; j++) {
                if (judge(s,j,j+i)) {
                    return maxValue = s.substring(j, j+i+1);
                }
            }
        }
        return maxValue;
    }

    private boolean judge (String s, int startIndex, int endIndex) {
        char[] chars = s.toCharArray();
        for (int i = startIndex; i <= (endIndex+startIndex)/2; i++) {
            if (chars[i] != chars[endIndex-i+startIndex]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(
                new LongestPalindromicSubstring().longestPalindrome("cbbd"));
    }

}
