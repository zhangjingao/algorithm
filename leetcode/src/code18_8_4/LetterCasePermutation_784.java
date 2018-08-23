package code18_8_4;

import code18_7_28.LetterCombinationsofaPhoneNumber_code3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zjg
 * @date 2018/8/4 16:02
 * @Description
 */
public class LetterCasePermutation_784 {

    public List<String> letterCasePermutation(String S) {
        List<String> strings = new ArrayList<>();
        strings = change(0, S.toCharArray(), strings);
        //strings.forEach(System.out::println);
        return strings;
    }

    public List<String> change(int startIndex, char[] arr, List<String> strs) {
        if (startIndex == arr.length) {
            strs.add(new String(arr));
            return strs;
        }
        for (int i = startIndex; i < arr.length; i++) {
            if ((arr[i] >= 97 && arr[i] <= 122)) {
                change(i + 1, arr, strs);
                arr[i] = ((arr[i]+"").toUpperCase().charAt(0));
                change(i + 1, arr, strs);
                arr[i] = ((arr[i]+"").toLowerCase().charAt(0));
                return strs;
            } else if ((arr[i] >= 65 && arr[i] <= 90)) {
                change(i + 1, arr, strs);
                arr[i] = ((arr[i]+"").toLowerCase().charAt(0));
                change(i + 1, arr, strs);
                arr[i] = ((arr[i]+"").toUpperCase().charAt(0));
                return strs;
            }
        }
        strs.add(new String(arr));
        return strs;
    }

    public static void main(String[] args) {

        new LetterCasePermutation_784().letterCasePermutation("C");
    }
}
