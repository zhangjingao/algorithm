package code18_7_10;

/**
 * @author zjg
 * @date 2018/7/10 21:54
 * @Description
 */
public class ValidParentheses {

    static char[][] chars = {{'{','}'},{'[',']'},{'(',')'}};

    int index = 0;

    public boolean isValid(String s) {
        char [] sChar = s.toCharArray();
        int length = sChar.length;
        char tmp;
        while (index < length) {

        }
        return true;
    }

    private char compare (char c) {
        for (int i = 0; i < chars.length; i++) {
            if (c == chars[i][0]) {
                return chars[i][1];
            }
        }
        return '*';
    }

    public static void main(String[] args) {
        System.out.println(new ValidParentheses().isValid("{[]}"));
    }
}
