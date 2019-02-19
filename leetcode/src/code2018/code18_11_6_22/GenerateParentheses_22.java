package code2018.code18_11_6_22;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zjg
 * <p> 2018/11/6 8:57 </p>
 */
public class GenerateParentheses_22 {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        get(n,n,result,"");
        return result;
    }

    public void get (int left, int right, List<String> strings, String path) {

        if (left == 0 && right == 0) {
            strings.add(path);
        } else {
            if (left != 0) {
                get(left-1, right, strings, path+"(");
            }
            if (right != 0 && left < right) {
                get(left, right-1, strings, path+")");
            }
        }

    }

}
