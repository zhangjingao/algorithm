package code2018.code18_7_28;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zjg
 * @date 2018/7/28 16:43
 * @Description
 */
public class LetterCombinationsofaPhoneNumber_code3 {

    public List<String> letterCombinations(String digits) {
        List<String> strings = new ArrayList<>();
        if (digits.length() == 0) {
            return strings;
        }
        String[] dict = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        //选中的字母组合
        String[] arr = new String[digits.length()];
        for (int i = 0; i < digits.length(); i++) {
            arr[i] = dict[digits.charAt(i) - '0' - 2];
        }
        int startStr = 0;//循环下标
        group(arr, startStr, "",strings);
        return strings;
    }

    private static String group(String[] arr, int startStr, String str, List<String> strings) {
        char[] chars1 = arr[startStr].toCharArray();
        for (int j = 0; j < chars1.length; j++) {
            if (startStr == arr.length - 1) {
                strings.add(str + chars1[j]);
            } else {
                group(arr, startStr+1, str + chars1[j],strings);
            }
        }
        return str;
    }

    public static void main(String[] args) {
        new LetterCombinationsofaPhoneNumber_code3().letterCombinations("");
        //strings.forEach(System.out::println);

    }

}
