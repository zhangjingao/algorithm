package code2019.code19_7.code24_20;


import java.util.HashMap;
import java.util.Stack;

/**
 * @author zjg
 * @ClassName ValidParentheses
 * @Description TODO
 * @Date 2019/7/24 15:59
 **/
public class ValidParentheses {



    public boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        HashMap<Character, Character> hashMap = new HashMap<>();
        hashMap.put('{','}');
        hashMap.put('[',']');
        hashMap.put('(',')');
        hashMap.put('}','{');
        hashMap.put(']','[');
        hashMap.put(')','(');
        Stack<Character> stackInit = new Stack<>();
        Stack<Character> stackResult = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stackInit.push(s.charAt(i));
        }
        while (!stackInit.empty()) {
            char tmp = stackInit.pop();
            if (!stackResult.empty()) {
                Character compare = hashMap.get(tmp);
                if (compare != null && compare.charValue() == stackResult.peek()) {
                    stackResult.pop();
                } else {
                    stackResult.push(tmp);
                }
            } else {
                stackResult.push(tmp);
            }
        }
        return stackResult.empty();
    }

}