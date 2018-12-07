package code18_11_10;

import java.util.Arrays;

/**
 * @author zjg
 * <p> 2018/11/10 14:46 </p>
 */
public class ValidAnagram_242 {

    public boolean isAnagram(String s, String t) {
        int slen = s.length();
        int tlen = t.length();
        if (slen != tlen) {
            return false;
        } else {
            char[] schars = s.toCharArray();
            char[] tchars = t.toCharArray();
            Arrays.sort(schars);
            Arrays.sort(tchars);
            for (int i = 0; i < slen; i++) {
                if (schars[i] != tchars[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    /*
     leetcode代码
            public boolean isAnagram(String s, String t) {
        int[] freqS = new int[26];
        int[] freqT = new int[26];
        for (char ch : s.toCharArray()) {
            freqS[ch - 'a'] += 1;
        }

        for (char ch : t.toCharArray()) {
            freqT[ch - 'a'] += 1;
        }
        for (int i = 0; i < 26; i ++) {
            if (freqS[i] != freqT[i]) {
                return false;
            }
        }
        return true;
    }
    */


    public static void main(String[] args) {
        System.out.println(
                new ValidAnagram_242().isAnagram("aacc","ccac")
        );
    }

}
