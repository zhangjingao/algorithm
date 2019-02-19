package code2018.code18_7_9_290;

/**
 * @author zjg
 * @date 2018/7/9 15:59
 *
 */
public class WordPattern {

    public boolean wordPattern(String pattern, String str) {

        String[] strs = str.split(" ");
        char[] patts = pattern.toCharArray();


        if (patts.length > strs.length || patts.length == 0) {
            return false;
        }
        for (int i = 0; i < patts.length; i++) {
            for (int j = i+1; j < strs.length; j++) {
                if (patts.length <= j) {
                    return false;
                }
                if  (patts[i] == patts[j] && !strs[i].equals(strs[j]) )  {
                    return false;
                }
                if (patts[i] != patts[j] && strs[i].equals(strs[j]) ) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(new WordPattern().wordPattern("aaaa","aaa bbb ccc ddd"));
    }
}
