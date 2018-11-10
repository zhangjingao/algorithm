package code18_10_20;

/**
 * @author zjg
 * <p> 2018/10/20 15:32 </p>
 */
public class StringCompression_443 {

    public int compress(char[] chars) {
        if (chars.length == 0) return 0;

        int mark = 0;
        int write = 0;
        for (int i = 0; i < chars.length; i++) {
            if (i + 1 == chars.length || chars[i] != chars[i + 1]) {
                chars[write] = chars[mark];
                write++;
                if (mark < i) {
                    for (char a : ("" + (i - mark + 1)).toCharArray())
                        chars[write++] = a;
                }
                mark = i + 1;
            }
        }
        return write;
    }

    public static void main(String[] args) {
        System.out.println(
                new StringCompression_443().compress(new char[]{'a', 'b', 'c'})
//        new StringCompression_443().compress(new char[]{'a','a','b','b','c','c','c'})
        );
    }

}
