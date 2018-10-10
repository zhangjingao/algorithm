package code18_9_22;

import java.util.Arrays;

/**
 * @author zjg
 * <p> 2018/9/22 16:42 </p>
 */
public class AssignCookies_455 {

    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);
        int gIndex = 0, sIndex = 0,result = 0;
        while (gIndex < g.length && sIndex < s.length) {
            if (g[gIndex] <= s[sIndex]) {
                sIndex++;
                gIndex++;
                result++;
            } else {
                sIndex++;
            }
        }

        return result;
    }
}
