package code2019.code19_5月.code12_118;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zjg
 * <p> 2019/5/12 7:55 </p>
 */
public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>(numRows);
        if (numRows == 0) {
            return result;
        }
        List<Integer> list1 = new ArrayList<>(1);
        list1.add(1);
        result.add(list1);
        for (int i = 1; i < numRows; i++) {
            List<Integer> list = new ArrayList<>(i + 1);
            List<Integer> last = result.get(i - 1);
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                } else {
                    list.add(last.get(j-1)+last.get(j));
                }
            }
            result.add(list);
        }
        return result;
    }

}
