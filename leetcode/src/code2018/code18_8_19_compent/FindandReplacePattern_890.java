package code2018.code18_8_19_compent;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zjg
 * @date 2018/8/19 9:52
 * @Description
 */
public class FindandReplacePattern_890 {

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();

        List<String> stringsTmp = new ArrayList<>();
        for (String word : words ) {
            StringBuilder thisValue = new StringBuilder();
            char [] charArr = word.toCharArray();
            for (char aCharArr : charArr) {
                thisValue.append(judgeExist(charArr, aCharArr));
            }
            stringsTmp.add(thisValue.toString());
        }

        StringBuilder patternValue = new StringBuilder();
        char [] charArr = pattern.toCharArray();
        for (char aCharArr : charArr) {
            patternValue.append(judgeExist(charArr, aCharArr));
        }

        for (int i = 0; i < stringsTmp.size(); i++) {
            if (stringsTmp.get(i).equals(patternValue.toString())) {
                result.add(words[i]);
            }
        }

        return result;
    }

    private int judgeExist (char[] chars, char c) {
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        new FindandReplacePattern_890().findAndReplacePattern(new String[]{"abc","deq","mee","aqq","dkd","ccc"},"abb");
    }

}
