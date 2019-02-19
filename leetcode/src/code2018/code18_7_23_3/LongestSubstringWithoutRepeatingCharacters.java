package code2018.code18_7_23_3;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zjg
 * @date 2018/7/23 20:39
 * @Description
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        int sLen = s.length(),matchLen = 0;
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0, j = 0; j < sLen; j++) {
            //如果存在重复字符，将窗口滑到重复字符的地方
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)),i);
            }
            matchLen = Math.max(matchLen,j-i+1);
            map.put(s.charAt(j),j+1);
        }
        return matchLen;
    }


    public static void main(String[] args) {
        System.out.println(new LongestSubstringWithoutRepeatingCharacters().
                lengthOfLongestSubstring("bbbbb"));
    }
}
